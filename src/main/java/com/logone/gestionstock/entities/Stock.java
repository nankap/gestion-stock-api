package com.logone.gestionstock.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="tb_stock")
public class Stock implements Serializable {
    private static final long serialversionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String intitule;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public Stock(long id, String intitule) {
        this.id = id;
        this.intitule = intitule;
    }

    public Stock() {
    }
}
