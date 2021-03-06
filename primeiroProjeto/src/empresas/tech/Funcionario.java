package empresas.tech;

import java.util.Calendar;

public class Funcionario {
	int id;
	double salario;
	String nome;
	double bonus;
	Calendar dataNascimento;
	String endereco;
	Setor setor;
	
	
	public double retornarGanhos() {
		double totalGanho = salario + bonus;
		return totalGanho;
	}
	
	public int calcularIdade() {
		int idade = 0;
		Calendar agora =  Calendar.getInstance();
		int ano = 0;
		ano = agora.get(Calendar.YEAR);
		int anoNasc = dataNascimento.get(Calendar.YEAR);
		idade = ano - anoNasc;
		if(dataNascimento.get(Calendar.MONTH) + 1 > agora.get(Calendar.MONTH) + 1) {
	 			idade--;
	 		} else {
	 			if(dataNascimento.get(Calendar.DAY_OF_MONTH) > agora.get(Calendar.DAY_OF_MONTH)) {
	 				idade--;
	 			}
	 		}
		return idade;
	}
	
	public void complementarEndereco(String complemento) {
		endereco = endereco + complemento;
	}
		
}
