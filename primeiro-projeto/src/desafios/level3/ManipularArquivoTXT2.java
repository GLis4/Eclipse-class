package desafios.level3;

import java.io.File;
import java.util.Scanner;

public class ManipularArquivoTXT2 {
	
	static GerenciarArquivoTexto ga = new GerenciarArquivoTexto();
	static String localArq; 
	static String nomeArq; 
	
	public static void main(String[] args) {
		
		
		File f = new File("./");
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome que deseja salvar");
		String nome = sc.next();
		ga.escrever(f, nome);
		
		
		String texto = ga.capturarTexto(f);
		System.out.println(texto);
		
	}
	
	static void checarArquivoExiste(){
		
		boolean sucesso;
		if(ga.existeArquivo(nomeArq, localArq) == false) {
			sucesso =  ga.criarArquivo(nomeArq, localArq);
			if(sucesso) {
				System.out.println("Arquivo criado com sucesso");
			} else {
				System.out.println("Arquivo n�o criado com sucesso");
			}
		} else {
			System.out.println("Arquivo j� existe, nao sera criado outro");
		}
		
	}
	static void pedirUsuarioLocalArqENome() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual o local que o arquivo ser� criado?");
		localArq = sc.next();
		System.out.println("Qual o nome do arquivo");
		nomeArq = sc.next();
		
		
		
	} 
}
