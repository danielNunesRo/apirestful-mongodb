package com.danielnunes.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.danielnunes.mongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
	
	
}
