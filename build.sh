#!/usr/bin/env bash

echo "Starting the script to build"
DOCKER_HUB_ID=$1
DOCKER_HUB_PWD=$2
ORIGIN_BRANCH=$3
TARGET_BRANCH=$4


./gradlew check

currentBranch=$(git rev-parse --abbrev-ref HEAD)

echo "origin branch is $ORIGIN_BRANCH and target branch is $TARGET_BRANCH"

if [[ "$currentBranch" == "master" ]]; then
  echo "on master branch"
  ./gradlew :EurekaServer:bootJar
  ./dockerpush.sh "$DOCKER_HUB_ID" "$DOCKER_HUB_PWD"
else
  echo "on branch $currentBranch"
fi

echo "Script finished"
