package desafios;

import java.util.Scanner;

import projetos.caixaMercado.Caixa;
import projetos.caixaMercado.Venda;

public class CadastroXepa {
	static Scanner sc = new Scanner(System.in);

	static String[] nomes = new String[1];

	public static void main(String[] args) {

		selecionarOpcao();


	}

	static void selecionarOpcao() {

		int opcao = -1;
		while(opcao != 0) {

			System.out.println("Digite \n0- Sair \n1- Cadastrar \n2- Mostrar Cadastrados.");
			opcao = Integer.parseInt(sc.nextLine());
			switch(opcao) {
			case 1 :
				cadastrarNome();
				break;
			case 2:
				mostrarCadastros();
				break;
			case 0 : 
				opcao = 0;
				sc.close();
			default: 
				System.out.println("Opcao n�o existe");
			}
		}

	}
	static void cadastrarNome() {
		int tam = 0;
		if( tam >= nomes.length) {

			String nomeAux [] = new String [nomes.length * 2]; 
			for (int i = 0; i < nomes.length; i++) {
				nomeAux [i] = nomes[i];
			}
			nomes = new String [nomeAux.length];
			for (int i = 0; i < nomes.length; i++) {

				nomes[i] = nomeAux[i];
			}
		}

		System.out.println("Digite nome: ");
		nomes[tam] = sc.nextLine();
		tam = tam + 1;
	}
	static void mostrarCadastros() {
		for(int i = 0; i < nomes.length ; i++ ){
			System.out.println(nomes[i]);
		}
	}
}
