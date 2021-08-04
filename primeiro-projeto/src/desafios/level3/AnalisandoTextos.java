package desafios.level3;

public class AnalisandoTextos {

	String textoUm;
	String textoDois; 
	int contVogais = 0;
	int contVogaisDois = 0;
	int contCon = 0;
	int contConDois = 0;

	String compararTamanhoTexto() {
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

	void contarVogais() {


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

	String compararVogais() {
		contarVogais();

		if (contVogais > contVogaisDois) {
			return textoUm;	
		}else if (contVogais < contVogaisDois){
			return textoDois;
		}	else {
			return "";	
		}
	} 

	void contarConsoante() {

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

	String compararConsoante() {
		contarConsoante();

		if (contCon > contConDois) {
			return textoUm;	
		}else if (contCon == contConDois){
			return "";
		}else {
			return textoDois;
		}


	}	

	boolean contem (char vetor[], char comparacao){
		boolean flag = false;

		for (int i = 0; i < vetor.length; i++){
			if (vetor[i] == comparacao)
				flag = true;
		}

		return flag;
	}
}

