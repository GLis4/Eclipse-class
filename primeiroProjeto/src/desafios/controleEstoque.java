package desafios;

import java.util.Scanner;

public class controleEstoque {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int i = -1;
		while( i != 0 ) {
			System.out.println("");
			System.out.println("Loja...");
			System.out.println("0. Sair  ");
			System.out.println("1. Controle de Estoque  ");
			System.out.println("2. Controle do Cardapio ");
			i = sc.nextInt();
			switch (i) {
			case 1 : 
				controlEstoque();
				break;
			case 2 : 
				controlCardapio();
				break;
			}
		}	
		sc.close();
	}

	static void controlEstoque(){
		System.out.println("1. Visualizar Estoque");
		System.out.println("2. Adicionar e Remover recebidos ");
		System.out.println("3. Validade ");
		int o = sc.nextInt();
		switch(o) {
		case 1: 
			System.out.println("mostrando estoque...");
			break;
		case 2 : 
			System.out.println("Adicionando produto...");
			break;
		case 3: 
			System.out.println("lista de produtos vencidos...");
			break;
		}
	}
	
	static void controlCardapio() {
		System.out.println("1. Visualizar Card?pio");
		System.out.println("2. Adicionar e Remover pratos ");
		System.out.println("3. Editar Card?pio ");
		int u = sc.nextInt();
		switch(u) {
		case 1: 
			System.out.println("mostrando cardapio...");
			break;
		case 2 : 
			System.out.println("Adicionando novo prato...");
			break;
		case 3: 
			System.out.println("Editar cardapio...");
			break;
		}
		
	}
}
