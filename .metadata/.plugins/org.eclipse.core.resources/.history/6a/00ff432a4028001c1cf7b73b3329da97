package desafios;

import java.sql.SQLException;
import java.util.Scanner;


public class CadastroXepaDB {
	static ConectandoSQL con ;

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc  = new Scanner(System.in);
		con = new ConectandoSQL("cadastradosXepa.db");
		con.criarTabela();
		System.out.println("Digite nome: ");
		con.insert(sc.nextLine());
		sc.close();

		con.showAll();
	}
}
