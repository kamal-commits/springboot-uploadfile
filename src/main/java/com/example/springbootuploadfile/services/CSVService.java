package com.example.springbootuploadfile.services;

import java.io.IOException;
import java.util.List;

import org.apache.commons.csv.CSVRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.springbootuploadfile.helper.CSVHelper;
import com.example.springbootuploadfile.models.User;
import com.example.springbootuploadfile.repositories.UserRepository;

@Service
public class CSVService {
  @Autowired
  UserRepository userRepo;

  // public void save(MultipartFile file) {
  // try {
  // List<User> tutorials = CSVHelper.csvToUsers(file.getInputStream());
  // userRepo.saveAll(tutorials);
  // } catch (IOException e) {
  // throw new RuntimeException("fail to store csv data: " + e.getMessage());
  // }
  // }

  public void save(MultipartFile file) {
    try {
      Iterable<CSVRecord> users = CSVHelper.csvToUsers(file.getInputStream());

      for (CSVRecord user : users) {
        User userDetail = new User(
            user.get("firstName"),
            user.get("lastName"),
            user.get("email"),
            user.get("password")

        );
        System.out.println("??????------ Loop-----??????");
        User saved = userRepo.save(userDetail);
        System.out.println("saved " + saved.getId());

      }
      // userRepo.saveAll(tutorials);
    } catch (IOException e) {
      throw new RuntimeException("fail to store csv data: " + e.getMessage());
    }
  }

  public List<User> getAllUsers() {
    return userRepo.findAll();
  }
}