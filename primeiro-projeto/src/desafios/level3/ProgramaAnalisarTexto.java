package desafios.level3;

import java.util.Scanner;

public class ProgramaAnalisarTexto {
	public static void main(String[] args) {
		AnalisandoTextos analisaTxt = new AnalisandoTextos(); 
		Scanner sc = new Scanner(System.in);
		String tamanhoTXT;
		String quantVogal;
		String quantCon;
		
		System.out.println("Insira a primeira palavra: ");
		analisaTxt.textoUm = sc.next();
		System.out.println("Insira a segunda palavra: ");
		analisaTxt.textoDois = sc.next();
		analisaTxt.textoUm.toLowerCase();
		analisaTxt.textoDois.toLowerCase();	
		sc.close();

		
		tamanhoTXT = analisaTxt.compararTamanhoTexto();
		if (tamanhoTXT.equals("")) {
			System.out.println("as duas tem o mesmo tamanho ");
		}else {
			System.out.println("A palavra " + tamanhoTXT + " � a maior");
		}
			
		quantVogal = analisaTxt.compararVogais();
		if (quantVogal.equals("")) {
			System.out.println("as duas tem o mesmo numero de vogais. ");
		}else {
			System.out.println("A palavra " + quantVogal + " tem mais vogais. ");
		}
		
		 quantCon = analisaTxt.compararConsoante();
		if (quantCon.equals("")) {
			System.out.println("as duas tem o mesmo numero de consoante. ");
		}else {
			System.out.println("A palavra " + quantCon + " tem mais consoante. ");
		}
		
	}
}
