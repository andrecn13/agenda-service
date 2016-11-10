package com.odontoweb.microservice.impl.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.odontoweb.microservice.impl.model.enums.StatusEvento;

@Entity
@Table(name = "TBL_EVENTO")
public class Evento implements Serializable {

	private static final long serialVersionUID = -2835460669437123413L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long idEvento;

	@Column(name = "BOO_CONFIRMADO")
	private Boolean confirmado;

	@Column(name = "BOO_ENCAIXE")
	private Boolean encaixe;

	@Column(name = "STR_STATUS_EVENTO")
	@Enumerated(EnumType.STRING)
	private StatusEvento statusEvento;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "FK_TIPO_CONSULTA")
	private TipoConsulta tipoConsulta;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "FK_PACIENTE")
	private Paciente paciente;

	@Column(name = "NUM_ANO")
	private Integer ano;

	@Column(name = "NUM_MES")
	private Integer mes;

	@Column(name = "NUM_DIA")
	private Integer dia;

	@Column(name = "NUM_HORA")
	private Integer hora;

	@Column(name = "NUM_MINUTO")
	private Integer minuto;

	@Column(name = "STR_OBSERVACAO")
	private String observacao;

	public Evento() {
	}

	public Evento(Long idEvento, Boolean confirmado, Boolean encaixe, StatusEvento statusEvento,
			TipoConsulta tipoConsulta, Paciente paciente, Integer ano, Integer mes, Integer dia, Integer hora,
			Integer minuto, String observacao) {
		this.idEvento = idEvento;
		this.confirmado = confirmado;
		this.encaixe = encaixe;
		this.statusEvento = statusEvento;
		this.tipoConsulta = tipoConsulta;
		this.paciente = paciente;
		this.ano = ano;
		this.mes = mes;
		this.dia = dia;
		this.hora = hora;
		this.minuto = minuto;
		this.observacao = observacao;

	}

	public Long getIdEvento() {
		return idEvento;
	}

	public void setIdEvento(Long idEvento) {
		this.idEvento = idEvento;
	}

	public Boolean getConfirmado() {
		return confirmado;
	}

	public void setConfirmado(Boolean confirmado) {
		this.confirmado = confirmado;
	}

	public Boolean getEncaixe() {
		return encaixe;
	}

	public void setEncaixe(Boolean encaixe) {
		this.encaixe = encaixe;
	}

	public StatusEvento getStatusEvento() {
		return statusEvento;
	}

	public void setStatusEvento(StatusEvento statusEvento) {
		this.statusEvento = statusEvento;
	}

	public TipoConsulta getTipoConsulta() {
		return tipoConsulta;
	}

	public void setTipoConsulta(TipoConsulta tipoConsulta) {
		this.tipoConsulta = tipoConsulta;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Integer getMes() {
		return mes;
	}

	public void setMes(Integer mes) {
		this.mes = mes;
	}

	public Integer getDia() {
		return dia;
	}

	public void setDia(Integer dia) {
		this.dia = dia;
	}

	public Integer getHora() {
		return hora;
	}

	public void setHora(Integer hora) {
		this.hora = hora;
	}

	public Integer getMinuto() {
		return minuto;
	}

	public void setMinuto(Integer minuto) {
		this.minuto = minuto;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	@Override
	public String toString() {
		return "Evento [id=" + idEvento + ", confirmado=" + confirmado + ", encaixe=" + encaixe + ", statusEvento="
				+ statusEvento + ", tipoConsulta=" + tipoConsulta + ", paciente=" + paciente + ", ano=" + ano + ", mes="
				+ mes + ", dia=" + dia + ", hora=" + hora + ", minuto=" + minuto + ", observacao=" + observacao + "]";
	}

}
