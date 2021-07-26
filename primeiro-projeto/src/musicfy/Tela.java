package musicfy;

import java.util.Scanner;

public class Tela {

	public static void main(String[] args) {

		int opcao;
		String nome = null;
		String genero = null;
		double duracao = 0;
		String artista = null;

		Scanner sc = new Scanner(System.in);
		do {	
			System.out.println("0- Sair");
			System.out.println("1- Incluir Musica");
			System.out.println("2- Consultar Musica");
			System.out.println("3- Alterar musica");
			System.out.println("4- Deletar Musica");
			opcao = Integer.parseInt(sc.nextLine());

			switch(opcao) {

			case 1 :
				System.out.println("Informe o nome : ");
				nome = sc.nextLine();
				System.out.println("Informe o genero : ");
				genero = sc.nextLine();
				System.out.println("Informe a dura��o  : ");
				duracao = Double.parseDouble(sc.nextLine());
				System.out.println("Informe o artista : ");
				artista = sc.nextLine();
				break;
			case 2:
				System.out.println("\nMusica");
				System.out.println("Nome   : " + nome);
				System.out.println("Genero : " + genero);
				System.out.println("Dura��o: " + duracao);
				System.out.println("Artista: " + artista);
				break;
			case 3:
				if(nome == null && genero == null && duracao == 0 && artista == null ) {
					System.out.println("N�o existe dados para alterar");

				} else {
					System.out.println("\n Escolha o(s) dado(s) da musica que devem ser alterados: ");
					System.out.println(" 1- Mudar todos os dados \n"+ 
							" 2- Mudar nome \n" +
							" 3-Mudar genero \n" +
							" 4- Mudar a dura��o \n" + 
							" 5- Mudar o nome do artista");		


					int escolhaNegativaPositiva =Integer.parseInt( sc.nextLine());
					switch (escolhaNegativaPositiva) {
					case 1: 

						System.out.println("Informe o nome : ");
						nome = sc.nextLine();
						System.out.println("Informe o genero : ");
						genero = sc.nextLine();
						System.out.println("Informe a dura��o  : ");
						duracao = Double.parseDouble(sc.nextLine());
						System.out.println("Informe o artista : ");
						artista = sc.nextLine();
						break;
					case 2 : 
						System.out.println("Informe o nome : ");
						nome = sc.nextLine();
						break;
					case 3 : 
						System.out.println("Informe o genero : ");
						genero = sc.nextLine();
						break;
					case 4 : 
						System.out.println("Informe a dura��o  : ");
						duracao = Double.parseDouble(sc.nextLine());
						break;
					case 5 : 
						System.out.println("Informe o artista : ");
						artista = sc.nextLine();
						break;
					default:
						System.out.println("N�o � uma op��o valida");
						break;
					}
				}

				break;
			case 4: 
				nome = "";
				genero = "";
				duracao = 0;
				artista = "";
				break;
			default:
				System.out.println("N�o existe essa op��o");
			}
		} while(opcao != 0);

	}
}

