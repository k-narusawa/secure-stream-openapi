#!/bin/bash

rm -rf kotlin-spring
rm -rf typescript

docker run --rm \
    -v $PWD:/local openapitools/openapi-generator-cli:v7.2.0 generate \
    -i /local/src/openapi.yml \
    -g kotlin-spring \
    --additional-properties apiSuffix=SecureStream \
    --additional-properties useSpringBoot3=true \
    --additional-properties interfaceOnly=true \
    -o /local/kotlin-spring

docker run --rm \
    -v $PWD:/local openapitools/openapi-generator-cli:v7.2.0 generate \
    -i /local/src/openapi.yml \
    -g typescript-axios \
    --additional-properties platform=node \
    -o /local/typescript