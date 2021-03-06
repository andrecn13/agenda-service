package com.odontoweb.microservice.rest.binder;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import com.odontoweb.microservice.impl.model.Sigla;
import com.odontoweb.microservice.rest.domain.request.SiglaRequest;
import com.odontoweb.microservice.rest.domain.response.SiglaResponse;

public class SiglaBinder implements Serializable {

	private static final long serialVersionUID = 3194940793999662683L;

	public Sigla requestToModel(SiglaRequest siglaRequest) {
		return new Sigla(siglaRequest.getIdSigla(), siglaRequest.getSigla());
	}

	public SiglaResponse modelToResponse(Sigla sigla) {
		return new SiglaResponse(sigla.getIdSigla(), sigla.getSigla());
	}

	public List<SiglaResponse> modelToListResponse(List<Sigla> siglas){
		if(siglas == null) return null;
		return siglas.stream().filter(Objects::nonNull).map(sigla->modelToResponse(sigla)).collect(Collectors.toList());
		
	}
}
