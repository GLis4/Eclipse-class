package musicfy;

import java.util.Scanner;

public class TelaArtista {
	static	Artista ar = new Artista();
	static 	Scanner sc = new Scanner(System.in);

	static void executarOpcao() {
		int opcao;
		do {
			
			System.out.println("0- Voltar para o menu inicial");
			System.out.println("1- Incluir Artista");
			System.out.println("2- Consultar Artista");
			System.out.println("3- Alterar Artista");
			System.out.println("4- Deletar Artista");
			opcao=  Integer.parseInt(sc.nextLine());
			
			switch(opcao) {
			case 0:
				TelaInicial.selecionarOpcao();
				break;
			case 1 :
				pedirDadosArtista();
				break;
			case 2:
				mostrarDadosArtista();
				break;
			case 3:
				alterarDadosArtista();
				break;
			case 4: 
				System.out.println("Musica deletada");
				deletarDadosArtista();
				break;
			default:
				System.out.println("N�o existe essa op��o");
			}
		}while(opcao != 0);		
	}
	static void pedirDadosArtista() {

		System.out.println("Informe o nome      : ");
		ar.nome = sc.nextLine();
		System.out.println("Informe o genero    : ");
		ar.genero = sc.nextLine();
		System.out.println("Informe a descri��o : ");
		ar.descricao = sc.nextLine();
	} 
	static void mostrarDadosArtista() {
		System.out.println("\nArtista");
		System.out.println("Nome     : " + ar.nome);
		System.out.println("Genero   : " + ar.genero);
		System.out.println("Descri��o: " + ar.descricao);
	}

	static void alterarDadosArtista() {

		if(ar.nome == null && ar.genero == null && ar.descricao == null) {
			System.out.println("N�o existe dados para alterar");
		} else {
			System.out.println("\n Escolha o(s) dado(s) do artista que devem ser alterados: ");
			System.out.println(" 1- Mudar todos os dados \n"+ 
					" 2- Mudar nome \n" +
					" 3-Mudar genero \n" +
					" 4- Mudar a descri��o ");		
			int escolhaAlterar =Integer.parseInt( sc.nextLine());

			switch (escolhaAlterar) {
			case 1: 
				pedirDadosArtista();
				break;
			case 2 : 
				System.out.println("Informe o nome : ");
				ar.nome = sc.nextLine();
				break;
			case 3 : 
				System.out.println("Informe o genero : ");
				ar.genero = sc.nextLine();
				break;
			case 4 : 
				System.out.println("Informe a dura��o  : ");
				ar.descricao = sc.nextLine();
				break;
			default:
				System.out.println("N�o � uma op��o valida");
				break;
			}
		}
	}

	static void deletarDadosArtista() {
		if(ar.nome == null && ar.genero == null && ar.descricao ==  null ) {
			System.out.println("N�o existe dados para alterar");
		} else {
			
			ar.nome = "";
			ar.genero = "";
			ar.descricao = "";
		
		}
	}
}