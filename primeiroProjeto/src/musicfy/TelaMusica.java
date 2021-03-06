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
				TelaMusica.deletarDadosMusica();
				System.out.println("Musica deletada");
				break;
			default:
				System.out.println("N?o existe essa op??o");
			}
		}while(opcao != 0);		
	}

	static void incluirDadosMusica() {

		Musica music = new Musica();
		System.out.println("Informe o nome : ");
		music.nome = sc.nextLine();
		System.out.println("Informe o genero : ");
		music.genero = sc.nextLine();
		System.out.println("Informe a dura??o  : ");
		music.duracao = Double.parseDouble(sc.nextLine());

		incluirArtistaMusica(music);

		listMs.add(music);

	} 

	static void mostrarDadosMusica() {

		for(int i = 0; i < listMs.size(); i++ ) { 
			System.out.println("Musica # " + i);
			System.out.println("Nome   : " + listMs.get(i).nome);
			System.out.println("Genero : " + listMs.get(i).genero);
			System.out.println("Dura??o: " + listMs.get(i).duracao);
			System.out.println("Artista: " + listMs.get(i).artista.nome);
			System.out.println();
		}
	}

	static void alterarDadosMusica() {
		if(listMs.isEmpty()) {
			System.out.println("N?o existe dados para alterar");
		} else {
			//mostrarDadosMusica();
			//System.out.println("Deseja alterar musica de numero...");
			//int changeIndex = Integer.parseInt(sc.next()); 
			System.out.println("0- Voltar menu anterior\n1- Alterar todos os dados\n2- Alterar nome\n3- Alterar genero\n4- Alterar dura??o\n5- ALterar artista.");
			int	choose = Integer.parseInt(sc.nextLine());
			switch(choose) {

			case 1 : 
				System.out.println("Informe o nome : ");
				listMs.get(0).nome = sc.nextLine();
				System.out.println("Informe o genero : ");
				listMs.get(0).genero = sc.nextLine();
				System.out.println("Informe a dura??o  : ");
				listMs.get(0).duracao = Double.parseDouble(sc.nextLine());
				incluirArtistaMusica(listMs.get(0));
				break;

			case 2 : 
				System.out.println("Informe o nome : ");
				listMs.get(0).nome = sc.nextLine();
				break;

			case 3 : 
				System.out.println("Informe o genero : ");
				listMs.get(0).genero = sc.nextLine();
				break;

			case 4 :
				System.out.println("Informe a dura??o  : ");
				listMs.get(0).duracao = Double.parseDouble(sc.nextLine());
				break;

			case 5 : 
				incluirArtistaMusica(listMs.get(0));
				break;

			default: 
				System.out.println("opcao invalida...");
				break;

			}
		}
	}

	static void deletarDadosMusica() {
		if(listMs.isEmpty()) {
			System.out.println("N?o existe dados para alterar");
		} else {
			System.out.println("Deseja remover..." + "\n 1- Todas \n 2- Somente uma musica");
			int choose = Integer.parseInt(sc.nextLine());
			switch(choose) { 
			case 1:
				listMs.removeAll(listMs);
				break;
			case 2: 

				mostrarDadosMusica();

				System.out.println("Digite o ID da musica que deseja deletar: ");
				int deleteIndex =  Integer.parseInt(sc.nextLine());
				listMs.remove(deleteIndex);

				break;
			}
		}
	}

	static void incluirArtistaMusica(Musica musica) {
		int opcao = -1 ;

		while(opcao != 0){	
			System.out.println(" 0 - Finalizar escolha artista \n 1- Incluir novo artista\n 2- escolher artista j? cadastrados ");
			opcao = Integer.parseInt(sc.nextLine());

			switch(opcao) {
			case 1: 

				TelaArtista.pedirDadosArtista();
				musica.artista = TelaArtista.listArt.get(TelaArtista.listArt.size()-1); 


				break;
			case 2 :
				if(TelaArtista.listArt.isEmpty()) {
					System.out.println("N?o existe nenhum artista cadastrado");
				}else {
					for(int i = 0; i < TelaArtista.listArt.size(); i++ ) { 
						System.out.println("Artistas cadastrados: \n");
						System.out.println("#" + i +  "  Nome    : " + TelaArtista.listArt.get(i).nome);
						System.out.println("Est? musica pertence ao artista...");
						int idArt = Integer.parseInt(sc.nextLine());
						musica.artista = TelaArtista.listArt.get(idArt);
					}
				}
				break;
			}
		}
	}
}

