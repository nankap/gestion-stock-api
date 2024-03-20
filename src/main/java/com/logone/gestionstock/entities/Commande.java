package com.logone.gestionstock.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
@Entity  //permet de rendre une classe en entité qui sera sauvegarder dans la BD
@Table(name="tb_commande") //permet de renommer notre table
//serializable permet de ne plus creer une autre table quand il ya une modification
public class Commande implements Serializable {
    private static final long serialversionUID=1L; // tjr l'inserer apres lajout de l'implements seriazable
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    long numCommande;

    @Temporal(TemporalType.DATE) //permet de specifier que la date sera en jour-mois-année
    Date date;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getNumCommande() {
        return numCommande;
    }

    public void setNumCommande(long numCommande) {
        this.numCommande = numCommande;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Commande(long id, long numCommande, Date date) {
        this.id = id;
        this.numCommande = numCommande;
        this.date = date;
    }
    public Commande() {
    }
}
