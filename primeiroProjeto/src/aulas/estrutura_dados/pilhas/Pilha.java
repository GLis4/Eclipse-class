package aulas.estrutura_dados.pilhas;

import aulas.estrutura_dados.base.staticStructure;

public class Pilha<T> extends staticStructure<T> {
	
	public Pilha (int capacidade) {
		super(capacidade);
	}
	
	public void adicionar(T elemento) {
		super.adicionar(elemento);
	}
	
	public void geTop() {
		super.get(tamanho);
	}

	
}
