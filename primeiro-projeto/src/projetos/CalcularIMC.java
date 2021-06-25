package projetos;
import java.text.DecimalFormat;
import java.util.Scanner;

public class CalcularIMC {

	public static void main(String[] args) {
		pedirValorUsuario();
	}

	static void pedirValorUsuario() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira seu peso: ");
		double p = sc.nextDouble();
		System.out.println("Insira seu altura: ");
		double a = sc.nextDouble();
		System.out.println("Você é: ( 1- H/ 2- M )");
		int s = sc.nextInt();
		sc.close();
		calcularIMC(p, a);
		calcularPesoIdeal(a, s);

	}

	static void calcularIMC(double peso, double altura){

		double imc = peso/(altura*altura);
		DecimalFormat df = new DecimalFormat("#,###.0");
		System.out.printf("Seu imc: " + df.format(imc));
		System.out.println("");
		exibirClassificacaoIMC(imc);
	}

	static void exibirClassificacaoIMC(double imc) {
		
		if(imc < 18.5) {
			System.out.print("Classificação: Magreza" );	
		}else if (imc <=18.5 && imc >= 24.9 ) {
			System.out.print("Classificação: Normal" );
			System.out.print("Continue se cuidando!");
		}else if (imc <=25.0 && imc >=29.9) {
			System.out.print("Classificação: Sobrepeso" );
			System.out.print("Voce deve emagrecer" + (imc - 39.95));
		}else if (imc > 30.0 ){
			System.out.print("Classificação: Obesidade" );
		}
	} 
	static void calcularPesoIdeal(double altura, int sexo) {
	
		
		
		switch(sexo) {
		case 1:
		double pesoIdealH = +(altura-100) * 0.90;
		System.out.print("Seu peso ideal é " + pesoIdealH);
		break;
		case 2:
		double pesoIdealM = +(altura-100) * 0.85;
		System.out.print("Seu peso ideal é " + pesoIdealM);
		break;
		}
	}
}

