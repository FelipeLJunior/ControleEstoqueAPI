package br.com.akstore.controleestoque.models.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.akstore.controleestoque.models.entities.Stock;

public interface StockRepository extends CrudRepository<Stock, Long> {

    public Iterable<Stock> findByProductId(Long id);
    public Iterable<Stock> findByBranchId(Long id);
}
