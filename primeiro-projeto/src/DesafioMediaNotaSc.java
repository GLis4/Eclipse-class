import java.util.Scanner;

public class DesafioMediaNotaSc {
	public static void main (String[] args) {

		int peso1 = 2;
		int peso2 = 4;
		int peso3 = 8;
		int pesos = peso1 + peso2 + peso3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual sua primeira nota: ");
		float nota1 = sc.nextFloat();
		System.out.println("Qual sua segunda nota: ");
		float nota2 = sc.nextFloat();
		System.out.println("Qual sua terceira nota: ");
		float nota3 = sc.nextFloat();
		sc.close();

		float mult = nota1*peso1 + nota2*peso2 + nota3*peso3;
		float media = mult/pesos;
		System.out.println("Sua media é :"+ media);

	}
}
