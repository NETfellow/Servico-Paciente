package br.ucsal.arquitetura.MicroPaciente.service;

import java.util.ArrayList;
import java.util.List;

import br.ucsal.arquitetura.MicroPaciente.model.Paciente;

public class PacienteService {
	public String obterNomeViaCpf(String cpf) {
		List<Paciente> pacientes = obterTodosPacientes();

		for (Paciente paciente : pacientes) {
			if (paciente.getCpf().equals(cpf)) {
				return paciente.getNome();
			}
		}

		return "Paciente não encontrado";
	}

	public Paciente obterPlanoDeSaudeViaCpf(String cpf) {
		List<Paciente> pacientes = obterTodosPacientes();

		for (Paciente paciente : pacientes) {
			if (paciente.getCpf().equals(cpf)) {
				return paciente;
			}
		}

		return new Paciente();
	}
	
	public List<String> obterListaDeConsultas(String cpf) {
		List<Paciente> pacientes = obterTodosPacientes();

		for (Paciente paciente : pacientes) {
			if (paciente.getCpf().equals(cpf) && paciente.getConsultas() != null) {
				return paciente.getConsultas();
			}
		}

		return new ArrayList<String>();
	}

	private List<Paciente> obterTodosPacientes() {
		List<Paciente> pacientes = new ArrayList<Paciente>();
		List<String> consultas = new ArrayList<String>();
		consultas.add("Cardiologista");
		consultas.add("clinico");
		consultas.add("neurologista");

		Paciente paciente1 = new Paciente();
		Paciente paciente2 = new Paciente();
		Paciente paciente3 = new Paciente();
		Paciente paciente4 = new Paciente();

		paciente1.setNome("Yllo");
		paciente1.setCpf("88888888863");
		paciente1.setDescricaoPlano("SUS");
		paciente1.setIdPlano(1);
		paciente1.setConsultas(consultas);

		paciente2.setNome("Carlos");
		paciente2.setCpf("88888888864");
		paciente2.setDescricaoPlano("Hapvida");
		paciente2.setIdPlano(2);

		paciente3.setNome("Maria");
		paciente3.setCpf("88888888865");
		paciente3.setDescricaoPlano("SUS Premium");
		paciente3.setIdPlano(3);

		paciente4.setNome("Elon Musk");
		paciente4.setCpf("88888888866");
		paciente4.setDescricaoPlano("SUS");
		paciente4.setIdPlano(1);

		pacientes.add(paciente1);
		pacientes.add(paciente2);
		pacientes.add(paciente3);
		pacientes.add(paciente4);

		return pacientes;
	}

}
