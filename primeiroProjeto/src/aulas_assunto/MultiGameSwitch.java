package aulas_assunto;
import java.util.Scanner;

public class MultiGameSwitch{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escolha uma das op??es:"+ 8*4*3*2*1);
		System.out.println("1- Tabuleiro" );
		System.out.println("2- Damas");
		int opcaoSelecionada = sc.nextInt();
		

		switch(opcaoSelecionada) {
		case 1:
			System.out.print("Iniciando jogo Tabuleiro");
			break;
		case 2: 
			System.out.print("Iniciando jogo das damas");
			break;
		default:
			System.out.print("A op??o selecionada n?o existe");
			break;
		}
		
		//break(quebra de codigo) ignora tudo que estiver embaixo 
		
		sc.close();
	}	
}


