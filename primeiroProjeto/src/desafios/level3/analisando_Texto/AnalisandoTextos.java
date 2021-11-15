package desafios.level3.analisando_Texto;

public class AnalisandoTextos {

	static String textoUm;
	static String textoDois; 
	static int contVogais = 0;
	static int contVogaisDois = 0;
	static int contCon = 0;
	static int contConDois = 0;

	static String compararTamanhoTexto() {
		int numPalavra = textoUm.length();
		int numPalavra2 = textoDois.length();

		if(numPalavra > numPalavra2) {
			return textoUm;
		}else if(numPalavra < numPalavra2) {
			return textoDois;
		}else {
			return "";
		}

	}

	static void contarVogais() {


		char vogais[]  = {'a', 'e', 'i', 'o', 'u'};



		for (int i = 0; i < textoUm.length(); i++){
			char c = textoUm.charAt(i);
			if (contem (vogais, c))
				contVogais++;
		}

		for (int i = 0; i < textoDois.length(); i++){
			char c = textoDois.charAt(i);
			if (contem (vogais, c))
				contVogaisDois++;
		}
	} 

	static String compararVogais() {
		contarVogais();

		if (contVogais > contVogaisDois) {
			return textoUm;	
		}else if (contVogais < contVogaisDois){
			return textoDois;
		}	else {
			return "";	
		}
	} 

	static	void contarConsoante() {

		char con[]  = {'b', 'c', 'd', 'f', 'g', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v','w', 'x', 'y', 'z' };

		for (int i = 0; i < textoUm.length(); i++){
			char c = textoUm.charAt(i);
			if (contem (con, c))
				contCon++;
		}

		for (int i = 0; i < textoDois.length(); i++){
			char c = textoDois.charAt(i);
			if (contem (con, c))
				contConDois++;
		}

	}

	static String compararConsoante() {
		contarConsoante();

		if (contCon > contConDois) {
			return textoUm;	
		}else if (contCon == contConDois){
			return "";
		}else {
			return textoDois;
		}


	}	

	static boolean contem (char vetor[], char comparacao){
		boolean flag = false;

		for (int i = 0; i < vetor.length; i++){
			if (vetor[i] == comparacao)
				flag = true;
		}

		return flag;
	}
}

