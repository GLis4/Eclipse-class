package desafios.teste_SQL;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import desafios.ConectandoSQL;


public class CadastroVacinaDB {
	static ConectandoBancoVacinados con ;
	
	static Scanner sc  = new Scanner(System.in);
	static List<Pessoa> listCadastrados = new ArrayList<>();
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		con = new ConectandoBancoVacinados("vacinadosAA.db");
		if(con.exist() == false) {
			con.criarTabela();
		}
		
		Pessoa p = new Pessoa();
		System.out.println("Nome Completo:");
		p.nomeCompleto = sc.nextLine();
		System.out.println("Data de nascimento: ");
		p.dataNascimento = Integer.parseInt(sc.nextLine());
		listCadastrados.add(p);
		
		con.adicionar("cadastrados", listCadastrados.get(0).nomeCompleto, listCadastrados.get(0).dataNascimento);
		con.mostrarTudo();
		con.deletarUmValor("e");
		
	}
}
