package aulas_assunto.example;

public class EssenciaArrayList {
	public static void main(String[] args) {
		int tam = 0;
		String[] nomes = new String[1];

		nomes[tam] =  "ana";
		tam = tam + 1;
		System.out.println(tam);
		System.out.println(nomes.length);

		if(tam >= nomes.length) {
			String nomeAux [] = new String [nomes.length * 2]; 
			for (int i = 0; i < nomes.length; i++) {
				nomeAux [i] = nomes[i];
			}
			nomes = new String [nomeAux.length];
			for (int i = 0; i < nomes.length; i++) {

				nomes[i] = nomeAux[i];
			}

		}
		nomes[tam] =  "lis";
		tam = tam + 1;
		
		for (int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i]);
		}

	}

}
