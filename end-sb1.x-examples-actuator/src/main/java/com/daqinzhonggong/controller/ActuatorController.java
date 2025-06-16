package com.daqinzhonggong.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActuatorController {

  @RequestMapping("/hello")
  public String index() {
    return "Hello World";
  }

}