package com.mirko.esercizio_2;

public class Sim {
	
	String numeroTelefono;
	double credito;
	Chiamata[] listaChiamate;
	
	
	public  Sim(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
		this.credito = 0;
		this.listaChiamate = new Chiamata[5];
	}
	public void stampaDti() {
		System.out.println("**** Dati SIM ****");
		System.out.println("Numero SIM: " + this.numeroTelefono);
		System.out.println("Credito : " + this.credito);
		System.out.println("Lista ultime 5 chiamate:");
		for (int i = 0; i < listaChiamate.length; i++) {
			if(listaChiamate[i] != null) {	
				System.out.println(listaChiamate[i].numeroChiamato + " durata: " + listaChiamate[i].durata);
			}
		}
	}
}
