# Spring Boot REST API Demo

A simple CRUD-based RESTful API built with **Spring Boot** that connects to a **MySQL** database.  
This project demonstrates how to create, read, update, and delete `Book` entities using **Spring Data JPA**.  
It also includes a **Postman collection** to help you quickly test the endpoints.

---

## Table of Contents

1. [Features](#features)
2. [Technologies Used](#technologies-used)
3. [Prerequisites](#prerequisites)
4. [Getting Started](#getting-started)
5. [Database Configuration](#database-configuration)
6. [Postman Collection](#postman-collection)
7. [Project Structure](#project-structure)
8. [Contact & Blog](#contact--blog)

---

## Features

- **CRUD Operations** for managing `Book` entities
- **Spring Data JPA** for easy database interaction
- **MySQL** running on Docker (local DB optional if you prefer)
- **REST Endpoints** that can be tested with Postman or any REST client

---

## Technologies Used

- **Java 17** (or compatible version)
- **Spring Boot 3.x** (Web, Data JPA)
- **MySQL** (via Docker)
- **Maven** (build tool)
- **Postman** (for testing; optional)

---

## Prerequisites

- **Java** (version 17+ recommended)
- **Maven** (to build and run the project)
- **Docker** (if you want to run MySQL in a container)
- **Git** (for cloning this repository)

---

## Getting Started

1. **Clone the Repository**
   ```bash
   git clone https://github.com/sahandilshan/spring-boot-rest-api-demo.git
   cd spring-boot-rest-api-demo
   ```
2. Run MySQL in Docker (Optional) If you don’t have MySQL installed locally, spin up a container:
   ```bash
   docker run -d \
    --name dev-mysql \
    -e MYSQL_ROOT_PASSWORD=secret \
    -e MYSQL_DATABASE=mydatabase \
    -p 3306:3306 \
    mysql:8
   ```
3. Configure Application Properties
Check src/main/resources/application.properties to ensure the database URL, username, and password match your MySQL instance.
4. Build and Run the Application
   ```bash
   mvn spring-boot:run
   ```
The application will start on http://localhost:8080.

## Database Configuration
In application.properties, you can customize the following properties:
```bash
spring.datasource.url=jdbc:mysql://localhost:3306/mydatabase
spring.datasource.username=root
spring.datasource.password=secret

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

## Postman Collection
A Postman collection is provided in the src/main/resources folder:
Book API.postman_collection.json

### How to Use
1. Open Postman and click Import. 
2. Choose the file Book API.postman_collection.json. 
3. You’ll see the collection with pre-configured endpoints under Collections in Postman. 
4. Make sure your server is running locally on port 8080. 
5. Send requests to create, get, update, or delete book records!

## Project Structure
The project is structured as follows:
```scss
spring-boot-rest-api-demo
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.example.springbootrestapi
│   │   │       ├── SpringBootRestApiApplication.java
│   │   │       ├── controller        # RestControllers (e.g., BookController)
│   │   │       ├── entity            # JPA Entities (e.g., Book)
│   │   │       ├── repository        # JPA Repositories (e.g., BookRepository)
│   │   │       └── service           # Services (e.g., BookService)
│   │   └── resources
│   │       ├── application.properties
│   │       └── Book API.postman_collection.json
├── pom.xml
└── README.md
```

## Contact & Blog
* **Author:** Sahan Dilshan 
* **Blog Post:** For a detailed walkthrough of this project, check out the blog post explaining the setup, structure, and how each class works. 
* **Contributions:** Feel free to fork this repo, open issues, or submit pull requests!


