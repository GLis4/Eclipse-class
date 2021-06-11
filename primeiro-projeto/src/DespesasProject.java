import java.util.Scanner;

public class DespesasProject {
	//10/06/21
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Simule uma compra online e economize ");
		
		System.out.println("Quanto você pode gastar? ");
		double saldoM = sc.nextDouble();

		double totalGasto = 0.0;
		
		String resp;

		do{
			System.out.print("Nome do produto: " );
			String nomeProduto = sc.next();
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


		sc.close();
	}
}

