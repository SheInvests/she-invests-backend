package com.invests.sheInvests.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="financial_progress")
@EntityListeners(AuditingEntityListener.class)
public class FinancialProgress {

  @Id
  @Column(name="progressid")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int progressId;

  @ManyToOne
  @JoinColumn(name = "goalid")
  private FinancialGoal financialGoal;

  @Column(name="amountchanged")
  private double amountChanged;

  @Column(name="createdat")
  private LocalDateTime createdAt;

  public int getProgressId() {
    return progressId;
  }

  public void setProgressId(int progressId) {
    this.progressId = progressId;
  }

  public double getAmountChanged() {
    return amountChanged;
  }

  public void setAmountChanged(double amountChanged) {
    this.amountChanged = amountChanged;
  }

  public LocalDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(LocalDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public FinancialGoal getFinancialGoal() {
    return financialGoal;
  }

  public void setFinancialGoal(FinancialGoal financialGoal) {
    this.financialGoal = financialGoal;
  }
}
