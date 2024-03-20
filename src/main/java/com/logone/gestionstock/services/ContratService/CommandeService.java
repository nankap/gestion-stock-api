package com.logone.gestionstock.services.ContratService;

import com.logone.gestionstock.entities.Commande;

import java.util.List;

public interface CommandeService {
    Commande ajoutercommande(Commande commande);
    List<Commande> liretoutcommande();
    void supprimercommande(Long id);
    Commande modifiercommande(Commande commande);
}
