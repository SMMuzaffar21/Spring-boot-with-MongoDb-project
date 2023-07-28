package com.example.demo.repository;

import com.example.demo.models.Post;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface PostRepository extends MongoRepository<Post, String> {
}
