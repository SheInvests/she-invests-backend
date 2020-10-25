package com.invests.sheInvests.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FinancialProgress {

  @SerializedName("amountChanged")
  @Expose
  private double amountChanged;

  @SerializedName("createdAt")
  @Expose
  private String createdAt;

  public double getAmountChanged() {
    return amountChanged;
  }

  public void setAmountChanged(double amountChanged) {
    this.amountChanged = amountChanged;
  }

  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  @Override
  public String toString() {
    return "FinancialProgress{" +
            "amountChanged=" + amountChanged +
            ", createdAt='" + createdAt + '\'' +
            '}';
  }
}
