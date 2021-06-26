package desafios.level1;

import java.util.Scanner;

public class AnoDeNascimento {
	public static void main(String[] args) {
		pedirAnoDeNascimento();

	} static void calcularAnoDeNascimento(int i) {

		int resultado = 2021 - i;
		System.out.println("Seu ano de nascimento é: " +resultado);
	}

	static void pedirAnoDeNascimento() {
		Scanner sc = new Scanner (System.in);
		System.out.print("Insira sua idade");
		int idade=	sc.nextInt();
		sc.close();
		calcularAnoDeNascimento(idade);

	}
}
