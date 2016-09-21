package com.odontoweb.microservice.impl.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_SIGLA")
public class Sigla implements Serializable {

	private static final long serialVersionUID = 2565988292432425188L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long idSigla;
	
	@Column(name = "STR_SIGLA")
	private String sigla;

	public Sigla() {
	}

	public Sigla(Long idSigla, String sigla) {
		this.idSigla = idSigla;
		this.sigla = sigla;
	}

	
	public Long getIdSigla() {
		return idSigla;
	}

	public void setIdSigla(Long idSigla) {
		this.idSigla = idSigla;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	@Override
	public String toString() {
		return "Sigla [id=" + idSigla + ", sigla=" + sigla + "]";
	}
}
