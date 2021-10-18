package empresas.tech;

import java.util.Calendar;

public class TesteIdade {
	
	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		Calendar c = Calendar.getInstance();
		c.set(2004, 11, 10);
		
		f.dataNascimento = c;
		
		int idade = f.calcularIdade();
		
		System.out.println(idade);

	}
}
