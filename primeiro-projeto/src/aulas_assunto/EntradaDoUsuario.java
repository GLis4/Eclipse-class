package aulas_assunto;
import java.util.Scanner;

public class EntradaDoUsuario {
	public static void main (String[] args) {
	
		Scanner sc = new Scanner (System.in);
		System.out.print("Digite sua idade: ");
		int idade = sc.nextInt();
		System.out.println(idade);
		sc.close();

	} 
}
