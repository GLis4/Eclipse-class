package desafios.level2;

import java.util.Scanner;

public class SimularCompra {
	public static void main(String[] args) {
	
		pedirDadosUsuario();
	}
	
	static void pedirDadosUsuario() {
		Scanner sc = new Scanner(System.in); 

		System.out.println("Bem vindo a loja lis \n"
				+ "Escolha dois dos produtos abaixo\n"
				+ "0- Notebook       R$2,500\n"
				+ "1- Celular        R$1,000\n"
				+ "2- Caixa de Som   R$200,00\n" );
		int opcaoSelecionada[] = {sc.nextInt(), sc.nextInt()};
		sc.close();
		somaProdutos(opcaoSelecionada[0], opcaoSelecionada[1]);
	}

	static void somaProdutos (int escolha1, int escolha2 ) {
		float preços[] = {2500, 1000, 200, 4000};
		double soma = preços[escolha1] + preços[escolha2];
		System.out.println("Total de gastos é: " + soma);
	}
}
