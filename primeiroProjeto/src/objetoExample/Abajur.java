package objetoExample;

public class Abajur {

	// cor, tipo , articulado, energia que recebe

	String cor; 
	String tipo;
	boolean ligado;

	void ligar() {
		ligado = true;

	}

	void acender() {
		if(this.ligado == true){
			System.out.println("Luz acesa");
		} else {
			System.out.println("ERRO, não posso ligar a luz com o abajur desligado");
		}


	}

	void desligar() {
		ligado = false;
	}
}
