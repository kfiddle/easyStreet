package com.example.demo.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ExpCat {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private boolean taxRelated;


}
