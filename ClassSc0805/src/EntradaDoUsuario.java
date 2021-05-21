import java.util.Scanner;

public class EntradaDoUsuario {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Digite sua primeira nota: ");
		int idade = sc.nextInt();
		System.out.println(idade);
		sc.close();
	} 
}
