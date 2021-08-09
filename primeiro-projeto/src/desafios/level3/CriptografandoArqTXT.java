package desafios.level3;

public class CriptografandoArqTXT {

	 String aplicarCifradeCesar(String texto, int chave) {
		int n = texto.length();
		String palavraCripto = "";

		for (int i = 0; i < n; i++) {
			palavraCripto = palavraCripto + (char)(texto.charAt(i) + chave);
		}

		return palavraCripto;
	}
	
	StringBuffer reverterTexto(String texto) {
		
		StringBuffer n = new StringBuffer(texto);
		StringBuffer palavraRevert =  n.reverse();
		return palavraRevert;
	}
	
	int checarPalindromo(String textoCon ) {
		String revertTXT = new StringBuffer(textoCon).reverse().toString();
		
		if(textoCon.equals(revertTXT)) {
			return 1;
		}else {
			return 0;
		}
	}
	
}