package com.logone.gestionstock.controllers;

import com.logone.gestionstock.entities.Client;
import com.logone.gestionstock.entities.Produit;
import com.logone.gestionstock.repositories.ClientRepository;
import com.logone.gestionstock.services.ContratService.ClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/client")
public class ClientController {
    private final ClientService clientService;
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }
    @PostMapping(path = "/ajouter")
    @ResponseBody
    public Client addclient(@RequestBody Client client){
        return clientService.ajouterclient(client);
    }
    @GetMapping(path = "/all")
    public List<Client> readclient (){
        return clientService.liretoutclient();
    }
    @DeleteMapping(path = "/delete/client-id")
    public String deleteclient(@PathVariable("client-id") Long id){
        clientService.supprimerclient(id);
        return "Client supprimé avec succes";
    }
    @PutMapping(path = "/update")
    @ResponseBody
    public Client updateproduit(@RequestBody Client client){
        return clientService.modifierclient(client);
    }
}
