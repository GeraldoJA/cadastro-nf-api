package com.Geraldo.cadastroNF.service;

import java.util.List;
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
	
	public List<Cliente> findAll() {
		return repository.findAll();
	}
	
	public List<Cliente> findAllByName( String razao ) {
		return repository.findAllByName(razao);
	}
	
	public Cliente create(Cliente obj) {
		obj.setId(null);
		return repository.save(obj);
	}
	
	public Cliente update(Integer id, Cliente obj) {
		
		Cliente c = findById(id);
		c.setRazaoSocial( obj.getRazaoSocial() );
		c.setCNPJ( obj.getCNPJ() );
		c.setTipoRegimeTributario( obj.getTipoRegimeTributario() );
		c.setEmail( obj.getEmail() );
		
		return repository.save(c);
	}
	
	public Cliente updatePatch(Integer id, Cliente obj) {
		
		Cliente c = findById(id);
		
		if( obj.getRazaoSocial() != null)
			c.setRazaoSocial( obj.getRazaoSocial() );		
		if( obj.getCNPJ() != null)
			c.setCNPJ( obj.getCNPJ() );
		if( obj.getTipoRegimeTributario() != null)
			c.setTipoRegimeTributario( obj.getTipoRegimeTributario() );
		if( obj.getEmail() != null)
			c.setEmail( obj.getEmail() );
		
		return repository.save(c);
	}

	public void delete(Integer id) {

		findById(id);
		repository.deleteById(id);
	}
	
}
