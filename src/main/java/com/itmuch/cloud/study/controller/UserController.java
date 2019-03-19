package com.itmuch.cloud.study.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

  @RequestMapping("/ddw/{id}")
  public String findById(@PathVariable Long id) {
    return id.toString();
  }
}
