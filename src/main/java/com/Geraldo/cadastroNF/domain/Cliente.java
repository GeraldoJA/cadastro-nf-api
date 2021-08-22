package com.Geraldo.cadastroNF.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

@Entity
public class Cliente implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotEmpty(message = "Campo RAZÃO SOCIAL é necessário")
	@Length(min = 5, max = 50, message = "O campo RAZÃO SOCIAL deve ter entre 13 e 50 caracteres")
	private String razaoSocial;
	
	@NotEmpty(message = "Campo CNPJ é necessário")
	@Length(min = 13, max = 18, message = "O campo CNPJ deve ter entre 13 e 18 caracteres")
	private String CNPJ;
	
	@NotEmpty(message = "Campo REGIME TRIBUTÁRIO é necessário")
	@Length(min = 5, max = 30, message = "O campo REGIME TRIBUTÁRIO deve ter entre 5 e 30 caracteres")
	private String TipoRegimeTributario;
	
	private String email;

	/*
	 * Opção para fazer com enum
	 * 
	private enum TipoRegimeTributario { 
		
		SIMPLES_NACIONAL("Simples Nacional"), 
		LUCRO_PRESUMIDO("Lucro Presumido");
		
		private String descricao;
		
		TipoRegimeTributario(String descricao) {
			this.descricao = descricao;
		}
		
		public String getDescricao() {
			return this.descricao ;
		}
	}
*/
	// TODO construtores
	
	public Cliente() {
		super();
	}

	public Cliente(Integer id, String razaoSocial, String cNPJ, String tipoRegimeTributario, String email) {
		super();
		this.id = id;
		this.razaoSocial = razaoSocial;
		CNPJ = cNPJ;
		TipoRegimeTributario = tipoRegimeTributario;
		this.email = email;
	}

	// TODO hashCode and equals
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(id, other.id);
	}

	//TODO GETS and SETS 
	
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

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public String getTipoRegimeTributario() {
		return TipoRegimeTributario;
	}

	public void setTipoRegimeTributario(String tipoRegimeTributario) {
		TipoRegimeTributario = tipoRegimeTributario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}



}
