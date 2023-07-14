package com.compito.model;

public class Libro extends ElementoBibliotecario {
	
	private String autore;
	private String genere;
	
	
	public Libro() {
		super();
		
	}
	
	public Libro(String isbn, String titolo, int annoPubblicazione, int numeroPagine) {
		super(isbn, titolo, annoPubblicazione, numeroPagine);
		// TODO Auto-generated constructor stub
	}

	public Libro(String autore, String genere) {
		super();
		this.autore = autore;
		this.genere = genere;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	@Override
	public String toString() {
		return "Libro [autore=" + autore + ", genere=" + genere + "]";
	}
	
	

}
