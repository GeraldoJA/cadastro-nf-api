package com.Geraldo.cadastroNF.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Geraldo.cadastroNF.domain.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
	
	@Query("SELECT obj FROM Cliente obj WHERE obj.razaoSocial LIKE %:razao% ")
	List<Cliente> findAllByName( @Param(value = "razao" ) String razao);

}
