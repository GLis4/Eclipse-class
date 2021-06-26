package desafios.level1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FormaGeometrica {
	public static void main(String[] args) {
		PedirRaioCirculo();
		
	}
	static void PedirRaioCirculo() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o raio do circulo: ");
		int raioCirculo = sc.nextInt();
		sc.close();
		calcularAreaCirculo(raioCirculo);
	} 
	
	static void calcularAreaCirculo( int raio ) {
		double resul = 3.14 * raio*raio;
		DecimalFormat df = new DecimalFormat("#,###.00");
		System.out.print("Area do circulo: " + df.format(resul));
		PedirBaseAlturaRetangulo();

	}static void PedirBaseAlturaRetangulo() {
		Scanner s = new Scanner(System.in);
		System.out.println("Insira a base do retangulo: ");
		int baseRect = s.nextInt();
		System.out.print("Insira a altura do retangulo: ");
		int alturaRect = s.nextInt();
		s.close();
		calcularAreaRetangulo( baseRect, alturaRect);
		
	}static void calcularAreaRetangulo( int base, int altura ) {
		double resul = base*altura;
		System.out.print("Area do retangulo: " + resul);	}
}
