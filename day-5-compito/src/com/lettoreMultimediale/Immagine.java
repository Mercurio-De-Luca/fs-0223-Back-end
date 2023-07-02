package com.lettoreMultimediale;

public class Immagine extends ElementoMultimediale {

	private int luminosita;

	public Immagine(String titolo, int luminosita) {
		super(titolo);
		this.luminosita = luminosita;
	}
	
	
	public void play() {
		show();
	}
	
	public void show() {
		System.out.println(titolo + " " + "*".repeat(luminosita));
	}
	
	public void alzaLuminosita() {
		luminosita++;
	}
	
	public void abbassaLuminosita() {
		if(luminosita > 0) {
			luminosita--;
		}
	}
	
	
}
