package com.invests.sheInvests.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.time.LocalDateTime;

@Entity
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private static int userId;
  @Column(name="email")
  private final String email;
  @Column(name="firstname")
  private final String firstName;
  @Column(name="lastname")
  private final String lastName;
  @Column(name="role")
  private Roles role;

  public User(String firstName, String lastName,String email, Roles role) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.role = role;
//    userId += 1;
  }

  public User(String firstName, String lastName, String email,Roles role) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.role = role;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public Roles getRole() {
    return role;
  }

  public String getEmail() {
    return email;
  }
}
