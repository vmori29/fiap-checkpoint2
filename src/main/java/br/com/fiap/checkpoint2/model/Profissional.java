package br.com.fiap.checkpoint2.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Profissionais")
public class Profissional extends AbstractEntity<Long>{

	@Column(nullable = false, length = 50)
	private String nome;
	
	@Column(nullable = false, length = 100)
	private String especialidade;
	
	@Column(columnDefinition = "NUMERIC(10,2)")
	private BigDecimal valor_hora;
	
	@Column(nullable = false, columnDefinition = "DATETIME")
	private LocalDate created_at;
	
	@Column(nullable = false, columnDefinition = "DATETIME")
	private LocalDate updated_at;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public BigDecimal getValor_hora() {
		return valor_hora;
	}

	public void setValor_hora(BigDecimal valor_hora) {
		this.valor_hora = valor_hora;
	}

	public LocalDate getCreated_at() {
		return created_at;
	}

	public void setCreated_at(LocalDate created_at) {
		this.created_at = created_at;
	}

	public LocalDate getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(LocalDate updated_at) {
		this.updated_at = updated_at;
	}
	
	
}
