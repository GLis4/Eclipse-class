package desafios;

import java.util.*;
import java.util.Scanner;

public class DesafioCodinGame {
	public static void main(String[] args) {

		List<Integer> arrH = new ArrayList<>();

		int highJ = 0, lowerJ = 0;
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		for (int i = 0; i < N; i++) {

			int H = in.nextInt();
			arrH.add(H);
			if(arrH.size() - 1 > 0) {
				if (H < arrH.get(i - 1) ) {
					highJ += 1;
				}else {
					lowerJ += 1;
				}
			}

		}

		// Write an answer using System.out.println()
		// To debug: System.err.println("Debug messages...");


		System.out.println("Pulos para baixo : " + lowerJ +"\n Pulo pra cima " + highJ );
		in.close();
	}
}
