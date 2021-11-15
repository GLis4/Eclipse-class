package desafios;

import java.sql.SQLException;
import java.util.Scanner;


public class CadastroXepaDB {
	static ConectandoSQL con  ;
	static Scanner sc  = new Scanner(System.in);

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
				con = new ConectandoSQL("cadastradosXepa.db");
				if(con.exist() == false) {
					con.criarTabela();
				}
				selecionarOpcao();
	}

	static void selecionarOpcao() {
		int opcao = -1;
		while(opcao != 0) {

			System.out.println("Digite \n0- Sair \n1- Cadastrar \n2- Mostrar Cadastrados.\n3- Deletar nome da lista.\n4- Deletar Todos na lista.");
			opcao = Integer.parseInt(sc.nextLine());
			switch(opcao) {
			case 1 :
				cadastrarNome();
				break;
			case 2:
				mostrarCadastros();
				break;
			case 3:
				deletarCadastrado();
				break;
			case 4 :
				con.deletarTudo();
				break;
			case 0 : 
				opcao = 0;
				sc.close();
				break;
			default: 
				System.out.println("Opcao não existe");
				break;
			}
		}
	}
	static void cadastrarNome() {
		System.out.println("Digite nome: ");
		con.adicionar(sc.nextLine().toUpperCase(), "cadastrados");
	}
	static void mostrarCadastros() {
		System.out.println("Cadastros: ");
		System.out.println("------------");
		con.mostrarTudo();
		System.out.println("------------");
	}

	static void deletarCadastrado() {
		String opcao = "S";
		while(opcao.equalsIgnoreCase("s")) {
			mostrarCadastros();
			System.out.println("Deletar o nome: ");
			con.deletarUmValor(sc.nextLine().toUpperCase());
			System.out.println("Deletado com sucesso!");
			System.out.println("Deseja deletar mais um nome? S/N");
			opcao = sc.nextLine();
		}
	}



}


