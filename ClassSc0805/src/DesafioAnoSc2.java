import java.util.Scanner;

public class DesafioAnoSc2 {
	public static void main(String[] args) {
		//vers�o2
		Scanner sc = new Scanner(System.in);
		System.out.print("Em que ano voc� nasceu? ");
		int ano = sc.nextInt();
		int result = 2021 - ano;
		sc.close();
		//System.out.println(result);
		
		//vers�o3
		if(ano < 2021) {
			System.out.print("Sua idade: ");
			System.out.println(result);
		}else {
			System.out.println("Uau, voc� veio do futuro \\o/, falta "+- result + " ano(s) para voc� nascer");
		}
		
	}
}
