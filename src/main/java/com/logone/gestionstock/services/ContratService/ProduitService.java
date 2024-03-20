package com.logone.gestionstock.services.ContratService;

import com.logone.gestionstock.entities.Produit;

import java.util.List;

public interface ProduitService {
    Produit ajouterProduit(Produit produit);
    List<Produit> lireTousProduits();
    void supprimerProduit(Long id);
    Produit modifierProduit(Produit produit);
}
