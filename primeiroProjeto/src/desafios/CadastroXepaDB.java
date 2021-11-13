package desafios;

import java.sql.SQLException;
import java.util.Scanner;


public class CadastroXepaDB {
	static ConectandoSQL con ;

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner sc  = new Scanner(System.in);
		con = new ConectandoSQL("cadastradosXepa.db");
		if(con.exist() == false) {
			con.criarTabela();
		}
		
		System.out.println("Digite nome: ");
		con.adicionar(sc.nextLine(), "cadastrados");
		

		con.mostrarTudo();
		System.out.println("Deletar o nome");
		con.deletarUmValor(sc.nextLine());
		sc.close();
		con.mostrarTudo();
		
	}
}
