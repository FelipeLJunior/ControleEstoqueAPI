package br.com.akstore.controleestoque.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.akstore.controleestoque.models.entities.Stock;
import br.com.akstore.controleestoque.models.repositories.StockRepository;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/stock")
public class StockController {

    @Autowired
    private StockRepository stockRepository;

    @GetMapping("/product")
    public Iterable<Stock> getStockByProductId(@RequestParam Long productId) {
        return stockRepository.findByProductId(productId);
    }

    @GetMapping("/branch")
    public Iterable<Stock> getStockByBranchId(@RequestParam Long branchId) {
        return stockRepository.findByBranchId(branchId);
    }

    @RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
    public void saveStock(@Valid Stock stock) {
        stockRepository.save(stock);
    }

    @DeleteMapping
    public void deleteStockById(@RequestParam Long id) {
        stockRepository.deleteById(id);
    }
}
