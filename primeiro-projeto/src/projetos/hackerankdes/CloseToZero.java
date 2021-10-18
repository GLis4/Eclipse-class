package projetos.hackerankdes;

public class CloseToZero {
	
	public static void main(String[] args) {

		int N[] = {5, -1, 1, 4};
		
		for(int i = 0; i< N.length; i++) {
			
			if(N[i] >= 0 && N[i] < 3) {
				
				System.out.println("O numero mais perto do zero é " + N[i]);
			}
		}
	}
}
