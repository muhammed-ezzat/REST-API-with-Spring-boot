package org.ezzat.Springboot.RestApi.api;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String > {

}
