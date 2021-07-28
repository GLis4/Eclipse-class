package musicfy;

import java.util.Scanner;

public class Tela {

	static	Musica ms = new Musica();
	static 	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int opcao = pedirOpcaoMenu();
		do {	
			switch(opcao) {
			case 1 :
				pedirDadosMusica();
				break;
			case 2:
				mostrarDadosMusica();
				break;
			case 3:
				alterarDadosMusica();
				break;
			case 4: 
				deletarDadosMusica();
				break;
			default:
				System.out.println("N�o existe essa op��o");
			}
		}while(opcao != 0);

	}
	static void pedirDadosMusica() {


		System.out.println("Informe o nome : ");
		ms.nome = sc.nextLine();
		System.out.println("Informe o genero : ");
		ms.genero = sc.nextLine();
		System.out.println("Informe a dura��o  : ");
		ms.duracao = Double.parseDouble(sc.nextLine());
		System.out.println("Informe o artista : ");
		ms.artista = sc.nextLine();
	} 
	static void mostrarDadosMusica() {
		System.out.println("\nMusica");
		System.out.println("Nome   : " + ms.nome);
		System.out.println("Genero : " + ms.genero);
		System.out.println("Dura��o: " + ms.duracao);
		System.out.println("Artista: " + ms.artista + "\n");
	}
	static int pedirOpcaoMenu(){
		System.out.println("0- Sair");
		System.out.println("1- Incluir Musica");
		System.out.println("2- Consultar Musica");
		System.out.println("3- Alterar musica");
		System.out.println("4- Deletar Musica");

		return Integer.parseInt(sc.nextLine());
	}
	static void alterarDadosMusica() {

		if(ms.nome == null && ms.genero == null && ms.duracao == 0 && ms.artista == null ) {
			System.out.println("N�o existe dados para alterar");

		} else {
			System.out.println("\n Escolha o(s) dado(s) da musica que devem ser alterados: ");
			System.out.println(" 1- Mudar todos os dados \n"+ 
					" 2- Mudar nome \n" +
					" 3-Mudar genero \n" +
					" 4- Mudar a dura��o \n" + 
					" 5- Mudar o nome do artista");		
			int escolhaAlterar =Integer.parseInt( sc.nextLine());

			switch (escolhaAlterar) {
			case 1: 
				pedirDadosMusica();
				break;
			case 2 : 
				System.out.println("Informe o nome : ");
				ms.nome = sc.nextLine();
				break;
			case 3 : 
				System.out.println("Informe o genero : ");
				ms.genero = sc.nextLine();
				break;
			case 4 : 
				System.out.println("Informe a dura��o  : ");
				ms.duracao = Double.parseDouble(sc.nextLine());
				break;
			case 5 : 
				System.out.println("Informe o artista : ");
				ms.artista = sc.nextLine();
				break;
			default:
				System.out.println("N�o � uma op��o valida");
				break;
			}
		}



	}
	static void deletarDadosMusica() {

		ms.nome = "";
		ms.genero = "";
		ms.duracao = 0;
		ms.artista = "";
	}

}


