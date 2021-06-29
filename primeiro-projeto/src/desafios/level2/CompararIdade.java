package desafios.level2;

import java.util.Scanner;

public class CompararIdade {
	public static void main(String[] args) {
		pedirDadosUsuario();
	}

	static void pedirDadosUsuario() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o nome da primeira pessoa ");
		String nome1 = sc.next();
		System.out.println("Insira a idade 1 ");
		int idade1 = sc.nextInt();
		System.out.println("Insira o nome da segunda pessoa");
		String nome2 = sc.next();
		System.out.println("Insira a idade 2");
		int idade2 = sc.nextInt();
		sc.close();
		compararIdades(idade1, idade2, nome1, nome2);

	}

	static void compararIdades(int idade1, int idade2, String nome1, String nome2) {
		if(idade1>idade2) {
			System.out.println("A " + nome1 + " é mais velha");
		}else {
			System.out.println("A " + nome2 + " é mais velha");
		}
	}
}
