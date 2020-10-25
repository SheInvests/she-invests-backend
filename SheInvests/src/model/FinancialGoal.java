package model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FinancialGoal {

  private static int goalID = 0;
  private final String name;
  private final String frequency;
  private final LocalDateTime startDate;
  private final LocalDateTime endDate;
  private double amountSaved;
  private double targetAmount;
  private final int userID;
  private List<FinancialProgress> progressList;


  public FinancialGoal(String financialGoalName, LocalDateTime startDate, LocalDateTime endDate, double amountSaved,
                       double targetAmount, String frequency, int userId) {
    this.name = financialGoalName;
    this.frequency = frequency;
    this.startDate = startDate;
    this.endDate = endDate;
    this.amountSaved = amountSaved;
    this.userID = userId;
    this.progressList = new ArrayList<>();
    this.goalID += 1;
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
      LocalDateTime currentDate = java.time.LocalDateTime.now();
      FinancialProgress financialProgress = new FinancialProgress(goalID,amountChanged,currentDate);
      progressList.add(financialProgress);

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
