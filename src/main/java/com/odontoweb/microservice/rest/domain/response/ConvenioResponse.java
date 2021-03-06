package com.odontoweb.microservice.rest.domain.response;

import java.io.Serializable;

public class ConvenioResponse implements Serializable {

	private static final long serialVersionUID = -5474776367658295233L;

	private Long idConvenio;
	private String nome;
	private String cnpj;
	private String razaoSocial;
	private EnderecoResponse enderecoResponse;
	private ContatoResponse contatoResponse;

	public ConvenioResponse() {
	}

	public ConvenioResponse(Long idConvenio, String nome, String cnpj, String razaoSocial,
			EnderecoResponse enderecoResponse, ContatoResponse contatoResponse) {
		this.idConvenio = idConvenio;
		this.nome = nome;
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.enderecoResponse = enderecoResponse;
		this.contatoResponse = contatoResponse;
	}

	public Long getIdConvenio() {
		return idConvenio;
	}

	public void setIdConvenio(Long idConvenio) {
		this.idConvenio = idConvenio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public EnderecoResponse getEnderecoResponse() {
		return enderecoResponse;
	}

	public void setEnderecoResponse(EnderecoResponse enderecoResponse) {
		this.enderecoResponse = enderecoResponse;
	}

	public ContatoResponse getContatoResponse() {
		return contatoResponse;
	}

	public void setContatoResponse(ContatoResponse contatoResponse) {
		this.contatoResponse = contatoResponse;
	}

}
