package desafios;

import java.util.Scanner;
import java.sql.*;

public class ConectandoSQL {
	static Scanner sc = new Scanner(System.in);
	private Connection conn;
	private Statement stm;


	public ConectandoSQL(String arquivo) throws SQLException, ClassNotFoundException {
		Class.forName("org.sqlite.JDBC");

		this.conn = DriverManager.getConnection("jdbc:sqlite:" + arquivo);
		this.stm = this.conn.createStatement();
	}


	public void criarTabela() throws SQLException {
		this.stm.executeUpdate("CREATE TABLE  cadastrados ("
				+ "nome varchar(70) PRIMARY KEY NOT NULL);");
	}


	public void adicionar(String nome, String nomeTabela) {		  
		try {		  
			this.stm = this.conn.createStatement();
			
			//INSERT INTO Customers (CustomerName, ContactName, Address, City, PostalCode, Country)
			//VALUES ('Cardinal', 'Tom B. Erichsen', 'Skagen 21', 'Stavanger', '4006', 'Norway');
			
			this.stm.executeUpdate("INSERT or IGNORE INTO "+ nomeTabela +" VALUES ('"+ nome + "')");
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
