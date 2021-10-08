package projetos.caixaMercado;

import java.sql.SQLException;

import desafios.ConectandoSQL;

public class Produtos {

	int id;
	int codigo;	
	String descricao;
	double valor;

	Produtos() {

		id += 1;
	}

	void adicionarProdutos() throws ClassNotFoundException, SQLException{
		ConectandoSQL con = new ConectandoSQL("produtos.db");
		if(con.exist() == false) {
			con.criarTabela();
		}
	}
}