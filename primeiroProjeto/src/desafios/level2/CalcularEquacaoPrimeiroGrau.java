package desafios.level2;

import java.util.Scanner;

public class CalcularEquacaoPrimeiroGrau {
	static double x;
	public static void main(String[] args) {

		pegarDadoUsuario();

	}

	public static double resolveEquacao(double a, double b) {
		
		x= -b/a;
		return x;
	}	
	public static void pegarDadoUsuario() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Formula: ax+b = 0"); 	
		System.out.println("Informe o valor do A: "); 	
		double a = sc.nextInt();
		System.out.println("Informe o valor do B: "); 	
		double b = sc.nextInt();
		sc.close();
		checarResultado(a, b);
		
	}  
	
	public static void checarResultado(double a, double b) {
		
		if(a != 0 ) {
			System.out.println( a + x + "+" + b + "= 0" );
			x = resolveEquacao(a, b );
			System.out.println("x=" + x );
			
		}else {
			System.out.print("A equação não é do primeiro grau");
		}
	}
}
