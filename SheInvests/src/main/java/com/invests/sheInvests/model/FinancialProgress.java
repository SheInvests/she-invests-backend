package com.invests.sheInvests.model;

import javax.persistence.*;
import java.util.List;
import java.time.LocalDateTime;

@Entity
@Table(name="financial_progress")
public class FinancialProgress {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private static int progressId;

  @ManyToOne
  @JoinColumn(name="goalid")
  private final int financialGoalId;
  @Column(name="amountchanged")
  private final double amountChanged;
  @Column(name="createdat")
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
