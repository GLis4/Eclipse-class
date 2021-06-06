import java.util.Random;
import java.util.Scanner;

public class JogodaForca {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		String[] palavras = {"borboleta", "cachorro", "passarinho", "flor"};
		
//		Random aleatorio = new Random();
		int index = new Random().nextInt(3);
		System.out.println(index);
		String palavraSelecionada = palavras[index];

		char[] traco = new char[palavraSelecionada.length()];
		for (int i = 0; i < palavraSelecionada.length(); i++) {
			traco[i] = '_';
		}

		int palavraString = palavras[index].length();
		int tentativas = 6;

		while (palavraString > 0 && tentativas > 0) {
			System.out.println();
			for (int i = 0; i < palavraSelecionada.length(); i++) {
				System.out.print(" " + traco[i] + " ");
			}
		
			System.out.println();
			System.out.println("Você tem " + tentativas + " chances de adivinhar");
			System.out.println("A palavra tem " + palavraString + " letras restantes");
			System.out.println("Digite uma letra: ");

			char letras = teclado.next().charAt(0);
			boolean iscorrect = false;
			for (int i = 0; i < traco.length; i++) {
				if (palavras[index].charAt(i) == letras) {
					traco[i] = letras;
					palavraString--;
					iscorrect = true;
				}
			}

			if (!iscorrect) {
				tentativas--;
			}
		}

		if (palavraString == 0) {
			System.out.println("PARABENS!Você ACERTOU! :)");
		} else {
			System.out.println("Infelizmente Você Perdeu :(");
			System.out.println("A palavra era " + palavraSelecionada);
		}
		
		teclado.close();
	}
}
