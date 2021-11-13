package desafios;


import java.util.Scanner;

public class DesafioCripto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Z = sc.nextInt();

		String alfabeto = "abcdefghijklmnopqrstuvwxyz";
		char[] alf = alfabeto.toCharArray();
		String n = "";

		for(int i = 0; i < Z; i++) {
			int L = sc.nextInt();
			n += Character.toString(alf[25 - L]);
		}

		System.out.println(n);
		sc.close();
	}

}
