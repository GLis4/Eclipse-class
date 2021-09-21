package projetos.hackerankdes;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class StaticRadio {


	public static void main(String[] args) {
		// staticRadio();
		numberFormat();
	}

	static public void staticRadio() {
		Scanner sc = new Scanner(System.in);
		int  b = sc.nextInt();
		int  a = sc.nextInt();
		sc.close();
		if(b<= 0 || a <= 0) {
			System.out.println("Breadth and height must be positive");
		}else {
			int area=b*a;
			System.out.print(area);
		}
	}

	static public void numberFormat(){
		Scanner sc = new Scanner(System.in);
		double  n = sc.nextDouble();
		sc.close();

		NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormat in = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
		NumberFormat ch = NumberFormat.getCurrencyInstance(Locale.CHINA);
		NumberFormat fr = NumberFormat.getCurrencyInstance(Locale.FRANCE);

		System.out.println("US: " + us.format(n));
		System.out.println("India: " + in.format(n));
		System.out.println("China: " + ch.format(n));
		System.out.println("France: " + fr.format(n));


	}
}
