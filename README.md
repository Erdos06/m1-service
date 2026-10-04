# M1 Spring Boot Service

A simple HTTP web service built with Java and Spring Boot.

## Description

This project is a RESTful HTTP service created for Milestone 1. It provides a health check endpoint, dynamic port binding, and automated testing scripts according to the assignment specification.

## How to Run

To start the service, execute the startup script from the root directory:

./scripts/run.sh

### Port

By default, the service listens on port 8080. You can specify a custom port using the PORT environment variable:

PORT=9090 ./scripts/run.sh

## How to Test

To run the automated test suite and check the service status, run:

./scripts/test.sh

The script will execute all JUnit tests and output the total count in the required TESTS format.

## Endpoints

- GET /healthz - Returns 200 OK with body OK. Response time is under 1 second and performs no database queries.