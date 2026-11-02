package org.meridian.dto.response;

import java.time.LocalDateTime;

public class TransactionResponseDTO {
    private String transactionId;
    private String senderAccountNumber;
    private String receiverAccountNumber;
    private double amount;
    private LocalDateTime timeStamp;
    private String transactionType;
    private String status;


    public TransactionResponseDTO(){}

    public TransactionResponseDTO(String transactionId,String senderAccountNumber,String receiverAccountNumber,
                                 double amount,LocalDateTime timeStamp,String transactionType,String status){
        this.transactionId = transactionId;
        this.senderAccountNumber = senderAccountNumber;
        this.receiverAccountNumber = receiverAccountNumber;
        this.amount = amount;
        this.timeStamp = timeStamp;
        this.transactionType = transactionType;
        this.status = status;
    }

    //Setters
    public void setTransactionId(String transactionId){
        this.transactionId = transactionId;
    }

    public void setSenderAccountNumber(String senderAccountNumber){
        this.senderAccountNumber = senderAccountNumber;
    }

    public void setReceiverAccountNumber(String receiverAccountNumber){
        this.receiverAccountNumber = receiverAccountNumber;
    }

    public void setTimeStamp(LocalDateTime timeStamp){
        this.timeStamp = timeStamp;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }


    //Getters
    public String getTransactionId(){
        return transactionId;
    }

    public String getReceiverAccountNumber() {
        return receiverAccountNumber;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public String getSenderAccountNumber(){
        return senderAccountNumber;
    }

    public double getAmount() {
        return amount;
    }

    public String getStatus() {
        return status;
    }

    public String getTransactionType() {
        return transactionType;
    }
}
