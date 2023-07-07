package com.day10.compito;

import java.time.LocalDate;

public class Libro extends Biblioteca {

	private String autore;
	private String genere;
	
	
	public Libro(String iSBN, String titolo, LocalDate annoPubblicazione, int numeroPagine, String autore,
			String genere) {
		super(iSBN, titolo, annoPubblicazione, numeroPagine);
		this.autore = autore;
		this.genere = genere;
	}
	
	public String getIsbn() {
		return ISBN;
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
		return "Libro [Codice ISBN=" + ISBN + ", Titolo= " + titolo + ", Anno publicazione= "+ AnnoPubblicazione + ", Numero pagine= "+ numeroPagine + ", autore=" + autore + ", genere=" + genere + "]";
	}
	
	
	
	
}
