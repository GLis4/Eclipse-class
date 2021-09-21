package projetos.hackerankdes;

import java.util.Scanner;

public class ReadFile {
	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		int nLine = 1;
       while(sc.hasNext()){
    	   System.out.println("" + nLine +" "+ sc.nextLine());
    	   nLine++;
       }
        
       
		
	}
}
