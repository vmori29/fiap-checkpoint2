package br.com.fiap.checkpoint2.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Consultas")
public class Consulta extends AbstractEntity<Long>{

	@ManyToOne
	@JoinColumn(name = "profissional_id_fk", nullable = false, columnDefinition = "NUMERIC")
	private Profissional profissional_id;
	
	@ManyToOne
	@JoinColumn(name = "paciente_id_fk", nullable = false, columnDefinition = "NUMERIC")
	private Paciente paciente_id;
	
	@Column(nullable = false, columnDefinition = "DATETIME")
	private LocalDate data_consulta;
	
	
	@Column(nullable = false, length = 9)
	@Enumerated(EnumType.STRING)
	@JdbcTypeCode(SqlTypes.CHAR)
	private StatusConsulta status_consulta;
	
	@Column(columnDefinition = "NUMERIC")
	private Double quantidade_horas;
	
	@Column(columnDefinition = "NUMERIC(20,2)")
	private BigDecimal valor_consulta;

	public Profissional getProfissional_id() {
		return profissional_id;
	}

	public void setProfissional_id(Profissional profissional_id) {
		this.profissional_id = profissional_id;
	}

	public Paciente getPaciente_id() {
		return paciente_id;
	}

	public void setPaciente_id(Paciente paciente_id) {
		this.paciente_id = paciente_id;
	}

	public LocalDate getData_consulta() {
		return data_consulta;
	}

	public void setData_consulta(LocalDate data_consulta) {
		this.data_consulta = data_consulta;
	}

	public StatusConsulta getStatus_consulta() {
		return status_consulta;
	}

	public void setStatus_consulta(StatusConsulta status_consulta) {
		this.status_consulta = status_consulta;
	}

	public Double getQuantidade_horas() {
		return quantidade_horas;
	}

	public void setQuantidade_horas(Double quantidade_horas) {
		this.quantidade_horas = quantidade_horas;
	}

	public BigDecimal getValor_consulta() {
		return valor_consulta;
	}

	public void setValor_consulta(BigDecimal valor_consulta) {
		this.valor_consulta = valor_consulta;
	}
	

}
