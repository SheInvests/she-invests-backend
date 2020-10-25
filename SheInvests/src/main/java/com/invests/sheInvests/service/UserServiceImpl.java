package com.invests.sheInvests.service;

import com.invests.sheInvests.dao.UserRepository;
import com.invests.sheInvests.dto.UserDTO;
import com.invests.sheInvests.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  UserRepository userDAO;

  @Override
  public String saveUser(UserDTO user) {
    System.out.println("method started");
    if(user!=null && user.getFirstName()!=null){
      User u = new User();
      u.setEmail(user.getEmail());
      u.setFirstName(user.getFirstName());
      u.setLastName(user.getLastName());
      u.setRole(user.getRole());
      userDAO.save(u);
    }
    System.out.println("method ended");
    return null;
  }
}
