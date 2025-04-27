package com.sventas.sventas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main class of the Spring Boot application.
 * Marks this class as a Spring Boot application using the @SpringBootApplication annotation,
 * which combines @Configuration, @EnableAutoConfiguration, and @ComponentScan.
 */
@SuppressWarnings("checkstyle:Indentation")
@SpringBootApplication
public class SventasApplication {
  /**
   * Main method that starts the Spring Boot application.
   *
   * @param args Command-line arguments passed when starting the application.
   */
  public static void main(String[] args) {
    SpringApplication.run(SventasApplication.class, args);
  }

}