package org.example.dto.entity;

import java.time.LocalDateTime;

public class Transaction {
    public String transactionId;
    public String label;
    public double balance;
    public LocalDateTime dateAndTime;
    public Type type;

    public enum Type {
        CREDIT, DEBIT
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getLabel() {
        return label;
    }

    public double getBalance() {
        return balance;
    }

    public LocalDateTime getDateAndTime() {
        return dateAndTime;
    }

    public Type getType() {
        return type;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setDateAndTime(LocalDateTime dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Transaction(String transactionId, String label, double balance, LocalDateTime dateAndTime, Type type) {
        this.transactionId = transactionId;
        this.label = label;
        this.balance = balance;
        this.dateAndTime = dateAndTime;
        this.type = type;
    }
}
