package TelaInicial;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TelaUm {


	static List<Categoria> custos = new ArrayList<>();

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Bem vindo ao Gastos Organizer!\nOrginize sua vida financeira");
		String nomeCompleto;
		double vAluguel, vAgua, vLuz, vNet, vSaude, vMercado, vEdu, vTranporte;
		double totalCusto, totalMeta;
		double vSalario, vAtual, vPoupar;

		System.out.println("Informe os seus dados...");
		System.out.println("Nome completo:");
		nomeCompleto = sc.nextLine();
		System.out.println("Informe o salario:");
		vSalario = Double.parseDouble(sc.nextLine());
		System.out.println("Seu saldo atual:");
		vAtual = Double.parseDouble(sc.nextLine());
		System.out.println("O quanto voce deseja poupar por mes:");
		vPoupar = Double.parseDouble(sc.nextLine());

		totalMeta = vPoupar;

		System.out.println("Sua meta inicial de poupança foi criada, no valor de: R$" + totalMeta);
		System.out.println("E o seu saldo atual é de "+ vAtual);
		System.out.println("Escolha uma categoria para organizar: 1- casa; 2- mercado; 3- acessórios; 4- outro.");
		// concatenar com as variáveis para emitir o valor preenchido de cada custo.
		System.out.println("O que deseja adicionar na categoria ");

		/*vAluguel = perguntar("Voce tem custo com aluguel");
			vAgua = perguntar("Voce tem custo com água?");
			vLuz = perguntar("Voce tem custo com luz");
			vNet = perguntar("Voce tem custo com internet");
			vSaude = perguntar("Voce tem custo com saude?");
			vMercado = perguntar("Voce tem custo com mercado ");
			vEdu = perguntar("Voce tem custo com educação");
			vTranporte = perguntar("Voce tem custo com transporte");

			totalCusto = vAluguel + vAgua + vLuz + vNet + vSaude + vMercado + vEdu + vTranporte;
			System.out.println("Seu total de gastos é: R$" + totalCusto);*/

		cadastroCusto(true);



		custos.forEach(e -> {
			System.out.println("Custo: " + e.nome + " - Categoria: " + categoria(e.categoria) + " - Valor: " +e.valor);
		}); 

		System.out.println("Deseja somar custo da categoria? ");
		System.out.println(somarValorCategoria(Integer.parseInt(sc.nextLine())));	
	}


	static void cadastroCusto(boolean primeiraVez) {

		if (primeiraVez) {
			String resp;
			System.out.println("Vcoe deseja adicionar um custo? 0 - NAO, 1 - SIM");
			resp = sc.nextLine();
			if (resp.equals("0")) {

				System.out.println("Obrigado pela preferencia!");
				return;
			}
		}
		String respCusto;
		int respCategoria;
		double respValor;
		System.out.println("Qual custo deseja adicionar?");
		respCusto = sc.nextLine();
		System.out.println("Qual o valor do custo?");
		respValor = Double.parseDouble(sc.nextLine());

		operacoesMenu();

		respCategoria = Integer.parseInt(sc.nextLine());

		Categoria custo = new Categoria();

		custo.categoria = respCategoria;
		custo.nome = respCusto;
		custo.valor = respValor;

		custos.add(custo);
		System.out.println("Deseja adicionar mais algum custo? 0 - NAO, 1 - SIM");

		if (sc.nextLine().equals("1")) {
			cadastroCusto(false);
			return;
		}

		System.out.println("Custos adicionados com sucesso!");


	}


	static void operacoesMenu() {

		System.out.print("\n\n  Escolha a categoria que deseja adicionar:\n" +  
				"+------------------------------------------------------+\n" + 
				"| [1] Mercado | [2] Saude | [3] Transporte | [4] Lazer |\n" + 
				"+------------------------------------------------------+\n" + 
				"|[5] Educação | [6] Familia | [7] Viagem | [8] Serviços|\n" + 
				"+------------------------------------------------------+\n" + 
				"| [9] Contas Residencias                  | [123] Sair |\n" + 
				"+------------------------------------------------------+\n" + 
				"                        ->");
	}


	static String categoria(int valorCategoria) {

		switch(valorCategoria) {
		case 1:
			return "mercado";

		case 2:
			return "Saude";

		case 3:

			return "Transporte";

		case 4:

			return "Lazer";

		case 5:

			return "Educação";

		case 6:

			return "Familia";

		case 7:

			return "Viagem";

		case 8:

			return "Serviços";

		case 9:

			return "Contas Residenciais";


		}
		return "";

	}

	static int somarValorCategoria(int categoriaDesejada) {

		int somaCategoria = 0;
		int i = 0;

		for(Categoria custosSoma : custos) {

			if(custos.get(i).categoria == categoriaDesejada ) {
				somaCategoria += custos.get(i).valor;
			}

			i++;
		}
		return somaCategoria;

	}

}

