package projetos.caixa_mercado;

import java.util.ArrayList;
import java.util.List;

public class Venda {

	static String cpfCliente;
	static String formaPagamento;
	static List<Produtos> listCompras = new ArrayList<>();

	public static void addProdutos(int codigo, double valor) {
		
		Produtos p;
		try {
			p = new Produtos();
			if(Caixa.caixaFechado == 1) {
				System.out.println("Caixa Fechado, execute a abertura de caixa");
			}else {
				p.codigo =  codigo;
				p.valor = valor;
				listCompras.add(p);
			} 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static double calcularTotal() {
		double valorVenda = 0;
		for(int i = 0; i <listCompras.size(); i++) {
			valorVenda += listCompras.get(i).valor;
		}
		return valorVenda;

	}

	static int  pagaCartao(int parcela, int valorVenda) {

		int	parcelas = valorVenda*parcela;
		return parcelas; 

	}


}
