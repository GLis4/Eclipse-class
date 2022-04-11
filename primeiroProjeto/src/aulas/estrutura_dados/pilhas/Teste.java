package aulas.estrutura_dados.pilhas;

public class Teste {
	public static void main(String[] args) {
		Pilha<Double> pilha = new Pilha<Double>(2);

		pilha.adicionar(2.25);
		pilha.adicionar(1.33);
		System.out.println(pilha.tamanho);

	}
}
