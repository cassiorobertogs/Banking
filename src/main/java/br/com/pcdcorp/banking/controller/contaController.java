package br.com.pcdcorp.banking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.pcdcorp.banking.dao.ContaDao;
import br.com.pcdcorp.banking.model.Conta;

@RestController
public class contaController {
	@Autowired
	private ContaDao dao;

	@GetMapping("/contas")

	public List<Conta> recuperarTodos() {
		return (List<Conta>) dao.findAll();
	}

	@GetMapping("/contas/{numero}")
	public Conta recuperarPeloNumero(@PathVariable int numero) {
		return dao.findById(numero).orElse(null);

	}
}
