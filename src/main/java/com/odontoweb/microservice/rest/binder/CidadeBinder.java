package com.odontoweb.microservice.rest.binder;

import java.io.Serializable;

import com.odontoweb.microservice.impl.model.Cidade;
import com.odontoweb.microservice.rest.domain.request.CidadeRequest;
import com.odontoweb.microservice.rest.domain.response.CidadeResponse;

public class CidadeBinder implements Serializable {

	private static final long serialVersionUID = 2977065078163921913L;

	public Cidade requestToModel(CidadeRequest cidadeRequest) {
		return new Cidade(cidadeRequest.getIdCidade(), cidadeRequest.getNome(), cidadeRequest.getEstado());
	}

	public CidadeResponse modelToResponse(Cidade cidade) {
		return new CidadeResponse(cidade.getIdCidade(), cidade.getNome(), cidade.getEstado());
	}

}
