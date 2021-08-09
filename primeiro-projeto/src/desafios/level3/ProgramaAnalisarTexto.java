package desafios.level3;

import java.util.Scanner;

public class ProgramaAnalisarTexto {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int opcao = 0;
		
		do{
			
			System.out.println("");
			System.out.println("Voc� deseja..." +
					"\n 0- Sair do programa"+ 
					" \n 1- Comparar dois textos" +
					" \n 2- Criptografar com o cifra de cesar"+ 
					" \n 3- Reverter texto " +
					" \n 4- verificar se � um palindromo");
			opcao = sc.nextInt();
			System.out.println("");
			executarOpcao(opcao);
		
		} while(opcao!= 0 );
		
		sc.close();
	}
	static void executarOpcao(int opcao) {
		CriptografandoArqTXT cripto = new CriptografandoArqTXT();
		String textoPalindromo = "";

		switch(opcao) {
		case 1:
			pedirDadosUsuario();
			break;
		case 2: 
			System.out.println("Digite o texto que deseja criptografar");
			String texto = sc.next();
			System.out.println("Digite o numero de rota��es que deseja");
			int chave =	sc.nextInt();

			System.out.println("Resultado do texto criptografado: "+cripto.aplicarCifradeCesar(texto, chave));
			break;

		case 3: 

			System.out.println("Digite o texto que deseja reverter");
			String textoRevert = sc.next();

			System.out.println("Resultado do texto revertido:" + cripto.reverterTexto(textoRevert));
			break;

		case 4: 
			System.out.println("Digite o texto que deseja checar");
			textoPalindromo = sc.nextLine();
			int respEPalindromo = cripto.checarPalindromo(textoPalindromo);

			if (respEPalindromo == 1) {
				System.out.println("O texto " + textoPalindromo + " � palindromo.");
			}else if (respEPalindromo == 0) {
				System.out.println("O texto " + textoPalindromo + " n�o � palindromo.");
			}
			break;

		}

	} 


	static void exibindoResult() {
		String tamanhoTXT;
		String quantVogal;
		String quantCon;

		tamanhoTXT = AnalisandoTextos.compararTamanhoTexto();
		if (tamanhoTXT.equals("")) {
			System.out.println("as duas tem o mesmo tamanho ");
		}else {
			System.out.println("A palavra " + tamanhoTXT + " � a maior");
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

	static void pedirDadosUsuario() {

		System.out.println("Insira a primeira palavra: ");
		AnalisandoTextos.textoUm = sc.next();
		System.out.println("Insira a segunda palavra: ");
		AnalisandoTextos.textoDois = sc.next();
		AnalisandoTextos.textoUm.toLowerCase();
		AnalisandoTextos.textoDois.toLowerCase();	
		exibindoResult();

	}
}
