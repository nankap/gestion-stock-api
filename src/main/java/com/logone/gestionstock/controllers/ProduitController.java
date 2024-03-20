package com.logone.gestionstock.controllers;

import com.logone.gestionstock.entities.Produit;
import com.logone.gestionstock.services.ContratService.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/produit")
public class ProduitController {
    private final ProduitService produitService;
    public ProduitController(ProduitService produitService) {
        this.produitService = produitService;
    }
    //http://localhost:8080/api/produit/ajouter
    @PostMapping(path = "/ajouter")
    @ResponseBody
    public Produit addProduit(@RequestBody Produit produit){
       return produitService.ajouterProduit(produit);
    }
    //http://localhost:8080/api/produit/all
    @GetMapping(path="/all")
    @ResponseBody
    public List<Produit> getAllProduit(){
        List<Produit> listeProduitBD = produitService.lireTousProduits();
        return listeProduitBD;
    }

    //http://localhost:8080/api/produit/delete/2
    @DeleteMapping(path="/delete/{produit-id}")
    public String deleteProduit(@PathVariable("produit-id") Long idP) {
        produitService.supprimerProduit(idP);
        return "Supprimer avec succès";
    }

    //http://localhost:8080/api/produit/update
    @PutMapping(path="/update")
    @ResponseBody
    public Produit produit(@RequestBody Produit produit){
        return produitService.modifierProduit(produit);
    }
}
