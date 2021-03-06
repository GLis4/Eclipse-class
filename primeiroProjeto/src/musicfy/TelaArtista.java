package musicfy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TelaArtista {
	
	static 	Scanner sc = new Scanner(System.in);
	static List<Artista> listArt = new ArrayList<>();


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
				deletarDadosArtista();
				System.out.println("Artista deletado");
				break;
			default:
				System.out.println("N?o existe essa op??o");
			}
		}while(opcao != 0);		
	}
	static void pedirDadosArtista() {
		
		Artista ar = new Artista();
		
		System.out.println("Informe o nome      : ");
		ar.nome = sc.nextLine();
		System.out.println("Informe o genero    : ");
		ar.genero = sc.nextLine();
		
		listArt.add(ar);
		
	} 
	static void mostrarDadosArtista() {
		for(int i= 0; i<listArt.size(); i++) {
			System.out.println("\nArtista");
			System.out.println("Nome     : " + listArt.get(i).nome);
			System.out.println("Genero   : " + listArt.get(i).nome);
		}
		
	}

	static void alterarDadosArtista() {

		if(listArt.isEmpty()) {
			System.out.println("N?o existe dados para alterar");
		} else {
			System.out.println("\n Escolha o(s) dado(s) do artista que devem ser alterados: ");
			System.out.println(" 1- Mudar todos os dados \n"+ 
					" 2- Mudar nome \n" +
					" 4- Mudar a descri??o ");		
			int escolhaAlterar =Integer.parseInt( sc.nextLine());

			switch (escolhaAlterar) {
			case 1: 
				
				break;
			case 2 : 
				System.out.println("Informe o nome : ");
				listArt.get(0).nome = sc.nextLine();
				break;
			case 3 : 
				System.out.println("Informe o genero : ");
				listArt.get(0).genero = sc.nextLine();
				break;
			default:
				System.out.println("N?o ? uma op??o valida");
				break;
			}
		}
	}

	static void deletarDadosArtista() {
		if(listArt.isEmpty() ) {
			System.out.println("N?o existe dados para alterar");
		} else {
			listArt.remove(0);
			
		
		}
	}
}
