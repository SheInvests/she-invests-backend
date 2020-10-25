package model;

import java.time.LocalDateTime;

public class User {

  private static int userId = 0;
  private final String email;
  private final String firstName;
  private final String lastName;
  private FinancialGoal financialGoal;
  private Roles role;


  public User(String firstName, String lastName,String email, Roles role) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    financialGoal = null;
    this.role = role;
    userId += 1;
  }

  public User(String firstName, String lastName, String email, Roles role, LocalDateTime endDate, String financialGoalName,
              double targetAmount, String frequency) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    LocalDateTime currentDate = java.time.LocalDateTime.now();
    financialGoal = new FinancialGoal(financialGoalName,currentDate,endDate,0,targetAmount,frequency,userId);
    this.role = role;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public FinancialGoal getFinancialGoal() {
    return financialGoal;
  }

  public Roles getRole() {
    return role;
  }

  public String getEmail() {
    return email;
  }
}
