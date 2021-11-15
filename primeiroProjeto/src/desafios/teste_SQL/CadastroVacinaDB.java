package desafios.teste_SQL;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import desafios.ConectandoSQL;


public class CadastroVacinaDB {
	static ConectandoSQL con ;
	
	static Scanner sc  = new Scanner(System.in);
	static List<Pessoa> listCadastrados = new ArrayList<>();
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		con = new ConectandoSQL("vacinados.db");
		if(con.exist() == false) {
			con.criarTabela();
		}
		cadastrarPessoa();
		
//		Pessoa p = new Pessoa();
//		System.out.println("Digite nome: ");
//		p.nomeCompleto = sc.nextLine();
//		con.adicionar(sc.nextLine(), "cadastrados");
//		
//		con.mostrarTudo();
//		System.out.println("Deletar o nome");
//		con.deletarUmValor(sc.nextLine());
//		sc.close();
//		con.mostrarTudo();
	}

	private static void cadastrarPessoa() {
		Pessoa p = new Pessoa();
		System.out.println("Nome Completo:");
		p.nomeCompleto = sc.nextLine();
		System.out.println("Data de nascimento: ");
		p.dataNascimento = Integer.parseInt(sc.nextLine());
		listCadastrados.add(p);
		
	}
}
