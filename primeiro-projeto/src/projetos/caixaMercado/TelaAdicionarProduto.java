package projetos.caixaMercado;

import java.sql.SQLException;

import desafios.ConectandoSQL;

public class TelaAdicionarProduto {

	void adicionarProdutos() throws ClassNotFoundException, SQLException{
		ConectandoSQL con = new ConectandoSQL("produtos.db");
		if(con.exist() == false) {
			con.criarTabela();
		}
		
		
	}
}