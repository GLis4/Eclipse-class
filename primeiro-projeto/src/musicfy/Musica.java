package musicfy;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;

public class Musica {

	int opcao;
	String nome;
	String genero;
	double duracao;
	String artista;
	
	static void tocar() {
		try {
            File soundDir = new File("C:\\Users\\Laercio\\Music\\tocaai");
            File soundFile = new File(soundDir, "issonToca (online-audio-converter.com).wav");
            AudioInputStream sound = AudioSystem.getAudioInputStream(soundFile);
            DataLine.Info info = new DataLine.Info(Clip.class, sound.getFormat());
            Clip clip = (Clip) AudioSystem.getLine(info);
            clip.open(sound);
            clip.start();
        } catch (Exception e) {
            System.out.println(e);
        }
	}
}
