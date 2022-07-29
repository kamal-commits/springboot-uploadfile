package com.example.springbootuploadfile.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbootuploadfile.models.User;
import com.example.springbootuploadfile.repositories.UserRepository;

@Service
public class UserService {
  @Autowired
  private UserRepository userRepo;

  public User createUser(User user) {
    System.out.println("USER BODY : " + user);
    return userRepo.save(user);
  }

}
