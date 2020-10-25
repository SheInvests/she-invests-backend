package com.invests.sheInvests.controller;

import com.invests.sheInvests.dto.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

  @RequestMapping(name = "/",method = RequestMethod.POST)
  public @ResponseBody String addUser(@RequestBody User user) {

    System.out.println(user);
    return "Greetings from Spring Boot!";
  }


}
