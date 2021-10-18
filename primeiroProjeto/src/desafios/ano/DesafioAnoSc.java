package desafios.ano;
import java.util.Scanner;

public class DesafioAnoSc {
	public static void main (String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite sua idade: ");
		int idade = sc.nextInt();
		int resultado = 2021 - idade;
		System.out.println("Seu ano de nascimento é: " +resultado);
	    sc.close();
	    
	    
	}
}
