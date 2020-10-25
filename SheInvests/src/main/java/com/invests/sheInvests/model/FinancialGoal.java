package com.invests.sheInvests.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="financial_goal")
@EntityListeners(AuditingEntityListener.class)
public class FinancialGoal {

  @Id
  @Column(name="goalid")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int goalID;

  @OneToMany(mappedBy = "financialGoal")
  private List<FinancialProgress> progressList;

  @Column(name="name")
  private String name;

  @Column(name="frequency")
  private String frequency;

  @Column(name="startdate")
  private String startDate;

  @Column(name="enddate")
  private String endDate;

  @Column(name="amount_saved")
  private double amountSaved;

  @Column(name="amount_target")
  private double targetAmount;

  @OneToOne(mappedBy = "financialGoal")
  private User user;

  public String getName() {
    return name;
  }

  public String getFrequency() {
    return frequency;
  }

  public String getStartDate() {
    return startDate;
  }

  public String getEndDate() {
    return endDate;
  }

  public double getAmountSaved() {
    return amountSaved;
  }

  public boolean isGoalReached() {
    return amountSaved >= targetAmount;
  }

  public int getGoalID() {
    return goalID;
  }

  public void setGoalID(int goalID) {
    this.goalID = goalID;
  }

  public List<FinancialProgress> getProgressList() {
    return progressList;
  }

  public void setProgressList(List<FinancialProgress> progressList) {
    this.progressList = progressList;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setFrequency(String frequency) {
    this.frequency = frequency;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public void setAmountSaved(double amountSaved) {
    this.amountSaved = amountSaved;
  }

  public double getTargetAmount() {
    return targetAmount;
  }

  public void setTargetAmount(double targetAmount) {
    this.targetAmount = targetAmount;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }
}
