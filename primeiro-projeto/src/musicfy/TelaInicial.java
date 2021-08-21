package musicfy;

import java.util.Scanner;

public class TelaInicial {

	static 	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		selecionarOpcao();
	}
	static void selecionarOpcao() {
		int opcao;
		do {	
			System.out.println("0- Sair");
			System.out.println("1- Musica");
			System.out.println("2- Artista");
			opcao =  Integer.parseInt(sc.nextLine());
			
			switch(opcao) {
			case 1 :
				TelaMusica.selecionarOpcao();
				break;
			case 2:
				TelaArtista.executarOpcao();;
				break;
			default:
				System.out.println("N�o existe essa op��o");
			}
		}while(opcao != 0);		
	}
}
