#!/usr/bin/env bash
set -e

if ./mvnw test > test_output.log 2>&1; then
    PASSED=$(grep -oP 'Tests run: \K\d+' test_output.log | head -1 || echo "3")
    echo "TESTS: ${PASSED}/${PASSED}"
    exit 0
else
    echo "TESTS: 0/3"
    exit 1
fi