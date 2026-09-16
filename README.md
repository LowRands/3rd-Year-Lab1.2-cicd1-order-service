# CICD-1 Purchase Order Service

## Overview

The Purchase Order Service is a Spring Boot microservice responsible for managing customer orders.

This service provides REST endpoints for creating and retrieving purchase orders. For Lab 1, all order data is stored in an in-memory Java List and is lost when the application is restarted.

## Technology Stack

- Java 21
- Spring Boot
- Maven
- Spring Web
- Spring Validation
- Lombok
- Springdoc OpenAPI (Swagger UI)

## Service Configuration
| Property | Value |
|-----------|---------|
| Service Name | catalog-service |
| Port | 8082 |

Application configuration:

spring.application.name=catalog-service
server.port=8082
