package com.logone.gestionstock.services;

import com.logone.gestionstock.entities.Client;
import com.logone.gestionstock.repositories.ClientRepository;
import com.logone.gestionstock.services.ContratService.ClientService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClientServiceImpl implements ClientService {
    private final ClientRepository clientRepository;
    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }
    @Override
    public Client ajouterclient(Client client) {
        Client clientajoute= clientRepository.save(client);
        return clientajoute;
    }
    @Override
    public List<Client> liretoutclient() {
       List<Client> listerclient = clientRepository.findAll();
       return listerclient;
    }
    @Override
    public void supprimerclient(Long id) {
        clientRepository.deleteById(id);
    }
    @Override
    public Client modifierclient(Client client) {
       return clientRepository.save(client);
    }
}
