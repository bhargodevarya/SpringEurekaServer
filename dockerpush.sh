#!/usr/bin/env bash

echo "Push the image to docker hub"

DOCKER_HUB_ID=$1
DOCKER_HUB_PWD=$2
COMMIT_ID=$3
tag="bhargodevarya/repo:eureka-"

echo "starting the script"
#commit=$(git rev-parse HEAD)
tag+="${COMMIT:0:6}"

echo "$tag"

docker image build -t "$tag" ./EurekaServer
docker login -u "$DOCKER_HUB_ID" -p "$DOCKER_HUB_PWD"
docker image push "$tag"
docker logout

echo "Script finished"