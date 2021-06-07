package br.ucsal.arquitetura.MicroPaciente.model;

import java.util.List;

public class Paciente {
	
	private String cpf;
	private String nome;
	private List<String> consultas;
	private Integer idPlano;
	private String descricaoPlano;
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<String> getConsultas() {
		return consultas;
	}
	
	public void setConsultas(List<String> consultas) {
		this.consultas = consultas;
	}
	
	public Integer getIdPlano() {
		return idPlano;
	}
	
	public void setIdPlano(Integer idPlano) {
		this.idPlano = idPlano;
	}
	
	public String getDescricaoPlano() {
		return descricaoPlano;
	}
	
	public void setDescricaoPlano(String descricaoPlano) {
		this.descricaoPlano = descricaoPlano;
	}
	
	
	
}
