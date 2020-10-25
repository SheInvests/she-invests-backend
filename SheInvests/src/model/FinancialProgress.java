package model;

import java.time.LocalDateTime;
import java.util.Date;

public class FinancialProgress {

  private final int financialGoalId;
  private final double amountChanged;
  private final LocalDateTime createdAt;

  public FinancialProgress(int financialGoalId,double amountChanged, LocalDateTime createdAt) {
    this.financialGoalId = financialGoalId;
    this.amountChanged = amountChanged;
    this.createdAt = createdAt;
  }

  public double getAmountChanged() {
    return amountChanged;
  }

  public LocalDateTime getCreatedAt() {
    return createdAt;
  }
}
