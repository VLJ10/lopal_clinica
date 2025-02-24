package br.senai.sp.jandira.clinica;

import java.time.LocalDate;

import br.senai.sp.jandira.clinica.model.Paciente;

public class ClinicaApp {

	public static void main(String[] args) {
		
		// Criar um objeto do tipo Paciente
		Paciente p1 = new Paciente();
		p1.nome = "Ana Maria";
		p1.cpf = "940.028.922-11";
		p1.altura = 1.63;
		p1.peso = 75.490;
		p1.telefone = "(11) 4002-8922";
		p1.dataNascimento = LocalDate.of(2003, 8, 16);
	
		Paciente p2 = new Paciente();
		p2.nome = "Vinicius";
		p2.cpf = "128.392.542-90";		
		p2.altura = 1.70;	
		p2.peso = 74.600; 
		p2.telefone = "(11) 94002-8922";
		p2.dataNascimento = LocalDate.of(2007, 3, 10);
		System.out.println(p2.dataNascimento);
		System.out.println(p2.dataNascimento.getDayOfWeek());
		p1.mostrarDados();
		p2.mostrarDados();

	}

}
