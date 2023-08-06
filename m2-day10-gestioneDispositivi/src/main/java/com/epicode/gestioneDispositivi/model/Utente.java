package com.epicode.gestioneDispositivi.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
public class Utente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, unique = true)
	private String username;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private String cognome;
	
	@Column(nullable = false, unique = true)
	private String email;
	
	@OneToMany(mappedBy = "utente")
	private List<Dispositivo> dispositivo;

	public Utente(String username, String nome, String cognome, String email, List<Dispositivo> dispositivo) {
		super();
		this.username = username;
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.dispositivo = dispositivo;
	}
}
