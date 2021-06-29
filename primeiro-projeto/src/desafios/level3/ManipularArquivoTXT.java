package desafios.level3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ManipularArquivoTXT {
	
	public static void main(String[] args) throws IOException {

		criarArquivo();
	}
	
	static void criarArquivo() {
		try {
			File dir = new File("C:\\Users\\Laercio\\Documents\\Estudos\\Programação");
			File arq = new File(dir, "nomeDesafios.txt");
			boolean statusArq = arq.createNewFile();
			System.out.println("status: " + statusArq);
			escrever(arq);
			mostrarTexto(arq);

		} catch (IOException e) {
			e.printStackTrace(); 
		}


	}

	static void escrever(File arq) throws IOException {
		Scanner sc = new Scanner(System.in);

		if (arq.exists()) {
			FileWriter fw = new FileWriter(arq, true);
			PrintWriter pw = new PrintWriter(fw);
			System.out.println("Insira um nome: ");
			pw.append(sc.next()+ "\r\n");
			pw.flush();
			sc.close();
			pw.close();
			fw.close();
		}
	}

	static void mostrarTexto(File arq){
		try {
			//Indicamos o arquivo que será lido
			java.io.FileReader fileReader = new java.io.FileReader(arq);
			//Criamos o objeto bufferReader que nos
			// oferece o método de leitura readLine()
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			//String que irá receber cada linha do arquivo
			String linha = "";
			//Fazemos um loop linha a linha no arquivo,
			// enquanto ele seja diferente de null.
			//O método readLine() devolve a linha na
			// posicao do loop para a variavel linha.
			while ( ( linha = bufferedReader.readLine() ) != null) {
				//Aqui imprimimos a linha
				System.out.println(linha);
			}
			//liberamos o fluxo dos objetos ou fechamos o arquivo
			fileReader.close();
			bufferedReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}