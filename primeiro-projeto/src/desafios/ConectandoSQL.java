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
		this.stm.executeUpdate("CREATE TABLE cadastrados ("
				+ "nome varchar(70) PRIMARY KEY NOT NULL);");
	}


	public void insert(String nome) {		  
		try {		  
			this.stm = this.conn.createStatement();

			this.stm.executeUpdate("INSERT INTO cadastrados VALUES ('"+ nome + "')");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}


	public void showAll() {

		ResultSet rs;

		try {
			rs = this.stm.executeQuery("SELECT * FROM cadastrados");

			while (rs.next()) {
				System.out.println(rs.getString("nome"));
			}

			rs.close();

		}
		catch (SQLException e) {
			e.printStackTrace();
		}

	}
}