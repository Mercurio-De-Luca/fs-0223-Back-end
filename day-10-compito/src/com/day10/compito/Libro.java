package com.day10.compito;

public class Libro extends Biblioteca {

	private String autore;
	private String genere;
	
	public Libro(String isbn, String titolo, int annoPubblicazione, int numeroPagine, String autore, String genere) {
		super(isbn, titolo, annoPubblicazione, numeroPagine);
		this.autore = autore;
		this.genere = genere;
	}

	public String getAutore() {
		return autore;
	}

	public String getGenere() {
		return genere;
	}

	@Override
	public String toString() {
		return "Libro [Isbn= " + Isbn + ", titolo= " + titolo + ", annoPubblicazione= " + annoPubblicazione +  ", numeroPagine= " + numeroPagine + ", autore= " + autore + ", genere= " + genere + "]";
				
	}

	
	
	

}
