package desafios.cadastro_xepa;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class CadastroXepaArrayList {
	static Scanner sc = new Scanner(System.in);

	static List<String> nomes = new ArrayList<>();

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
				break;
			default: 
				System.out.println("Opcao n?o existe");
				break;
			}
		}
	}
	static void cadastrarNome() {
		System.out.println("Digite nome: ");
		nomes.add(sc.nextLine());
	}
	static void mostrarCadastros() {
		System.out.println("Cadastros: ");
		System.out.println("------------");
		for(int i = 0; i < nomes.size() ; i++ ){
			System.out.println(nomes.get(i));
		}
		System.out.println("------------");
	}
}
