package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
public class Transaction {

    @Id
    @GeneratedValue
    private Long id;

    private String payee;

    private double amount;

    private LocalDate date;

    @ManyToOne
    private Account account;

    public Transaction() {
    }


}
