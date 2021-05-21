import java.util.Scanner;

public class DespesasFor {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas despesas você tem mensalmente? " );
		int quantDespesas = sc.nextInt();
		double totalDespesa = 0.0;
		for (int i = 0; i < quantDespesas; i++) {
			System.out.println("Informe o valor da conta #"+ (i + 1));
			totalDespesa += sc.nextDouble();
		}
		System.out.print("Seu total mensal de despesas é: " + totalDespesa);
		sc.close();
	}
}

