package br.com.akstore.controleestoque.models.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.akstore.controleestoque.models.entities.Branch;

public interface BranchRepository extends CrudRepository<Branch, Long> {

}
