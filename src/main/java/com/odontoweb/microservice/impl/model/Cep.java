package com.odontoweb.microservice.impl.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cep implements Serializable {

	private static final long serialVersionUID = 3535476443901518609L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cep")
	private Long idCep;

	@Column(name = "cep")
	private Integer cep;

	public Long getIdCep() {
		return idCep;
	}

	public void setIdCep(Long idCep) {
		this.idCep = idCep;
	}

	public Integer getCep() {
		return cep;
	}

	public void setCep(Integer cep) {
		this.cep = cep;
	}

}