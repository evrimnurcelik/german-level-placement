package com.german.placement_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.german.placement_test.model")
public class PlacementTestApplication {
  public static void main(String[] args) {
    SpringApplication.run(PlacementTestApplication.class, args);
  }
}
