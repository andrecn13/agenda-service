package com.odontoweb.microservice.impl.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.odontoweb.microservice.impl.model.Sigla;
import com.odontoweb.microservice.impl.repository.SiglaRepository;

public class SiglaService implements Serializable {

	private static final long serialVersionUID = -345476950787516583L;

	private SiglaRepository siglaRepository;

	@Autowired
	public SiglaService(SiglaRepository siglaRepository) {
		this.siglaRepository = siglaRepository;
	}

	public List<Sigla> findAll() {
		return siglaRepository.findAll();
	}

	public boolean save(Sigla sigla) {
		return siglaRepository.save(sigla) != null;
	}

	public Sigla findById(Long id) {
		return siglaRepository.findOne(id);
	}

}
