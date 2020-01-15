#!/usr/bin/env bash

echo "Starting the script to build"
DOCKER_HUB_ID=$1
DOCKER_HUB_PWD=$2

./gradlew check

currentBranch=$(git rev-parse --abbrev-ref HEAD)

if [[ "$currentBranch" == "master" ]]; then
  echo "on master branch"
  ./gradlew :EurekaServer:bootJar
  ./dockerpush.sh "$DOCKER_HUB_ID" "$DOCKER_HUB_PWD"
else
  echo "on branch $currentBranch"
fi

echo "Script finished"
