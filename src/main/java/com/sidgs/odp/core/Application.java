package com.sidgs.odp.core;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.*;

@EnableAutoConfiguration
@SpringBootApplication(scanBasePackages = "com.sidgs.odp.core")
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}
