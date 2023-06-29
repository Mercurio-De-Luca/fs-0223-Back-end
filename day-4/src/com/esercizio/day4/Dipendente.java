package com.esercizio.day4;

public class Dipendente {

	static double stipendioBase = 1000;
	private int matricola;
	private double stipendio;
	private double importoOrarioStraordinario;
	private Livello livello;
	private Dipartimento dipartimento;
	
	
	
	public Dipendente(int matricola, Dipartimento dipartimento) {
		super();
		this.matricola = matricola;
		this.dipartimento = dipartimento;
		this.stipendio = stipendioBase;
		this.importoOrarioStraordinario = 30;
		this.livello = Livello.OPERAIO;
		
	}
	public Dipendente(int matricola, double stipendio, double importoOrarioStraordinario, Livello livello,
			Dipartimento dipartimento) {
		super();
		this.matricola = matricola;
		this.stipendio = stipendio;
		this.importoOrarioStraordinario = importoOrarioStraordinario;
		this.livello = livello;
		this.dipartimento = dipartimento;
	}
	public double getImportoOrarioStraordinario() {
		return importoOrarioStraordinario;
	}
	public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
		this.importoOrarioStraordinario = importoOrarioStraordinario;
	}
	public Dipartimento getDipartimento() {
		return dipartimento;
	}
	public void setDipartimento(Dipartimento dipartimento) {
		this.dipartimento = dipartimento;
	}
	public static double getStipendioBase() {
		return stipendioBase;
	}
	public int getMatricola() {
		return matricola;
	}
	public double getStipendio() {
		return stipendio;
	}
	public Livello getLivello() {
		return livello;
	}
	
	public  void stampaDatiDipendente(Dipendente d) {
		
		System.out.println("Matricola: "+ d.getMatricola()+", Stipendio: "+d.getStipendio()+", Straordinario: "+d.getImportoOrarioStraordinario()+", Livello: "+d.getLivello()+", Dipartimento: "+d.getDipartimento());
	}
	
	public Livello promuovi(Dipendente d) {
		if(d.livello == Livello.OPERAIO) {
			 d.livello = Livello.IMPIEGATO;
			 this.stipendio = 1.2;
		}else if(d.livello == Livello.IMPIEGATO) {
			d.livello = Livello.QUADRO;
			this.stipendio = 1.5;
		}else if(d.livello == Livello.QUADRO) {
			d.livello = Livello.DIRIGENTE;
			this.stipendio = 2;
		}else if(d.livello == Livello.DIRIGENTE) {
			System.out.println("Mi dispiace ma il livello dell'operaio è già al massimo");
		}
		return livello;
	}
	
	
}
