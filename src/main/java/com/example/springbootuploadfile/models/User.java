package com.example.springbootuploadfile.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "users")
@Data

public class User {

  @Id
  private String id;

  private String firstName;

  private String lastName;

  private String email;

  private String password;

  public User(String firstName, String lastName, String email, String password) {

    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.password = password;
  }

}
