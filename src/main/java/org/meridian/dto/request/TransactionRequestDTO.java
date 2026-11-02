package org.meridian.dto.request;

import java.time.LocalDateTime;
import java.util.Date;

//There is dto for one time transaction
public class TransactionRequestDTO {
    private String transactionId;
    private String senderAccountNumber;
    private String receiverAccountNumber;
    private LocalDateTime timeStamp;
    private String Otp;
    private String remarks;

    public TransactionRequestDTO(){}

    public TransactionRequestDTO(String transactionId,String senderAccountNumber,String receiverAccountNumber,
                                 LocalDateTime timeStamp,String Otp,String remarks){
        this.transactionId = transactionId;
        this.senderAccountNumber = senderAccountNumber;
        this.receiverAccountNumber = receiverAccountNumber;
        this.timeStamp = timeStamp;
        this.Otp = Otp;
        this.remarks = remarks;
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

    public void setOtp(String Otp){
        this.Otp = Otp;
    }

    public void setRemarks(String remarks){
        this.remarks = remarks;
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

    public String getOtp() {
        return Otp;
    }

    public String getRemarks() {
        return remarks;
    }
}
