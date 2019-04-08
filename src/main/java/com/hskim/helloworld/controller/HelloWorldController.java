package com.hskim.helloworld.controller;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloWorldController {
  
  @GetMapping("/")
  public String index() {
    LocalDate currentDate = LocalDate.now();
    LocalTime currentTime = LocalTime.now();
    System.out.println("===================== " + currentDate + " " + currentTime + " =====================");
    return "Hello World";
  }
}
