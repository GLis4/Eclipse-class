package projetos.caixaMercado;

import java.util.Calendar;

public class Caixa {

	static int valorFechamento; 
	static Calendar dataFechamento;
	public static int caixaFechado = 1;

	public static boolean aberturaDeCaixa() {
		if(caixaFechado == 0) {
			return false;
		}else {
			caixaFechado = 0;
			return true; 
		}
	}
	public static boolean caixaFechamento() {
		//calcular valor de vendas do caixa, entrar com a data do dia e fechar.
		
		if(caixaFechado == 1) {
			return false;
		}else {
			
			dataFechamento.getTime();
			caixaFechado =  0;
			return true;
		}
	} 
	
}
