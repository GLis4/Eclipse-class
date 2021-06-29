package desafios.level2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FormaGeometrica2 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		PedirRaioCirculo();
	}
	static void PedirRaioCirculo() {


		System.out.println("Insira o raio do circulo: ");
		int raioCirculo = sc.nextInt();
		calcularAreaCirculo(raioCirculo);
	} 

	static void calcularAreaCirculo( int raio ) {
		double resul = 3.14 * raio*raio;
		DecimalFormat df = new DecimalFormat("#,###.00");
		System.out.println("Area do circulo: " + df.format(resul));
		PedirBaseAlturaRetangulo();

	}

	static void PedirBaseAlturaRetangulo() {

		System.out.println("Insira a base do retangulo: ");
		int baseRect = sc.nextInt();
		System.out.print("Insira a altura do retangulo: ");
		int alturaRect = sc.nextInt();
		sc.close();
		calcularAreaRetangulo( baseRect, alturaRect);

	}

	static void calcularAreaRetangulo( int base, int altura ) {
		double resul = base*altura;
		System.out.print("Area do retangulo: " + resul);	
	} 

	static void PedirBaseAlturaTriangulo() {
		System.out.println("Insira a base do triangulo: ");
		int baseTri = sc.nextInt();
		System.out.print("Insira a altura do triangulo: ");
		int alturaTri = sc.nextInt();
		sc.close();
		calcularAreaTriangulo( baseTri, alturaTri);	
	} static void checarValores(int base, int altura) {
		if (base < 0 && altura < 0 ) {
			System.out.print("ERRO, NAO É POSSIVEL CALCULAR A AREA COM VALORES NEGATIVOS");
		}else {
			calcularAreaTriangulo(base, altura);
		}
		}

		static void calcularAreaTriangulo( int base, int altura ) {
			double resul = base*altura;
			System.out.print("Area do retangulo: " + resul);	
	} 
}
