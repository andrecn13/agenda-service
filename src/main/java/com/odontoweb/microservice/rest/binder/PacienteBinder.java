package com.odontoweb.microservice.rest.binder;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import com.odontoweb.microservice.impl.model.Paciente;
import com.odontoweb.microservice.rest.domain.request.PacienteRequest;
import com.odontoweb.microservice.rest.domain.response.PacienteResponse;

public class PacienteBinder implements Serializable {

	private static final long serialVersionUID = 2368417682988907201L;

	public Paciente requestToModel(PacienteRequest pacienteRequest) {
		return new Paciente(pacienteRequest.getIdPaciente(), pacienteRequest.getCpf(), pacienteRequest.getRg(),
				pacienteRequest.getNome(), pacienteRequest.getGenero(), pacienteRequest.getDataNascimento(),
				pacienteRequest.getEstadoCivil(), pacienteRequest.getContato(), pacienteRequest.getEndereco(),
				pacienteRequest.getConvenio());
	}

	public PacienteResponse modelToResponse(Paciente paciente) {
		return new PacienteResponse(paciente.getIdPaciente(), paciente.getCpf(), paciente.getRg(), paciente.getNome(),
				paciente.getGenero(), paciente.getDataNascimento(), paciente.getEstadoCivil(), paciente.getContato(),
				paciente.getEndereco(), paciente.getConvenio());
	}

	public List<PacienteResponse> modelToListResponse(List<Paciente> pacientes) {
		if (pacientes == null)
			return null;
		return pacientes.stream().filter(Objects::nonNull).map(paciente -> modelToResponse(paciente))
				.collect(Collectors.toList());

	}

}
