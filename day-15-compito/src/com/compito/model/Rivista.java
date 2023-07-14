package com.compito.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class Rivista extends ElementoBibliotecario {
	
	@Enumerated(EnumType.STRING)
	private Periodicita Periodicita;

	public Rivista() {
		super();
		// TODO Auto-generated constructor stub
	}

    public Rivista(String isbn, String titolo, int annoPubblicazione, int numeroPagine, Periodicita periodicita) {
        super(isbn, titolo, annoPubblicazione, numeroPagine);
        this.Periodicita = periodicita;
    }

	public Periodicita getPeriodicita() {
		return Periodicita;
	}

	public void setPeriodicita(Periodicita periodicita) {
		Periodicita = periodicita;
	}

	@Override
	public String toString() {
		return "Rivsta [Periodicita=" + Periodicita + "]";
	}
	
	

}
