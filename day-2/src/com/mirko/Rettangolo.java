package com.mirko;

public class Rettangolo {

	public int altezza;
	public int larghezza;
	
	public Rettangolo(int altezza, int larghezza) {
		this.altezza = altezza;
		this.larghezza = larghezza;
	}
	
	
	public int calcolaPerimetro() {
		return (this.altezza + this.larghezza) * 2;
	}
	public int calcolaArea() {
		return this.altezza * this.larghezza;
	}
}
