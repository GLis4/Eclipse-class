package projetos.caixaMercado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Venda {

	String cpfCliente;
	String formaPagamento;
	
	Caixa c1 = new Caixa(); 
	List<Produtos> listCompras = new ArrayList<>();

	void addProdutos() {

		if(c1.caixaFechado == 1) {
			System.out.println("Caixa Fechado, execute a abertura de caixa");
		}else {

			Scanner sc = new Scanner(System.in);
			Produtos p = new Produtos();
			System.out.println("Digite o codigo: ");
			p.codigo =  Integer.parseInt(sc.nextLine());
			System.out.println("Digite o valor: ");
			p.valor = Integer.parseInt(sc.nextLine());
			System.out.println("Digite quantidade : ");
			p.valor = p.valor *Integer.parseInt(sc.nextLine());;
			listCompras.add(p);
			sc.close();
		} 

	}

	int calcularTotal() {
		int valorVenda = 0;
		for(int i = 0; i <listCompras.size(); i++) {
			valorVenda += listCompras.get(1).valor;
		}
		
		return valorVenda;

	}

	int  pagaCartao(int parcela, int valorVenda) {

		int	parcelas = valorVenda*parcela;
		return parcelas; 

	}


}