package com.example.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.config.AppProperties;

@RestController
public class HelloController {

  private final AppProperties appProperties;

  public HelloController(AppProperties appProperties) {
    this.appProperties = appProperties;
  }

  @GetMapping("/hello")
  public String hello(@RequestParam(required = false, defaultValue = "World") String name) {
    if (name.trim().isEmpty()) {
      throw new IllegalArgumentException("Name cannot be empty");
    }
    return String.format("%s, %s!", appProperties.getMessage(), name);
  }
}