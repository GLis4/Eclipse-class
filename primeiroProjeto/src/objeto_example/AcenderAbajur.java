package objeto_example;

public class AcenderAbajur {
	public static void main(String[] args) {
		
		
		declararAtributos();
		
	} 
	
	static void declararAtributos() {
		Abajur abj = new Abajur();
		abj.cor = "Branco";
		abj.tipo = "de mesa";
		abj.ligar();
		abj.acender();
	}
}
