package com.Geraldo.cadastroNF;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Geraldo.cadastroNF.domain.Cliente;
import com.Geraldo.cadastroNF.repositories.ClienteRepository;

@SpringBootApplication
public class CadastroNfApplication implements CommandLineRunner {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CadastroNfApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Cliente c1 = new Cliente(null, "Unimed Ceará",         "10.395.358/0001-14", "Lucro Prezumido",  "unimed.Ceara@gmail.com"); 
		Cliente c2 = new Cliente(null, "Unimed Fortaleza",     "05.868.278/0001-07", "Lucro Prezumido",  "unimed.Fortaleza@gmail.com");
		Cliente c3 = new Cliente(null, "Geraldo fullstack me", "21.698.357/0001-65", "Simples Nacional", "geraldo.fullstack@gmail.com");
		
		this.clienteRepository.saveAll(Arrays.asList(c1, c2, c3));
	}

}
