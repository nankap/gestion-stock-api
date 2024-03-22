package com.logone.gestionstock.controllers;

import com.logone.gestionstock.entities.Commande;
import com.logone.gestionstock.repositories.CommandeRepository;
import com.logone.gestionstock.services.ContratService.CommandeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(path = "/api/commande")
public class CommandeController {
    private final CommandeService commandeService;
    public CommandeController(CommandeService commandeService) {
        this.commandeService = commandeService;
    }
    @ResponseBody
    @PostMapping(path = "/addcommande")
    public Commande addcommande(@RequestBody Commande commande){
        return commandeService.ajoutercommande(commande);
    }
    @GetMapping(path = "/all")
    public List<Commande> lirecommande(Commande commande){
        return commandeService.liretoutcommande();
    }
    @DeleteMapping(path = "/supprimerclient/cmde-id")
    public String supprimerclient(@PathVariable("cmde-id") Long id){
        commandeService.supprimercommande(id);
        return "Commande supprimée avec succes";
    }
    @PutMapping(path = "/update")
    @ResponseBody
    public Commande modifiercomde(@RequestBody Commande commande){
        return commandeService.modifiercommande(commande);
    }
}
