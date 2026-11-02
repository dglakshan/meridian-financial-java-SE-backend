package org.meridian.model;

import java.util.List;

public class AccountModel {
    private String accountOwnerId;
    private String accountNumber;
    private double totalBalance;
    private double totalHoldBalance;

    public AccountModel(){}

    public AccountModel(String accountOwnerId,String accountNumber,
                              double totalBalance,double totalHoldBalance,List<String> holdBalance){
        this.accountOwnerId =accountOwnerId;
        this.accountNumber = accountNumber;
        this.totalBalance = totalBalance;
        this.totalHoldBalance = totalHoldBalance;
    }

    //Setters
    public void setAccountOwnerId(String accountOwnerId) {
        this.accountOwnerId = accountOwnerId;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setTotalBalance(double totalBalance) {
        this.totalBalance = totalBalance;
    }

    public void setTotalHoldBalance(double totalHoldBalance) {
        this.totalHoldBalance = totalHoldBalance;
    }



    //Getters
    public String getAccountOwnerId() {
        return accountOwnerId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getTotalBalance() {
        return totalBalance;
    }

    public double getTotalHoldBalance() {
        return totalHoldBalance;
    }


}
