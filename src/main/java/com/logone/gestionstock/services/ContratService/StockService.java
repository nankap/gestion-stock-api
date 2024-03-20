package com.logone.gestionstock.services.ContratService;

import com.logone.gestionstock.entities.Stock;

import java.util.List;

public interface StockService {
    Stock ajouterstock(Stock stock);
    List<Stock> liretoutstock(Stock stock);
    void supprimerstock(Long id);
    Stock modifierstock(Stock stock);
}
