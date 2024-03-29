# Web services project with Spring Boot e JPA/Hibernate

[![Website](https://img.shields.io/website?down_message=offline&label=Application%20Status&up_message=online&url=https%3A%2F%2Fjavaspring.fly.dev%2Fhealth)](https://javaspring.fly.dev/health)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellowgreen.svg)](https://github.com/detds/project-spring-java-17/blob/main/LICENSE)

A simple implementation of a **backend** shopping system created with **Spring Boot** framework and **Java**, using 
**Spring Data JPA/Hibernate** to interact with **PostgreSQL database**.

This project was deployed to Fly.io and can be accessed at this link: https://javaspring.fly.dev.

In this app, we can **create**, **read**, **update** or **delete** users (CRUD). We can also read products, orders and
categories.

This project also contains: **exception handling** (findById, delete and update methods) and **one-to-one**, 
**one-to-many** and **many-to-many associations**.

## Technologies used

- Java 17
- Spring Boot 2 (with Spring Web MVC, Spring Data JPA)
- Maven
- H2 Database
- PostgreSQL Database
- Postman
- Deploy app to Heroku and Fly.io

## Domain Model

![Domain Model image](https://github.com/detds/project-spring-java-17/blob/main/assets/DomainModel.png)

## Summary of HTTP methods and description of its actions

| Methods | Urls            | Actions                |
|---------|-----------------|------------------------|
| POST    | /users          | create new User        |
| GET     | /users          | find all Users         |
| GET     | /users/:id      | find a User by :id     |
| PUT     | /users/:id      | update a User by :id   |
| DELETE  | /users/:id      | delete a User by :id   |
| GET     | /products       | find all Products      |
| GET     | /products/:id   | find a Product by :id  |
| GET     | /orders         | find all Orders        |
| GET     | /orders/:id     | find a Order by :id    |
| GET     | /categories     | find all Categories    |
| GET     | /categories/:id | find a Category by :id |

## Running

The Spring profile is preconfigured for testing that uses the H2-database to save data in memory.

> (To run this project using **PostgreSQL database**, you need to configure *application-dev.properties* file properly
> and set Spring profile to "dev" in *application.properties*. You can find these files in this
> link: https://github.com/detds/project-spring-java-17/tree/main/src/main/resources)

To run this project follow these steps:

1. Clone the repository to your workspace folder:

    ```
    $ git clone https://github.com/detds/project-spring-java-17
    ```

2. Navigate to the repository folder:

    ```
    $ cd project-spring-java-17
    ```

3. Run app:

    ```
    $ ./mvnw spring-boot:run
    ```

4. Open browser at http://localhost:8080/ or http://localhost:8080/h2-console to use H2-console.

## Author

Dennis Teles

LinkedIn