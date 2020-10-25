package com.invests.sheInvests.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="user")
@EntityListeners(AuditingEntityListener.class)
public class User {

  @Id
  @Column(name="userid")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int userId;

  @Column(name="email")
  private String email;

  @Column(name="firstname")
  private String firstName;

  @Column(name="lastname")
  private String lastName;

  @Column(name="role")
  private Roles role;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "goalid", referencedColumnName = "goalid")
  private FinancialGoal financialGoal;

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

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }

  public void setRole(Roles role) {
    this.role = role;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public FinancialGoal getFinancialGoal() {
    return financialGoal;
  }

  public void setFinancialGoal(FinancialGoal financialGoal) {
    this.financialGoal = financialGoal;
  }


}
