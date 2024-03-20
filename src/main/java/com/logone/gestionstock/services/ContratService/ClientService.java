package com.logone.gestionstock.services.ContratService;

import com.logone.gestionstock.entities.Client;

import java.util.List;

public interface ClientService {
    Client ajouterclient(Client client);
    List<Client> liretoutclient ();
    void supprimerclient(Long id);
    Client modifierclient(Client client);
}
