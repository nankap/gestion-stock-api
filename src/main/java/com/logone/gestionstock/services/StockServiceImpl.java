package com.logone.gestionstock.services;

import com.logone.gestionstock.entities.Stock;
import com.logone.gestionstock.repositories.StockRepository;
import com.logone.gestionstock.services.ContratService.StockService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StockServiceImpl implements StockService {

    private final StockRepository stockRepository;
    public StockServiceImpl(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }
    @Override
    public Stock ajouterstock(Stock stock) {
        Stock stockajoute = stockRepository.save(stock);
        return stockajoute;
    }
    @Override
    public List<Stock> liretoutstock(Stock stock) {
        List<Stock> listerstock = stockRepository.findAll();
        return  listerstock;
    }
    @Override
    public void supprimerstock(Long id) {
        stockRepository.deleteById(id);
    }
    @Override
    public Stock modifierstock(Stock stock) {
        return stockRepository.save(stock);
    }
}
