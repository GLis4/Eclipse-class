import java.util.Scanner;

public class DesafioMediaArray {
	
	//desafio: calcular a media das idades das pessoas na casa do usuario. 
	//05/06/2021 
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas tem em sua casa? ");
		int quant = sc.nextInt();
		System.out.println("");
		int soma = 0;

		int idadeCasa[]= new int [quant];

		for (int i = 0; i<quant; i++ ) {
			System.out.println("idade do #"+ (i + 1) + " parente"); 
			idadeCasa[i] = sc.nextInt();
			 soma += idadeCasa[i];
		}
		
		int media = soma/idadeCasa.length;
		System.out.print("A media da sua casa é: " + media);
		sc.close();

	}
}
