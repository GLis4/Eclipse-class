package desafios;

import java.util.Scanner;
import java.sql.*;

public class ConectandoSQL {
	static Scanner sc = new Scanner(System.in);
	private Connection conn;
	private Statement stm;
	public String nomeTabela;

	public ConectandoSQL(String arquivo) throws SQLException, ClassNotFoundException {
		Class.forName("org.sqlite.JDBC");
		this.conn = DriverManager.getConnection("jdbc:sqlite:" + arquivo);
		this.stm = this.conn.createStatement();
	}


	public void criarTabela() throws SQLException {
		if (nomeTabela.isEmpty()) {
			System.out.println("Insira um nome para a tabela ser criada em : nomeTabela");
		}else {
			this.stm.executeUpdate("CREATE TABLE " + nomeTabela );
			this.stm.executeUpdate("("
					+ "codigo varchar(70) PRIMARY KEY NOT NULL);");
		}
	}

	public void insert(String codigo) {		  
		try {		  
			this.stm = this.conn.createStatement();

			this.stm.executeUpdate("INSERT INTO " + nomeTabela + " VALUES ('" + codigo + "')");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void showAll() {

		ResultSet rs;

		try {
			rs = this.stm.executeQuery("SELECT * FROM " + nomeTabela);
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
		ResultSet tabela = metadados.getTables(null, null, nomeTabela, null);
		
		return tabela.next();

	
	}
}
