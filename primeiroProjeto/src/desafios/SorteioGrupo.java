package desafios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class SorteioGrupo {

	public static void main(String[] args) {


		String nomes = "Ana,joao,maria,linda,senhora,madame,felix,bang,jinyoung,yugyeom";


		List<String> nomesAlunos = new ArrayList<>();

		nomesAlunos.addAll(Arrays.asList(nomes.split(",")));


		Random rm = new Random();


		for(int i = 0 ; i < 10; i++) {

			
			int select = rm.nextInt( 9 );
			int numGrupo = 0;
			
			if(select + 1  < nomesAlunos.size()) {
				numGrupo =+ 1 ;
				
				System.out.println("Grupo #" + numGrupo );
				System.out.println(nomesAlunos.get(select));
				System.out.println(nomesAlunos.get(select + 1));

				nomesAlunos.remove(select + 1);
				nomesAlunos.remove(select);
				System.out.println("");
			}
		}
	}
}
