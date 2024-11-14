package org.example.dto.entity;

import java.util.List;

public class Account {
    public  String id;
    public  String name;
    public  double balance;
    public List<Transaction> transactions;
    public double devise;
    public Type type;

    public enum Type {
        Banque, OrangeMoney, Espèce
    }
}
