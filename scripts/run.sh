#!/usr/bin/env bash
set -e

PORT="${PORT:-8080}"

echo "Starting Spring Boot application on port $PORT..."

./gradlew bootRun --args="--server.port=$PORT"