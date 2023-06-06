package com.danielnunes.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.danielnunes.mongodb.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
