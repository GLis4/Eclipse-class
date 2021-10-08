package projetos.atividadeEstoque;

public class Ingrediente {
	
	private int id;
	String nome;
	double qtdEstoque;
	
	Ingrediente(){
	 	id += 1;
	}
	
	public void adicionarEstoque(double addEstoque) {
		qtdEstoque += addEstoque;
		
	} 
	
	public void removerEstoque(double remEstoque) {
		qtdEstoque -= remEstoque;
	}
	
}
