package desafios.level3.manipularArqTexto;

import java.io.File;
import java.util.Scanner;


public class ManipularArquivoTXT2 {

	static GerenciarArquivoTexto ga = new GerenciarArquivoTexto();
	static Scanner sc = new Scanner(System.in);
	static String arquivo = "";
	static String local = "";

	public static void main(String[] args) {

		executarMenu();
	}

	static int mostrarMenuOpcao() {

		System.out.println("Escolha uma opcao");
		System.out.println("1 - Criar arquivo");
		System.out.println("2 - Escrever arquivo");
		System.out.println("3 - Mostrar conteudo do arquivo");
		System.out.println("0 - Sair");

		return	Integer.parseInt(sc.nextLine());
	}

	static void executarMenu() {
		
		Scanner sc = new Scanner(System.in);
		int opcao = 1;

		while(opcao != 0) {
			opcao = mostrarMenuOpcao();


			switch (opcao) {
			case 1:
				criarArquivo();
				break;
			case 2: 


				if(local.equalsIgnoreCase("")) {

					System.out.println("N�o existe arquivo cadastrado, por favor cadastre arquivo na op��o: 1.");

				}else {

					File f = new File(local, arquivo);
					System.out.println("Escreve o texto a ser guardado no arquivo");
					String texto = sc.nextLine();
					ga.escrever(f, texto);
				}


				break;

			case 3:
				if(local.equalsIgnoreCase("")) {

					System.out.println("N�o existe arquivo cadastrado, por favor cadastre arquivo na op��o: 1.");

				}else {
					File f = new File(local, arquivo);
					String t = ga.capturarTexto(f);
					System.out.println(t);
				}
				break;

			case 0 :
				System.out.println("Saindo do programa");
				break;

			default: 
				System.out.println("Opcao invalida.");
			}

		}

		sc.close();


	}

	static void criarArquivo() {
		System.out.println("Qual o nome do arquivo");
		arquivo = sc.nextLine();

		System.out.println("Qual o local arquivo");
		local = sc.nextLine();

		ga.criarArquivo(arquivo, local);

	}
}