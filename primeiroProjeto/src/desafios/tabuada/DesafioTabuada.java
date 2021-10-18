package desafios.tabuada;
import java.util.Scanner;

public class DesafioTabuada {
	public static void main(String[] args) {
		int resol;

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o numero para tabuada: ");
		int tabuada = sc.nextInt();
		System.out.print("Digite o limite: ");
		int vezes = sc.nextInt();

		System.out.println("Tabuada do " + tabuada );
		System.out.println(" ");

		for(int i = 0; i <= vezes; i++) {
			resol = tabuada*i;
			System.out.println( tabuada + " x " +  i + " = " + resol);
		}

		sc.close();

	}
}
