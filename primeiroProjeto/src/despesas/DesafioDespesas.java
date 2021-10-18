package despesas;

import java.util.Scanner;

public class DesafioDespesas {

	public static void main (String[] args) {
		
		System.out.println("Gastos: Moradia");
		Scanner sc = new Scanner(System.in);
		System.out.print("Aluguel ");
		float mAlguel = sc.nextFloat();
		System.out.print("Condominio ");
		float mCondominio = sc.nextFloat();
		float totalMoradia = mAlguel + mCondominio;
		System.out.println("Gasto mensal com moradia: " + totalMoradia);
		
		System.out.println("Gastos: Comunicação");
		System.out.print("Internet ");
		float cInternet = sc.nextFloat();
		System.out.print("Tv a cabo ");
		float cTv = sc.nextFloat();
		float totalComunicacao = cInternet + cTv;
		System.out.println("Gasto mensal com comunicação: " + totalComunicacao);
		sc.close();
		
		float gastoTotal = totalMoradia + totalComunicacao;
		float mediaTotal = gastoTotal/4;
		System.out.println("Gasto total mensal: " + gastoTotal);
		System.out.println(" Media do gasto mensal: " +mediaTotal);
		
		
	}
}
