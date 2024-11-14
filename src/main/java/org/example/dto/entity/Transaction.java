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
}
