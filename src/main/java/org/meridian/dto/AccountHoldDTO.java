package org.meridian.dto;

import java.time.LocalDateTime;

public class AccountHoldDTO {
    private String accountNumber;
    private double amount;
    private String reason;
    private String status;
    private LocalDateTime createdAt;

    public AccountHoldDTO(){}

    public AccountHoldDTO(String accountNumber,double amount,String reason,String status,LocalDateTime createdAt){
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.reason = reason;
        this.status = status;
        this.createdAt = createdAt;
    }


    //Setters

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }


    //Getters

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getAmount() {
        return amount;
    }

    public String getStatus() {
        return status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public String getReason() {
        return reason;
    }
}
