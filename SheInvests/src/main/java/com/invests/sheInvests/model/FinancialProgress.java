package com.invests.sheInvests.model;

import java.time.LocalDateTime;

public class FinancialProgress {

  private static int progressId = 0;
  private final int financialGoalId;
  private final double amountChanged;
  private final LocalDateTime createdAt;

  public FinancialProgress(int financialGoalId,double amountChanged, LocalDateTime createdAt) {
    this.financialGoalId = financialGoalId;
    this.amountChanged = amountChanged;
    this.createdAt = createdAt;
    progressId += 1;
  }

  public double getAmountChanged() {
    return amountChanged;
  }

  public LocalDateTime getCreatedAt() {
    return createdAt;
  }
}
