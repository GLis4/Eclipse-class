package projetos.caixaMercado;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Caixa.aberturaDeCaixa();
		
		System.out.println("CPF do cliente: ");
		Venda.cpfCliente = sc.nextLine();
		
		int opcao = -1;
		while(opcao != 0 ) {
			
			
			
			System.out.println("Digite \n0- Sair \n1- addProduto \n2- Mostrar valor final .");
			opcao = Integer.parseInt(sc.nextLine());
			
			switch(opcao) {
			case 1 :
				String altern = "";
				 do{
					System.out.println("digite codigo");
					int codigo = Integer.parseInt(sc.nextLine());
					System.out.println("digite valor: ");
					double valor = Double.parseDouble(sc.nextLine());
					Venda.addProdutos(codigo, valor);
					System.out.println("Adicionar prod? S/N");
					 altern = sc.nextLine();
					
				}while(altern.equalsIgnoreCase("s") );
				break;

			case 2: 
				if(Venda.cpfCliente.contains("0") == false ){
					System.out.println("CPF do cliente: " + Venda.cpfCliente);
				}
				for(int i = 0; i< Venda.listCompras.size(); i++ ) {
					System.out.print("Codigo: ");
					System.out.println(Venda.listCompras.get(i).codigo);	
					System.out.print("Valor : ");
					System.out.println(Venda.listCompras.get(i).valor);					
					
				}
				System.out.println("----------------- ");
				System.out.print("Total a pagar: ");
				System.out.println(Venda.calcularTotal());
				
				break;
			case 0 : 
				opcao = 0;
				sc.close();
				break;

			default: 
				System.out.println("Opcao não existe");
			}

		};
	}
}