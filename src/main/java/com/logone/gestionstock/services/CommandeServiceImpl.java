package com.logone.gestionstock.services;

import com.logone.gestionstock.entities.Commande;
import com.logone.gestionstock.repositories.CommandeRepository;
import com.logone.gestionstock.services.ContratService.CommandeService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CommandeServiceImpl implements CommandeService {

    final CommandeRepository commandeRepository;
    public CommandeServiceImpl(CommandeRepository commandeRepository) {
        this.commandeRepository = commandeRepository;
    }
    @Override
    public Commande ajoutercommande(Commande commande) {
        Commande commandeajoute= commandeRepository.save(commande);
        return commandeajoute;
    }
    @Override
    public List<Commande> liretoutcommande() {
        List<Commande> listercommande= commandeRepository.findAll();
        return listercommande ;
    }
    @Override
    public void supprimercommande(Long id) {
        commandeRepository.deleteById(id);
    }
    @Override
    public Commande modifiercommande(Commande commande) {
        return commandeRepository.save(commande);
    }
}
