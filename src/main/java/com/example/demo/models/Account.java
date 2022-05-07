package com.example.demo.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Account {

    @Id
    @GeneratedValue
    private Long id;

    private String inst;
    private double balance;

    private int dueDate;

    private double apr;

    public Account() {
    }

    public Account(String inst, double apr, int dueDate) {
        this.inst = inst;
        this.apr = apr;
        this.dueDate = dueDate;
    }

    public Account(String inst, double balance, double apr) {
        this.inst = inst;
        this.balance = balance;
        this.apr = apr;
    }

    public void setInst(String inst) {
        this.inst = inst;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setDueDate(int dueDate) {
        this.dueDate = dueDate;
    }

    public void setApr(double apr) {
        this.apr = apr;
    }

    public Long getId() {
        return id;
    }

    public String getInst() {
        return inst;
    }

    public double getBalance() {
        return balance;
    }

    public int getDueDate() {
        return dueDate;
    }

    public double getApr() {
        return apr;
    }
}
