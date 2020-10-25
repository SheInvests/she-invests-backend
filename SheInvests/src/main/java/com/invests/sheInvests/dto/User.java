package com.invests.sheInvests.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.invests.sheInvests.model.Roles;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class User {

  @SerializedName("firstName")
  @Expose
  private String firstName;

  @SerializedName("lastName")
  @Expose
  private String lastName;

  @SerializedName("email")
  @Expose
  private String email;

  @SerializedName("financialGoal")
  @Expose
  private FinancialGoal financialGoal;

  @SerializedName("role")
  @Expose
  private Roles role;

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public FinancialGoal getFinancialGoal() {
    return financialGoal;
  }

  public void setFinancialGoal(FinancialGoal financialGoal) {
    this.financialGoal = financialGoal;
  }

  public Roles getRole() {
    return role;
  }

  public void setRole(Roles role) {
    this.role = role;
  }

  @Override
  public String toString() {
    return "User{" +
            "firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", email='" + email + '\'' +
            ", financialGoal=" + financialGoal +
            ", role=" + role  +
            '}';
  }
}
