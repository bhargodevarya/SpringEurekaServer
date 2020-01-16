#!/usr/bin/env bash

echo "Starting the script to build"
DOCKER_HUB_ID=$1
DOCKER_HUB_PWD=$2
ORIGIN_BRANCH=$3
TARGET_BRANCH=$4
COMMIT_ID=$5

./gradlew check

echo "Source branch is $ORIGIN_BRANCH and target branch is $TARGET_BRANCH"

if [ "$ORIGIN_BRANCH" == "master" ]; then
  ./gradlew :EurekaServer:bootJar
  ./dockerpush.sh "$DOCKER_HUB_ID" "$DOCKER_HUB_PWD" "$COMMIT_ID"
fi

echo "Script finished"
