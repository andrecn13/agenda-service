package com.odontoweb.microservice.rest.domain.response;

import java.io.Serializable;
import java.util.List;

import com.odontoweb.microservice.impl.model.Telefone;
import com.odontoweb.microservice.impl.model.enums.Genero;

public class ProfissionalResponse implements Serializable {

	private static final long serialVersionUID = -1205176944035282783L;

	private Long idProfissional;
	private List<Telefone> telefones;
	private Genero genero;
	private String conselho;
	private String registro;
	private String codigoBrasileiroOcupacao;

	public ProfissionalResponse() {
	}

	public ProfissionalResponse(Long idProfissional, List<Telefone> telefones, Genero genero, String conselho,
			String registro, String codigoBrasileiroOcupacao) {
		this.idProfissional = idProfissional;
		this.telefones = telefones;
		this.genero = genero;
		this.conselho = conselho;
		this.registro = registro;
		this.codigoBrasileiroOcupacao = codigoBrasileiroOcupacao;
	}

	public Long getIdProfissional() {
		return idProfissional;
	}

	public void setIdProfissional(Long idProfissional) {
		this.idProfissional = idProfissional;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public String getConselho() {
		return conselho;
	}

	public void setConselho(String conselho) {
		this.conselho = conselho;
	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public String getCodigoBrasileiroOcupacao() {
		return codigoBrasileiroOcupacao;
	}

	public void setCodigoBrasileiroOcupacao(String codigoBrasileiroOcupacao) {
		this.codigoBrasileiroOcupacao = codigoBrasileiroOcupacao;
	}

}
