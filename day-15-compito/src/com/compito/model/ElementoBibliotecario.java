package com.compito.model;

public class ElementoBibliotecario {
	
	private String isbn;
	private String titolo;
	private int annoPubblicazione;
	private int numeroPagine;
	
	
	public ElementoBibliotecario() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ElementoBibliotecario(String isbn, String titolo, int annoPubblicazione, int numeroPagine) {
		super();
		this.isbn = isbn;
		this.titolo = titolo;
		this.annoPubblicazione = annoPubblicazione;
		this.numeroPagine = numeroPagine;
	}


	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	public String getTitolo() {
		return titolo;
	}


	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}


	public int getAnnoPubblicazione() {
		return annoPubblicazione;
	}


	public void setAnnoPubblicazione(int annoPubblicazione) {
		this.annoPubblicazione = annoPubblicazione;
	}


	public int getNumeroPagine() {
		return numeroPagine;
	}


	public void setNumeroPagine(int numeroPagine) {
		this.numeroPagine = numeroPagine;
	}


	@Override
	public String toString() {
		return "ElementoBibliotecario [isbn=" + isbn + ", titolo=" + titolo + ", annoPubblicazione=" + annoPubblicazione
				+ ", numeroPagine=" + numeroPagine + "]";
	}
	

}
