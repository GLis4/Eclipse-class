package projetos.caixaMercado;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Caixa.aberturaDeCaixa();
		int opcao = -1;
		while(opcao != 0 ) {
			System.out.println("Digite \n0- Sair \n1- addProduto \n2- Mostrar valor final .");
			opcao = Integer.parseInt(sc.nextLine());
			switch(opcao) {
			case 1 :
				System.out.println("digite codigo");
				int codigo = Integer.parseInt(sc.nextLine());
				System.out.println("digite valor: ");
				double valor = Double.parseDouble(sc.nextLine());
				Venda.addProdutos(codigo, valor);
				break;
			case 2: 
				System.out.println(Venda.calcularTotal());
			case 0 : 
				opcao = 0;
				sc.close();
				break;
			default: 
				System.out.println("Opcao n�o existe");
			}

		};
	}
}