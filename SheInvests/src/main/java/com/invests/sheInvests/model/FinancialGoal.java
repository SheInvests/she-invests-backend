package com.invests.sheInvests.model;

import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Entity
@Table(name="financial_goal")
public class FinancialGoal {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private static int goalID;

  @Column(name="name")
  private final String name;
  @Column(name="frequency")
  private final String frequency;
  @Column(name="startdate")
  private final LocalDateTime startDate;
  @Column(name="enddate")
  private final LocalDateTime endDate;
  @Column(name="amount_saved")
  private double amountSaved;
  @Column(name="amount_target")
  private double targetAmount;
  @OneToOne
  @JoinColumn(name="userid")
  private final int userID;

  public FinancialGoal(String financialGoalName, LocalDateTime startDate, LocalDateTime endDate, double amountSaved,
                       double targetAmount, String frequency, int userId) {
    this.name = financialGoalName;
    this.frequency = frequency;
    this.startDate = startDate;
    this.endDate = endDate;
    this.amountSaved = amountSaved;
    this.userID = userId;
    this.targetAmount = targetAmount;
  }

  public String getName() {
    return name;
  }

  public String getFrequency() {
    return frequency;
  }

  public LocalDateTime getStartDate() {
    return startDate;
  }

  public LocalDateTime getEndDate() {
    return endDate;
  }

  public double getAmountSaved() {
    return amountSaved;
  }

  public List<FinancialProgress> getProgressList() {
    return progressList;
  }

  public boolean addProgress(double amountChanged) {
    try{
      LocalDateTime currentDate = LocalDateTime.now();
      FinancialProgress financialProgress = new FinancialProgress(goalID,amountChanged,currentDate);

      amountSaved += amountChanged;
    }
    catch (Exception e) {
      throw new IllegalStateException("Exception while inserting financial progress");
    }
    return true;
  }

  public boolean isGoalReached() {
    return amountSaved >= targetAmount;
  }
}
