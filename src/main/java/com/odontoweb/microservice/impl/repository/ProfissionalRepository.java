package com.odontoweb.microservice.impl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.odontoweb.microservice.impl.model.Profissional;

public interface ProfissionalRepository extends JpaRepository<Profissional, Long> {

}
