package desafios.level1;

import java.util.Scanner;

public class Frase {
	public static void main(String[] args) {

		mostrarTextoDeBoasVindas();
	}	

	static void mostrarTextoDeBoasVindas(){
		// o nome do programa é frase e calcula tabuada?
		
		System.out.print("Olá, como você vai?");
		System.out.print("Bem vindo ao programa Frase.");

	}	

	static void PedirTabuadaUsuario() {
		System.out.print("Insira abaixo a tabuada que deseja visualizar");
		Scanner sc = new Scanner(System.in);
		int tab = sc.nextInt();
		sc.close();
		calcularTabuada(tab);

	} 
	
	static void calcularTabuada(int tabuada) {
		for(int i = 0; i <= 10; i++) {
			int resol = tabuada*i;
			System.out.println( tabuada + " x " +  i + " = " + resol);
		}	
	} 
	
	static void mostrarDespedida() {
		
		System.out.print("Até mais \\o/");
	}
}
