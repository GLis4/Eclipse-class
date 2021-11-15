package desafios.level3.analisando_Texto;

import java.util.Scanner;

public class ProgramaAnalisarTexto {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		selecionarOpcao();
		sc.close();
	}
	static void selecionarOpcao() {
		String textoPalindromo = "";
		int opcao = 0;

		do{
			System.out.println("");
			System.out.println("Você deseja..." +
					"\n 0- Sair do programa"+ 
					" \n 1- Comparar dois textos" +
					" \n 2- Criptografar com o cifra de cesar"+ 
					" \n 3- Reverter texto " +
					" \n 4- verificar se é um palindromo");
			opcao = sc.nextInt();
			System.out.println("");
			switch(opcao) {
			case 1:
				pedirDadosUsuario();
				break;
			case 2: 
				
				System.out.println("Digite o texto que deseja criptografar");
				String texto = sc.next();
				System.out.println("Digite o numero de rotações que deseja");
				int chave =	sc.nextInt();
				System.out.println("Resultado do texto criptografado: " + CriptografandoTextos.aplicarCifradeCesar(texto, chave));
				
				break;

			case 3: 

				System.out.println("Digite o texto que deseja reverter");
				String textoRevert = sc.next();
				System.out.println("Resultado do texto revertido:" + CriptografandoTextos.reverterTexto(textoRevert));
				
				break;

			case 4: 
				
				System.out.println("Digite o texto que deseja checar");
				textoPalindromo = sc.nextLine();
				int respEPalindromo = CriptografandoTextos.checarPalindromo(textoPalindromo);
				if (respEPalindromo == 1) {
					System.out.println("O texto " + textoPalindromo + " é palindromo.");
				}else if (respEPalindromo == 0) {
					System.out.println("O texto " + textoPalindromo + " não é palindromo.");
				}
				
				break;

			}


		} while(opcao!= 0 );

	} 
	
	static void pedirDadosUsuario() {

		System.out.println("Insira a primeira palavra: ");
		AnalisandoTextos.textoUm = sc.next();
		System.out.println("Insira a segunda palavra: ");
		AnalisandoTextos.textoDois = sc.next();
		AnalisandoTextos.textoUm.toLowerCase();
		AnalisandoTextos.textoDois.toLowerCase();	
		exibindoResultDeComparacao();
	}

	static void exibindoResultDeComparacao() {
		String tamanhoTXT;
		String quantVogal;
		String quantCon;

		tamanhoTXT = AnalisandoTextos.compararTamanhoTexto();
		if (tamanhoTXT.equals("")) {
			System.out.println("as duas tem o mesmo tamanho ");
		}else {
			System.out.println("A palavra " + tamanhoTXT + " é a maior");
		}

		quantVogal = AnalisandoTextos.compararVogais();
		if (quantVogal.equals("")) {
			System.out.println("as duas tem o mesmo numero de vogais. ");
		}else {
			System.out.println("A palavra " + quantVogal + " tem mais vogais. ");
		}

		quantCon = AnalisandoTextos.compararConsoante();
		if (quantCon.equals("")) {
			System.out.println("as duas tem o mesmo numero de consoante. ");
		}else {
			System.out.println("A palavra " + quantCon + " tem mais consoante. ");
		}
	}

	
}
