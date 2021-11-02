package projetos.hackerankdes;

public class CloseToZero {

	public static void main(String[] args) {

		 int n[] = {-11, 15, 22, 10, 7, 29};
		 
		int menorValor = Integer.MAX_VALUE;
		for (int i = 0; i < n.length; i++) {
			if (n[i] < menorValor && n[i] > 0) {
				menorValor = n[i];
			}
		}
		System.out.println(menorValor);
	}

}

