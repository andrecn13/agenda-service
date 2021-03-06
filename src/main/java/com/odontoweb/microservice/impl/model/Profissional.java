package com.odontoweb.microservice.impl.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.odontoweb.microservice.impl.model.enums.Genero;

@Entity
@Table(name = "TBL_PROFISSIONAL")
public class Profissional implements Serializable {

	private static final long serialVersionUID = 5100117436384354033L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long idProfissional;

	@Column(name = "STR_NOME")
	private String nome;

	@OneToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name = "FK_CONTATO")
	private Contato contato;

	@Column(name = "STR_GENERO")
	@Enumerated(EnumType.STRING)
	private Genero genero;

	@Column(name = "STR_CONSELHO")
	private String conselho;

	@Column(name = "STR_REGISTRO")
	private String registro;

	@Column(name = "STR_CODIGO_BRASILEIRO_OCUPACAO")
	private String codigoBrasileiroOcupacao;

	public Profissional() {
	}

	public Profissional(Long idProfissional, String nome, Contato contato, Genero genero, String conselho, String registro,
			String codigoBrasileiroOcupacao) {
		this.idProfissional = idProfissional;
		this.nome = nome;
		this.contato = contato;
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
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

	@Override
	public String toString() {
		return "Profissional [id=" + idProfissional + ", nome=" + nome + ", generoso=" + genero + ", conselho="
				+ conselho + ", registro=" + registro + ", codigoBrasileiroOcupacao=" + codigoBrasileiroOcupacao + "]";
	}

}
