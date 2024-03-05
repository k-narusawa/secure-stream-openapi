#!/bin/bash

rm -rf kotlin-spring
rm -rf typescript

docker run --rm \
    -v $PWD:/local openapitools/openapi-generator-cli:v7.2.0 generate \
    -i /local/src/openapi.yml \
    -g kotlin-spring \
    --additional-properties useTags=true \
    --additional-properties useSpringBoot3=true \
    --additional-properties interfaceOnly=true \
    --additional-properties gradleBuildFile=false \
    --additional-properties documentationProvider=none \
    --additional-properties interfaceOnly=true \
    --additional-properties enumPropertyNaming=UPPERCASE \
    -o /local/kotlin-spring

docker run --rm \
    -v $PWD:/local openapitools/openapi-generator-cli:v7.2.0 generate \
    -i /local/src/openapi.yml \
    -g typescript-axios \
    --additional-properties platform=node \
    -o /local/typescript

rm -rf kotlin-spring/target