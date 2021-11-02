# REST-API-with-Spring-boot

## Steps to Setup

-  Clone the application

https://github.com/givanthak/spring-boot-rest-api-tutorial.git

- Open Mongodb database

in terminal print "mongod"

- Build and run the app using maven

mvn package

java -jar target/REST-API-with-Spring-boot-0.0.1-SNAPSHOT.jar

## RESTful API Server

### GET /api/v1/users                 // list all users

### POST /api/v1/users                // add user to database

### GET /api/v1/users/{userId}        // retrieve user informaton

### PUT /api/v1/users/{userId}        // change user information

### DELETE /api/v1/users/{userId}     // delete user form database

