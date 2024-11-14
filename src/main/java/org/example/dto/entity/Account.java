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

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public double getDevise() {
        return devise;
    }

    public Type getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public void setDevise(double devise) {
        this.devise = devise;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Account(String id, String name, double balance, List<Transaction> transactions, double devise, Type type) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.transactions = transactions;
        this.devise = devise;
        this.type = type;
    }
}
