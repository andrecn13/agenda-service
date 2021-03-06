package com.odontoweb.microservice.rest.domain.request;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import com.odontoweb.microservice.impl.model.enums.TipoTelefone;

public class TelefoneRequest implements Serializable {

	private static final long serialVersionUID = -8017936722048406458L;

	private Long idTelefone;

	@NotNull(message = "Número é obrigatório")
	private Integer numero;

	@NotNull(message = "DDD é obrigatório")
	private Integer ddd;

	@NotNull(message = "Tipo de Telefone é obrigatório")
	private TipoTelefone tipoTelefone;
	
	
	public TelefoneRequest() {}
	
	public TelefoneRequest(Long idTelefone, Integer numero, Integer ddd, TipoTelefone tipoTelefone) {
		this.idTelefone = idTelefone;
		this.numero = numero;
		this.ddd = ddd;
		this.tipoTelefone = tipoTelefone;
	}

	public Long getIdTelefone() {
		return idTelefone;
	}

	public void setIdTelefone(Long idTelefone) {
		this.idTelefone = idTelefone;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Integer getDdd() {
		return ddd;
	}

	public void setDdd(Integer ddd) {
		this.ddd = ddd;
	}

	public TipoTelefone getTipoTelefone() {
		return tipoTelefone;
	}

	public void setTipoTelefone(TipoTelefone tipoTelefone) {
		this.tipoTelefone = tipoTelefone;
	}

}
