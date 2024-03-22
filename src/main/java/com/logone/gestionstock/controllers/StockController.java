package com.logone.gestionstock.controllers;

import com.logone.gestionstock.entities.Stock;
import com.logone.gestionstock.services.ContratService.StockService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/stock")
public class StockController {
    private final StockService stockService;
    public StockController(StockService stockService) {
        this.stockService = stockService;
    }
    @ResponseBody
    @PostMapping(path = "/addstock")
    public Stock addstock(@RequestBody Stock stock){
        return stockService.ajouterstock(stock);
    }
    @GetMapping(path = "/all")
    public List<Stock> lirestock(Stock stock){
        return stockService.liretoutstock(stock);
    }
    @DeleteMapping(path = "/delete/stock-id")
    public String suprimmerstock(@PathVariable("stock-id") Long id){
        stockService.supprimerstock(id);
        return "Stock supprimé avec succes";
    }
    @PutMapping(path = "/update")
    @ResponseBody
    public Stock updatestock(@RequestBody Stock stock){
        return stockService.modifierstock(stock);
    }
}
