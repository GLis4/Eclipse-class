package desafios.ano;

public class DesafioAnoN2{
	public static void main(String[] args) {
		//vers�o2
		int ano = 2000;
		int result = 2021 - ano;
		System.out.println(result);
		
		//vers�o3
		if(ano < 2021) {
			System.out.print("Sua idade: ");
			System.out.println(result);
		}else {
			System.out.println("Uau, voc� veio do futuro \\o/, falta "+- result + " ano(s) para voc� nascer");
		}
	}
}
