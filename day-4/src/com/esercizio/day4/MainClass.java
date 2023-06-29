package com.esercizio.day4;

public class MainClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dipendente d1 = new Dipendente(1,1.2,3.5,Livello.IMPIEGATO,Dipartimento.PRODUZIONE);
		d1.stampaDatiDipendente(d1);
		System.out.println(d1.promuovi(d1));
		d1.stampaDatiDipendente(d1);
		
		System.out.println(calcolaPaga(d1));
		calcolaPaga(d1,0);
		
	}
	
	
	public static double calcolaPaga(Dipendente d) {	
		return d.getStipendio();
	}
	
	public static void calcolaPaga(Dipendente d, int o) {
		
		
		double pagaStraordinario = d.getImportoOrarioStraordinario() + d.getStipendio();
		System.out.println(pagaStraordinario);

		
		
	}

	}
