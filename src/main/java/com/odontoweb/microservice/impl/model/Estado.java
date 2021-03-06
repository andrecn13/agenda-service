package com.odontoweb.microservice.impl.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_ESTADO")
public class Estado implements Serializable {

	private static final long serialVersionUID = -3421186199020436949L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long idEstado;

	@Column(name = "STR_NOME")
	private String nome;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "FK_SIGLA")
	private Sigla sigla;

	public Estado() {
	}

	public Estado(Long idEstado, String nome, Sigla sigla) {
		this.idEstado = idEstado;
		this.nome = nome;
		this.sigla = sigla;
	}

	public Long getIdEstado() {
		return idEstado;
	}

	public void setIdEstado(Long idEstado) {
		this.idEstado = idEstado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Sigla getSigla() {
		return sigla;
	}

	public void setSigla(Sigla sigla) {
		this.sigla = sigla;
	}

	@Override
	public String toString() {
		return "Estado [id=" + idEstado + ", nome=" + nome + ", sigla=" + sigla + "]";
	}

}
