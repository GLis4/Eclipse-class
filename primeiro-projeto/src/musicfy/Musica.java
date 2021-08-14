package musicfy;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Musica {

	int opcao;
	String nome;
	String genero;
	double duracao;
	String artista;
	public static void main(String[] args) {
		tocar();
	}
	static void tocar() {
		try {
			//URL do som que no caso esta no pendrive, mais ainda � uma fase de teste.
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("C:\\Users\\Laercio\\M�sicas\\113669612.wav ").getAbsoluteFile());
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
		} catch (Exception ex) {
			System.out.println("Erro ao executar SOM!");
			ex.printStackTrace();
		}
	}
}
