package desafios.level2;

import java.util.Scanner;

public class Refeicoes {
	public static void main(String[] args) {
		escolherOpcao();
	} 
	
	static void escolherOpcao() {
		Scanner sc = new Scanner (System.in);
		System.out.print(" De qual prato deseja ver os ingredientes?\n"
				+ "1. ESCONDIDINHO DE CARNE MOÍDA\r\n"
				+ "2. PEITO DE FRANGO AO MOLHO\n"
				+ "3. CAMARÃO POSEIDON\n"
				+ "");
		int opcaoSel = sc.nextInt();
		sc.close();
		mostrarReceitaSelecionada(opcaoSel);
		
	} 
	
	static void mostrarReceitaSelecionada(int opcao) {
		
		switch(opcao)
		{
		case 1 : 
			System.out.print("ESCONDIDINHO DE CARNE MOÍDA\n"
					+ "1 kg de batata\n"
					+ "500 g de carne moída\n"
					+ "200 g de queijo mussarela\n"
					+ "azeite\n"
					+ "1 cebola\n"
					+ "1 dente de alho amassado\n"
					+ "sal a gosto\r\n"
					+ "pimenta branca a gosto\n"
					+ "cheiro-verde a gosto\n"
					+ "1/2 copo de leite\n"
					+ "2 colheres de manteiga");
			break;
		case 2:
			System.out.print("PEITO DE FRANGO AO MOLHO\r\n"
					+ "2 Peito de Frango sem osso\r\n"
					+ "1 tablete de frango\r\n"
					+ "pimenta-do-reino a gosto\r\n"
					+ "tempero baiano a gosto\r\n"
					+ "Sal a gosto\r\n"
					+ "1 alho amassado\r\n"
					+ "Salsa e cebolinha picado a gosto\r\n"
					+ "1 molho de tomate\r\n"
					+ "1/2 copo de água");
			break;
		case 3: 
			System.out.print("PARA O MOLHO\r\n"
					+ "1 litro de leite integral\r\n"
					+ "1 xícara de farinha de trigo\r\n"
					+ "1 cebola pequena\r\n"
					+ "1 dente de alho grande\r\n"
					+ "1 colher (sopa) de manteiga ou margarina\r\n"
					+ "pimenta-do-reino a gosto\r\n"
					+ "noz-moscada a gosto\r\n"
					+ "1 caixinha de creme de leite\r\n"
					+ "sal\r\n"
					+ "PARA MISTURINHA\r\n"
					+ "1 cebola pequena\r\n"
					+ "5 dentes de alho\r\n"
					+ "1 colher de colorífico\r\n"
					+ "1 colher (sopa) de azeite\r\n"
					+ "PARA MONTAGEM\r\n"
					+ "500 g de filés de camarões devidamente limpos\r\n"
					+ "300 g de presunto em cubos\r\n"
					+ "200 g de brócolis cortado em flores menores.\r\n"
					+ "1 lata de milho\r\n"
					+ "1 colher (sopa) da misturinha\r\n"
					+ "300 g de queijo mussarela\r\n"
					+ "500 g de arroz branco ou agulhinha\r\n"
					+ "azeite\r\n"
					+ "sal\r\n"
					+ "salsinha\r\n"
					+ "batata palha para finalizar");
			break;
			default: 
				System.out.println("Não é uma das opções");
		}		
	}
	
}
