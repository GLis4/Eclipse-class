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

		int opcao = -1;
		do {
			System.out.println("0 - Finalizado Cadastro \n 1- Incluir novo artista\n 2- escolher artista j� cadastrados ");
			opcao = Integer.parseInt(sc.nextLine());

			switch(opcao) {
			case 1: 
				Artista art = new Artista();
				System.out.println("Informe o nome : ");
				art.nome = sc.nextLine();
				System.out.println("Informe o genero : ");
				art.genero = sc.nextLine();
				musica.artista = art;
				break;
			case 2 :
				if(TelaArtista.listArt.isEmpty()) {
					System.out.println("N�o existe nenhum artista cadastrado");
				}else {
					for(int i = 0; i < TelaArtista.listArt.size(); i++ ) { 
						System.out.println("Artistas cadastrados: \n");
						System.out.println("# " + i +  "Nome    : " + TelaArtista.listArt.get(i).nome);
						System.out.println("Est� musica pertence ao artista...");
						int idArt = Integer.parseInt(sc.nextLine());
						musica.artista = TelaArtista.listArt.get(idArt);
					}


				}
				break;
			}
		}while(opcao != 0);

		listMs.add(musica);

	} 
	static void mostrarDadosMusica() {

		for(int i = 0; i < listMs.size(); i++ ) { 
			System.out.println("Musica # " + i + "\n");
			System.out.println("Nome   : " + listMs.get(i).nome);
			System.out.println("Genero : " + listMs.get(i).genero);
			System.out.println("Dura��o: " + listMs.get(i).duracao);
			System.out.println("Artista: " + listMs.get(i).artista.nome);
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

				for(int i = 0; i < listMs.size(); i++ ) { 
					System.out.println("Musica # " + i + "\n");
					System.out.println("Nome   : " +listMs.get(i).nome);
					System.out.println("Genero : " +listMs.get(i).artista);
					System.out.println("Dura��o: " +listMs.get(i).genero);
					System.out.println("Artista: " + listMs.get(i).duracao);
					System.out.println();
				}

				System.out.println("Digite o ID da musica que deseja deletar: ");
				int deleteIndex =  Integer.parseInt(sc.nextLine());
				listMs.remove(deleteIndex);
			}
		}
	}
}

