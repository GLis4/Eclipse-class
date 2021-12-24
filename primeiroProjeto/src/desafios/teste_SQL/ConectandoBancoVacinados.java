package desafios.teste_SQL;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.sql.*;

public class ConectandoBancoVacinados {
	static Scanner sc = new Scanner(System.in);
	private Connection conn;
	private Statement stm;
	List<Pessoa> listCadastrados = new ArrayList<>();


	public ConectandoBancoVacinados(String arquivo) throws SQLException, ClassNotFoundException {
		Class.forName("org.sqlite.JDBC");

		this.conn = DriverManager.getConnection("jdbc:sqlite:" + arquivo);
		this.stm = this.conn.createStatement();
	}

	public void criarTabela() throws SQLException {
		this.stm.executeUpdate("CREATE TABLE  cadastrados ("
				+ "nome varchar(70) PRIMARY KEY NOT NULL, idade int);");
	}

	public void adicionar( String nomeTabela, String nome, int idade) {		  
		try {		  
			this.stm = this.conn.createStatement();
			this.stm.executeUpdate("INSERT or IGNORE INTO "+ nomeTabela +"(nome, idade) VALUES ('"+  nome +"', "+ idade +");");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void deletarTudo() {


		try {
			this.stm.executeUpdate("DELETE FROM cadastrados ");
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public void deletarUmValor(String nomeDeletar) {
		try {
			this.stm.executeUpdate("DELETE FROM cadastrados WHERE nome = ('" + nomeDeletar +"')");
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}



	public void mostrarTudo() {

		ResultSet rs;
		try {
			rs = this.stm.executeQuery("SELECT * FROM cadastrados" );

			while (rs.next()) {
				System.out.println(rs.getString("nome"));
				System.out.println(rs.getString("idade"));
			}

			rs.close();

		}
		catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public boolean exist() throws SQLException  {

		DatabaseMetaData metadados = conn.getMetaData();
		ResultSet tabela = metadados.getTables(null, null, "cadastrados", null);

		return tabela.next();


	}

}
