package com.example.springbootuploadfile.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.springbootuploadfile.models.User;

public interface UserRepository extends MongoRepository<User, Long> {
  @Query(value = "{id:?0}")
  User findUserById(String id);
}
