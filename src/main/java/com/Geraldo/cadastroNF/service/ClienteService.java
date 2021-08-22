package com.Geraldo.cadastroNF.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Geraldo.cadastroNF.domain.Cliente;
import com.Geraldo.cadastroNF.exceptions.ObjectNotFoundException;
import com.Geraldo.cadastroNF.repositories.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repository;

	public Cliente findById( Integer id) {
		Optional<Cliente> obj = repository.findById(id);
		return obj.orElseThrow( () -> new ObjectNotFoundException(
				"Objeto não encontrato! Id: " + id + ", Tipo: " + Cliente.class.getName() ) );
	}
}
