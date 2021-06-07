package br.ucsal.arquitetura.MicroPaciente.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ucsal.arquitetura.MicroPaciente.model.Paciente;
import br.ucsal.arquitetura.MicroPaciente.service.PacienteService;

@RestController
@RequestMapping("/Paciente")
public class PacienteController {
	
	@GetMapping("/ObterNomeViaCpf/{Cpf}")
	public String obterNomeViaCpf(@PathVariable(name = "Cpf") String cpf) {
		return (new PacienteService().obterNomeViaCpf(cpf));
	}
	
	@GetMapping("/ObterPlanoDeSaudeViaCpf/{Cpf}")
	public Paciente obterPlanoDeSaudeViaCpf(@PathVariable(name = "Cpf") String cpf) {
		return (new PacienteService().obterPlanoDeSaudeViaCpf(cpf));
	}
	
	@GetMapping("/ObterConsultasViaCpf/{Cpf}") 
	public List<String> obterConsultasViaCpf(@PathVariable(name = "Cpf") String cpf) {
		return (new PacienteService().obterListaDeConsultas(cpf));
	}
}
