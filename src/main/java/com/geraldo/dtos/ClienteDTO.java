package com.geraldo.dtos;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.geraldo.domain.Cliente;

public class ClienteDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;	
	
	@NotEmpty(message = "Campo RAZÃO SOCIAL é necessário")
	@Length(min = 5, max = 50, message = "O campo RAZÃO SOCIAL deve ter entre 13 e 50 caracteres")
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
