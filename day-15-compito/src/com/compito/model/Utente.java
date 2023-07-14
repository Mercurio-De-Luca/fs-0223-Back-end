package com.compito.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Utente {

	@Id
	private int numeroTessera;
	private String nome;
	private String cognome;
	private LocalDate dataNascita;
	
	
	public Utente() {
		super();
		// TODO Auto-generated constructor stub
	}


    public Utente(int numeroTessera, String nome, String cognome, LocalDate dataNascita) {
        this.numeroTessera = numeroTessera;
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
    }


	public int getNumeroTessera() {
		return numeroTessera;
	}


	public void setNumeroTessera(int numeroTessera) {
		this.numeroTessera = numeroTessera;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCognome() {
		return cognome;
	}


	public void setCognome(String cognome) {
		this.cognome = cognome;
	}


	public LocalDate getDataNascita() {
		return dataNascita;
	}


	public void setDataNascita(LocalDate dataNascita) {
		this.dataNascita = dataNascita;
	}


	@Override
	public String toString() {
		return "Utente [numeroTessera=" + numeroTessera + ", nome=" + nome + ", cognome=" + cognome + ", dataNascita="
				+ dataNascita + "]";
	}
	
	
}
