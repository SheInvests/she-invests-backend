package com.invests.sheInvests.controller;

import com.invests.sheInvests.dto.UserDTO;
import com.invests.sheInvests.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/user")
public class UserController {

  @Autowired
  UserService userService;

  @RequestMapping(name = "/",method = RequestMethod.POST)
  public @ResponseBody String addUser(@RequestBody UserDTO user) {
    System.out.println(user);
    userService.saveUser(user);
    return "Greetings from Spring Boot!";
  }
}
