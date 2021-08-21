package com.Geraldo.cadastroNF.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Geraldo.cadastroNF.domain.Cliente;
import com.Geraldo.cadastroNF.repositories.ClienteRepository;

@Service
public class DBService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	public void instanciaBaseDeDados() {
		
		Cliente c1 = new Cliente(null, "Unimed Ceará",         "10.395.358/0001-14", "Lucro Prezumido",  "unimed.Ceara@gmail.com"); 
		Cliente c2 = new Cliente(null, "Unimed Fortaleza",     "05.868.278/0001-07", "Lucro Prezumido",  "unimed.Fortaleza@gmail.com");
		Cliente c3 = new Cliente(null, "Geraldo fullstack me", "21.698.357/0001-65", "Simples Nacional", "geraldo.fullstack@gmail.com");
		
		this.clienteRepository.saveAll(Arrays.asList(c1, c2, c3));
	}
}
