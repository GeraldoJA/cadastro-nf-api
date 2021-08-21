package com.Geraldo.cadastroNF.domain;

import java.util.Objects;

public class Cliente {
	
	private Integer id;
	
	private String razaoSocial;
	private String CNPJ;
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
