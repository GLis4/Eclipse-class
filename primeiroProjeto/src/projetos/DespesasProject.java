package projetos;
import java.util.Scanner;

public class DespesasProject {
	//10/06/21
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ChamarOpcoes();
	}

	static void ChamarOpcoes(){
		System.out.println("0 - Fechar Programa");
		System.out.println("1 - Simule uma compra");
		System.out.println("2 - Calcular despesas");
		
		int opcao =  sc.nextInt();

		switch(opcao) {
		case 0:
			sc.close();
			break;
		case 1: 
			SimuleCompra();
			break;
		case 2:
			CalcularDespesa();
			break;
		default: 
			System.out.print("Selecione uma opção valida");
			
		}

	}
	static void SimuleCompra(){

		System.out.println("Simule uma compra online e economize ");
		System.out.println("Quanto você pode gastar? ");
		double saldoM = sc.nextDouble();

		double totalGasto = 0.0;

		String resp;

		do{
			System.out.println("Quantas unidades?");
			int unid = sc.nextInt();
			System.out.print("Valor do produto: " );
			double valorConta = sc.nextDouble();
			totalGasto += valorConta*unid;
			System.out.print("Deseja adicionar outro produto? (S/N)");
			resp = sc.next();

		}while(resp.equalsIgnoreCase("s"));

		System.out.println("Total de gastos " + totalGasto);
		System.out.println("Houve prejuizo? ");
		double total = saldoM - totalGasto;

		if(total < 0.0 ) {
			System.out.println("Sim, houve um total de " + total + " nesta compra");

		}else if(total  == 0.0) {
			System.out.println("Não, porem esse mes você não economizou nada :(");

		}else {
			System.out.println("Não! Você conseguiu economizar " + total  + " nesta compra");
		}
		
		ChamarOpcoes();

	}
	static void CalcularDespesa() {
		System.out.println("Quantas despesas você tem mensalmente? " );
		int quantDespesas = sc.nextInt();
		double totalDespesa = 0.0;
		
		for (int i = 0; i < quantDespesas; i++) {
			System.out.println("Informe o valor da conta #"+ (i + 1));
			totalDespesa += sc.nextDouble();
		}
		System.out.print("Seu total mensal de despesas é: " + totalDespesa);
		ChamarOpcoes();
	}
} 
