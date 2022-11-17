# Web services project with Spring Boot e JPA/Hibernate

A simple implementation of a backend shopping system created with **Spring Boot** framework and **Java**, using **Spring Data JPA/Hibernate** to interact with **PostgreSQL database**.

In this app, we can **create**, **read**, **update** or **delete** users (CRUD).

This project also contains: **exception handling** (findById, delete and update methods) and **one-to-one**, **one-to-many** and **many-to-many associations**.




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

 Methods | Urls            | Actions 
 ------- | --------------- | ------- 
 POST    | /users          | create new User 
 GET     | /users          | find all Users 
 GET     | /users/:id      | find a User by :id 
 PUT     | /users/:id      | update a User by :id 
 DELETE  | /users/:id      | delete a User by :id 
 GET     | /products       | find all Products 
 GET     | /products/:id   | find a Product by :id 
 GET     | /orders         | find all Orders 
 GET     | /orders/:id     | find a Order by :id 
 GET     | /categories     | find all Categories 
 GET     | /categories/:id | find a Category by :id 
 
 
 
 ## Author
 
 Dennis Teles
 
 LinkedIn
