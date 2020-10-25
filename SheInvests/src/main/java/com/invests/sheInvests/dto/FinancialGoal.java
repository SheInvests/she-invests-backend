package com.invests.sheInvests.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.invests.sheInvests.model.FinancialProgress;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FinancialGoal {
  @SerializedName("name")
  @Expose
  private String name;

  @SerializedName("frequency")
  @Expose
  private String frequency;

  @SerializedName("startDate")
  @Expose
  private String startDate;

  @SerializedName("endDate")
  @Expose
  private String endDate;

  @SerializedName("amountSaved")
  @Expose
  private double amountSaved;

  @SerializedName("targetAmount")
  @Expose
  private double targetAmount;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFrequency() {
    return frequency;
  }

  public void setFrequency(String frequency) {
    this.frequency = frequency;
  }

  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public double getAmountSaved() {
    return amountSaved;
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

  @Override
  public String toString() {
    return "FinancialGoal{" +
            "name='" + name + '\'' +
            ", frequency='" + frequency + '\'' +
            ", startDate='" + startDate + '\'' +
            ", endDate='" + endDate + '\'' +
            ", amountSaved=" + amountSaved +
            ", targetAmount=" + targetAmount +
            '}';
  }
}
