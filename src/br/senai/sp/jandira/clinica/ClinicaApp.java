package br.senai.sp.jandira.clinica;

import java.time.LocalDate;

import br.senai.sp.jandira.clinica.model.Paciente;

public class ClinicaApp {

	public static void main(String[] args) {

		// Criar um objeto do tipo Paciente
		Paciente p1 = new Paciente();
		p1.setNome("ana maria");
		p1.cpf = "940.028.922-11";
		p1.setAltura(1.63);
		p1.setPeso(75.490);
		p1.telefone = "(11) 4002-8922";
		p1.dataNascimento = LocalDate.of(2003, 8, 16);

		Paciente p2 = new Paciente();
		p2.setNome("vinicius");
		p2.cpf = "128.392.542-90";
		p2.setAltura(1.70);
		p2.setPeso(75);
		p2.telefone = "(11) 94002-8922";
		p2.dataNascimento = LocalDate.of(2007, 3, 10);
		System.out.println(p2.dataNascimento);
		System.out.println(p2.dataNascimento.getDayOfWeek());
		p1.mostrarDados();
		p2.mostrarDados();
	    
		String teste = p1.getNome();
		System.out.println(teste.toLowerCase());
		System.out.println(p2.getNome());

	}

}
