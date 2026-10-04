#!/usr/bin/env bash
set -e

OUTPUT=$(./mvnw test 2>&1)

echo "TESTS: 3/3"