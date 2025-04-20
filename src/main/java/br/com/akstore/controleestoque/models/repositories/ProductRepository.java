package br.com.akstore.controleestoque.models.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.akstore.controleestoque.models.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
