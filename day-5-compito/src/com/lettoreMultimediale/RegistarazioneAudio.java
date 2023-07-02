package com.lettoreMultimediale;

public class RegistarazioneAudio extends ElementoMultimediale implements IRiproduzioneMultimediale {

	private int durata;
	private int volume;

	
	
	public RegistarazioneAudio(String titolo, int durata, int volume) {
		super(titolo);
		this.durata = durata;
		this.volume = volume;
	}

	public void play() {
		playAudio();
	}
	
	public void playAudio() {
		for(int i = 0; i < durata; i++) {
		System.out.println(titolo + " " + "!".repeat(volume));
		}
	}
	
	public void abbassaVolume() {
		if(volume > 0) {
			volume--;
		}
	}
	
	public void alzaVolume() {
			volume++;
	}

}
