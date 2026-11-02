package org.meridian.dto.response;

import java.util.List;

public class AccountResponseDTO {
    private String accountOwnerId;
    private String accountNumber;
    private double totalBalance;
    private double totalHoldBalance;
    private List<String> holdBalance;

    public AccountResponseDTO(){}

    public AccountResponseDTO(String accountOwnerId,String accountNumber,
                              double totalBalance,double totalHoldBalance,List<String> holdBalance){
        this.accountOwnerId =accountOwnerId;
        this.accountNumber = accountNumber;
        this.totalBalance = totalBalance;
        this.totalHoldBalance = totalHoldBalance;
        this.holdBalance = holdBalance;
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

    public void setHoldBalance(List<String> holdBalance) {
        this.holdBalance = holdBalance;
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

    public List<String> getHoldBalance() {
        return holdBalance;
    }
}
