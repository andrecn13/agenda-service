package com.odontoweb.microservice.impl.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.CascadeType;
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

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "FK_AGENDA")
	private Agenda agenda;

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

	@Column(name = "NUM_HORA_INICIO")
	private Integer horaInicio;

	@Column(name = "NUM_HORA_FIM")
	private Integer horaFim;

	@Column(name = "NUM_MINUTO_INICIO")
	private Integer minutoInicio;

	@Column(name = "NUM_MINUTO_FIM")
	private Integer minutoFim;

	@Column(name = "STR_OBSERVACAO")
	private String observacao;

	@Column(name = "DTA_EVENTO")
	private Date dataEvento;

	public Evento() {
	}

	public Evento(Long idEvento, Boolean encaixe, StatusEvento statusEvento, TipoConsulta tipoConsulta, Agenda agenda,
			Paciente paciente, Integer ano, Integer mes, Integer dia, Integer horaInicio, Integer horaFim,
			Integer minutoInicio, Integer minutoFim, String observacao) {
		this.idEvento = idEvento;
		this.encaixe = encaixe;
		this.statusEvento = statusEvento;
		this.tipoConsulta = tipoConsulta;
		this.agenda = agenda;
		this.paciente = paciente;
		this.ano = ano;
		this.mes = mes;
		this.dia = dia;
		this.horaInicio = horaInicio;
		this.horaFim = horaFim;
		this.minutoInicio = minutoInicio;
		this.minutoFim = minutoFim;
		this.observacao = observacao;
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, ano);
		cal.set(Calendar.MONTH, mes);
		cal.set(Calendar.DAY_OF_MONTH, dia);
		cal.set(Calendar.HOUR, horaInicio);
		cal.set(Calendar.MINUTE, minutoInicio);

		this.dataEvento = cal.getTime();

	}

	public Long getIdEvento() {
		return idEvento;
	}

	public void setIdEvento(Long idEvento) {
		this.idEvento = idEvento;
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

	public Integer getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(Integer horaInicio) {
		this.horaInicio = horaInicio;
	}

	public Integer getHoraFim() {
		return horaFim;
	}

	public void setHoraFim(Integer horaFim) {
		this.horaFim = horaFim;
	}

	public Integer getMinutoInicio() {
		return minutoInicio;
	}

	public void setMinutoInicio(Integer minutoInicio) {
		this.minutoInicio = minutoInicio;
	}

	public Integer getMinutoFim() {
		return minutoFim;
	}

	public void setMinutoFim(Integer minutoFim) {
		this.minutoFim = minutoFim;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Date getDataEvento() {
		return dataEvento;
	}

	public void setDataEvento(Date dataEvento) {
		this.dataEvento = dataEvento;
	}

	public Agenda getAgenda() {
		return agenda;
	}

	public void setAgenda(Agenda agenda) {
		this.agenda = agenda;
	}

	@Override
	public String toString() {
		return "Evento [id=" + idEvento + ", encaixe=" + encaixe + ", statusEvento=" + statusEvento + ", tipoConsulta="
				+ tipoConsulta + ", agenda" + agenda + ", paciente=" + paciente + ", ano=" + ano + ", mes=" + mes
				+ ", dia=" + dia + ", horaInicio=" + horaInicio + ", horaFim=" + horaFim + ", minutoInicio="
				+ minutoInicio + ", minutoFim=" + minutoFim + ", observacao=" + observacao + "]";
	}

}
