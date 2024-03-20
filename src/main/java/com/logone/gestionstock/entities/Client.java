package com.logone.gestionstock.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="tb_client")
public class Client implements Serializable {
    private static final long serialversionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nom;
    private String email;
    private String tel;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    public Client(long id, String nom, String email, String tel) {
        this.id = id;
        this.nom = nom;
        this.email = email;
        this.tel = tel;
    }

    public Client() {
    }
}
