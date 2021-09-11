package desafios.level3.manipularArqTexto;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OrganiArqTXT {

	String capturarTexto(File arq){
		try {
			String textoNoArquivo = "";
			Scanner sc = new Scanner(arq);
			while(sc.hasNextLine()) {
				textoNoArquivo = textoNoArquivo + sc.nextLine() + "\n";
			}
			sc.close();
			return textoNoArquivo;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return "";
		}
	}
	
	static List<String> organizarOrdemCrescenteAlfabetica(File arq) {
		try {
			List<String> textoNoArquivo = new ArrayList<>();
			Scanner sc = new Scanner(arq);
			
			while(sc.hasNextLine()) {
				
				textoNoArquivo.add(sc.nextLine());
			
			}
			sc.close();
			Collections.sort(textoNoArquivo);
			return textoNoArquivo;
			} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		}
		
		
	}
}
