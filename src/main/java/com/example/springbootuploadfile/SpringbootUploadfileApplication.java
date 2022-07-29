package com.example.springbootuploadfile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
@EnableMongoAuditing
public class SpringbootUploadfileApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringbootUploadfileApplication.class, args);
  }

}
