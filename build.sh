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
  tag="bhargodevarya/repo:eureka-"
  echo "starting the script"
  tag+="${COMMIT:0:6}"

  echo "Creating image with tha tage $tag"

  docker image build -t "$tag" ./EurekaServer
  docker login -u "$DOCKER_HUB_ID" -p "$DOCKER_HUB_PWD"
  docker image push "$tag"
  docker logout
fi

echo "Script finished"
