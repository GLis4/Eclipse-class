package musicfy;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class TelaMusica {

	static	Musica ms = new Musica();

	static 	Scanner sc = new Scanner(System.in);
	static List<Musica> listMs = new ArrayList<>();


	static void selecionarOpcao() {
		int opcao;
		do {

			System.out.println("0- Voltar para o menu inicial");
			System.out.println("1- Incluir Musica");
			System.out.println("2- Consultar Musica");
			System.out.println("3- Alterar musica");
			System.out.println("4- Deletar Musica");
			opcao=  Integer.parseInt(sc.nextLine());

			switch(opcao) {
			case 0:
				TelaInicial.selecionarOpcao();
				break;
			case 1 :
				incluirDadosMusica();
				break;
			case 2:
				mostrarDadosMusica();
				break;
			case 3:
				alterarDadosMusica();
				break;
			case 4: 
				System.out.println("Musica deletada");
				TelaMusica.deletarDadosMusica();
				break;
			default:
				System.out.println("N�o existe essa op��o");
			}
		}while(opcao != 0);		
	}

	static void incluirDadosMusica() {

		Musica musica = new Musica();
		System.out.println("Informe o nome : ");
		musica.nome = sc.nextLine();
		System.out.println("Informe o genero : ");
		musica.genero = sc.nextLine();
		System.out.println("Informe a dura��o  : ");
		musica.duracao = Double.parseDouble(sc.nextLine());
		System.out.println("Informe o artista : ");
		musica.artista = sc.nextLine();

		listMs.add(musica);

	} 
	static void mostrarDadosMusica() {
		
		for(int i = 0; i < listMs.size(); i++ ) { 
			System.out.println("Musica # " + i + "\n");
			System.out.println("Nome   : " +listMs.get(0).nome);
			System.out.println("Genero : " +listMs.get(0).artista);
			System.out.println("Dura��o: " +listMs.get(0).genero);
			System.out.println("Artista: " + listMs.get(0).duracao);
			System.out.println();
		}
	}

	static void alterarDadosMusica() {

	}

	static void deletarDadosMusica() {
		if(listMs.isEmpty()) {
			System.out.println("N�o existe dados para alterar");
		} else {
			System.out.println("Deseja remover..." + "\n 1- Todas \n 2- Somente uma musica");
			int choose = Integer.parseInt(sc.nextLine());
			switch(choose) { 
			case 1:
				listMs.removeAll(listMs);
			case 2: 
				System.out.println("Digite o ID da musica");
			int deleteIndex =  Integer.parseInt(sc.nextLine());
			listMs.remove(deleteIndex);
			}
		}
	}
}

