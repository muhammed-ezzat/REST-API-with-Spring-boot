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

// list all users
### GET /api/v1/users   

// add user to database
### POST /api/v1/users  

// retrieve user informaton
### GET /api/v1/users/{userId}   

// change user information
### PUT /api/v1/users/{userId}    
 
// delete user form database

### DELETE /api/v1/users/{userId} 
