import java.util.Scanner;

public class DesafioTabuada2 {
	public static void main(String[] args) {

		System.out.print("Deseja calcular uma multiplicação? (S/N) ");
		
		Scanner sc = new Scanner(System.in);
		String tF = sc.next();
		 
		if( tF.equals("S")) {
			System.out.print("Digite o primeiro valor da multiplicação: ");
			int primeiroV  = sc.nextInt();
			System.out.print("Digite o segundo valor da multiplicação: ");
			int segundoV  = sc.nextInt();
			System.out.println("Resultado da multiplicação é: " + primeiroV*segundoV);
		}
		
		System.out.println("");
		
		System.out.println("Deseja visualizar uma tabuada?  (S/N)");
		 tF = sc.next();
		 
		if(tF.equals("S")) {
			
			int resol;
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
			
		}
		
		sc.close();
	}
}
