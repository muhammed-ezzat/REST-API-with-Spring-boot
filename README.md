# REST-API-with-Spring-boot

## Steps to Setup

-  Clone the application

git clone git@github.com:muhammed-ezzat/REST-API-with-Spring-boot.git

- Open Mongodb database

in terminal print "mongod"

- Build and run the app using maven

mvn package

java -jar target/REST-API-with-Spring-boot-0.0.1-SNAPSHOT.jar

## RESTful API Server

### List all users
GET /api/v1/users                 

### Add user to database
POST /api/v1/users            

### Retrieve user information
GET /api/v1/users/{userId}    

### change user information
PUT /api/v1/users/{userId}      

### delete user form database
DELETE /api/v1/users/{userId}    

