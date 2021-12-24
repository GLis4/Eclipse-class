package TelaInicial;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TelaInicial {

	static List<Produto> produtos = new ArrayList<>();
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String nomeCompleto;
		System.out.println("Bem vindo ao Gastos Organizer!\nOrginize sua vida financeira");
		//double vAluguel, vAgua, vLuz, vNet, vSaude, vMercado, vEdu, vTranporte;
		double totalCusto, totalMeta;
		double vSalario, vAtual, vPoupar;

		System.out.println("Informe os seus dados...");
		System.out.println("Nome completo:");
		nomeCompleto = sc.nextLine();
		System.out.println("Informe o salario:");
		vSalario = Double.parseDouble(sc.nextLine());
		System.out.println("Saldo atual (que você tem no momento):");
		vAtual = Double.parseDouble(sc.nextLine());
		System.out.println("O quanto você deseja poupar:");
		vPoupar = Double.parseDouble(sc.nextLine());

		totalMeta = vAtual - vPoupar;

		System.out.println("Sua meta inicial de poupança foi criada, no valor de: R$" + totalMeta);
		System.out.println("Escolha uma categoria para organizar: 1- casa; 2- mercado; 3- acessórios; 4- outro.");
		// concatenar com as variáveis para emitir o valor preenchido de cada custo.
		System.out.println("O que deseja adicionar na categoria ");

		double familia, compras, educacao, viajem, contasResidenciais, transporte, lazer, mercado, saude, servicos, cuidadosPessoais;
		
		/*vAluguel = perguntar("Voce tem custo com aluguel");
		vAgua = perguntar("Voce tem custo com água?");
		vLuz = perguntar("Voce tem custo com luz");
		vNet = perguntar("Voce tem custo com internet");
		vSaude = perguntar("Voce tem custo com saude?");
		vMercado = perguntar("Voce tem custo com mercado ");
		vEdu = perguntar("Voce tem custo com educação");
		vTranporte = perguntar("Voce tem custo com transporte");
		*/
		//totalCusto = vAluguel + vAgua + vLuz + vNet + vSaude + vMercado + vEdu + vTranporte;
		//System.out.println("Seu total de gastos é: R$" + totalCusto);

		pergunta1(true);
		categoria();

		produtos.forEach(e -> {
			System.out.println("Produto: " + e.nome + " - Categoria: " + e.categoria + " - Valor: " +e.valor);
		}); 
	}

	static double perguntar(String pergunta) {
		double valor = 0;
		System.out.println(pergunta);
		System.out.println("Digite 0-NAO 1-SIM");
		int opcao = Integer.parseInt(sc.nextLine());
		if (opcao == 1) {
			System.out.println("Digite o valor:");
			valor = Double.parseDouble(sc.nextLine());
		}
		return valor;
	}

	static void pergunta1(boolean primeiraVez) {

		if (primeiraVez) {
			String resp;
			System.out.println("Voce deseja adicionar um produto? 0 - NAO, 1 - SIM");
			resp = sc.nextLine();
			if (resp.equals("0")) {

				System.out.println("Obrigado pela preferencia!");
				return;
			}
		}
		String respProduto;
		String respCategoria;
		double respValor;
		System.out.println("Qual produto deseja adicionar?");
		respProduto = sc.nextLine();
		System.out.println("Qual o valor do produto?");
		respValor = sc.nextDouble();
		System.out.println("Qual a categoria?");
		System.out.println("1- casa; 2- mercado; 3- acessórios; 4- outro.");
		sc.nextLine();
		respCategoria = sc.nextLine();
		
		Produto produto = new Produto();
		
		produto.categoria = respCategoria;
		produto.nome = respProduto;
		produto.valor = respValor;
		
		produtos.add(produto);
		
		System.out.println("Deseja adicionar mais algum produto? 0 - NAO, 1 - SIM");

		if (sc.nextLine().equals("1")) {
			pergunta1(false);
			return;
		}
		
		System.out.println("Produtos adicionados com sucesso!");
		
	}
	
	static void categoria() {
		
		
		String categoriaDgtd = null;
		
		if(categoriaDgtd.equals("2")) {
			
			int [] mercado = new int[5];
		}
		
	}

}
