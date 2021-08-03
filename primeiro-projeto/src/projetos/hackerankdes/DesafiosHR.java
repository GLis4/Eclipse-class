package projetos.hackerankdes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DesafiosHR {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		 BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	        int N = Integer.parseInt(bufferedReader.readLine().trim());

	        bufferedReader.close();
	        
	        for(int i = 1 ; i < 11;i++){
	            System.out.println( N + " x " + i + " = " + ( N * i ));
	            
	        }
	}
}