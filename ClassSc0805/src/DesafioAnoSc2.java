import java.util.Scanner;

public class DesafioAnoSc2 {
	public static void main(String[] args) {
		//versão2
		Scanner sc = new Scanner(System.in);
		System.out.print("Em que ano você nasceu? ");
		int ano = sc.nextInt();
		int result = 2021 - ano;
		sc.close();
		//System.out.println(result);
		
		//versão3
		if(ano < 2021) {
			System.out.print("Sua idade: ");
			System.out.println(result);
		}else {
			System.out.println("Uau, você veio do futuro \\o/, falta "+- result + " ano(s) para você nascer");
		}
		
	}
}
