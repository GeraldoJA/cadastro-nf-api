package com.Geraldo.cadastroNF.dtos;

import java.io.Serializable;

import com.Geraldo.cadastroNF.domain.Cliente;

public class ClienteDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;	
	private String razaoSocial;
	
	// TODO Construtores
	
	public ClienteDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ClienteDTO( Cliente obj ) {
		super();
		this.id = obj.getId();
		this.razaoSocial = obj.getRazaoSocial();
	}

	// TODO Gets and Sets
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	
}
