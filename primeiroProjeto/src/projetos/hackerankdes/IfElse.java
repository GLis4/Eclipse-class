package projetos.hackerankdes;

import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.close();
		String ans = "";
		if (n%2 == 0 && (n>20 || n < 6)) { ans += "Not "; }
		ans += "Weird";
		System.out.println(ans);

	}
}