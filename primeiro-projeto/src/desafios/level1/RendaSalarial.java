package desafios.level1;

import java.util.Scanner;

public class RendaSalarial {
	public static void main(String[] args) {
		
		pedirRendaUsuario();	
	}
	
	static void pedirRendaUsuario() {
		
		Scanner sc = new Scanner (System.in);
		double renda1 = 0.0;
		double renda2 = 0.0 ;
		System.out.print("Insira renda da pessoa 1: ");
		renda1 = sc.nextDouble();
		System.out.print("Insira renda da pessoa 2: ");
		renda2 = sc.nextDouble();
		sc.close();
		calcularTotalDaRendaSalarial(renda1, renda2);
	}
	
	static void calcularTotalDaRendaSalarial(double r1, double r2){

		double soma = r1+r2;
		System.out.print("A renda total é: " + soma);

	}
}
