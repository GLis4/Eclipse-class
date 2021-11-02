package projetos.hackerankdes;


import java.util.Scanner;

public class DestroyMountains {
	public static void main(String[] args) {

		//	98736524
		//  System.err.println(mountainH);
		Scanner in = new Scanner(System.in);
		boolean loop = true;
		// game loop
		int[] arrH = new int[8];
        int mountainH = 10;
		
		while (loop) {
			for (int i = 0; i < 8; i++) {
				mountainH -= 1;
				arrH[i] = mountainH;
				
				System.out.println("index Montanha    : " + i);
				System.out.println("Altura da montanha: " + mountainH);

		}

			loop = false;
			 // The index of the mountain to fire on.
		
		}
	}
}
