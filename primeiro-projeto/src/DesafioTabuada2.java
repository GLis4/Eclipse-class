import java.util.Scanner;

public class DesafioTabuada2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String respC;

		do {
			System.out.println("Voc� deseja... ");
			System.out.println("1- calcular uma multiplica��o? ");
			System.out.println("2- visualizar uma tabuada?");

			int tF = sc.nextInt();

			switch (tF) {   

			case 1: 
				System.out.print("Digite o primeiro valor da multiplica��o: ");
				int primeiroV  = sc.nextInt();
				System.out.print("Digite o segundo valor da multiplica��o: ");
				int segundoV  = sc.nextInt();
				System.out.println("Resultado da multiplica��o �: " + primeiroV*segundoV);
				break;

			case 2 :
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

				break;
			default:
				System.out.println("Digite uma das op��es validas");
				break;

			}

			System.out.println("Deseja fazer os calculos novamente? (S/N)");
			respC = sc.next();
			if(respC.equalsIgnoreCase("n")) {
				sc.close();
			}
		} while(respC.equalsIgnoreCase("s"));

	}
}
