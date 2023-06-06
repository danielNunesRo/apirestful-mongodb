package com.danielnunes.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.danielnunes.mongodb.domain.Post;

public interface PostRepository extends MongoRepository<Post, String> {

}
