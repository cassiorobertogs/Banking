package br.com.pcdcorp.banking.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.pcdcorp.banking.model.Conta;

public interface ContaDao extends CrudRepository<Conta,Integer> {


}
