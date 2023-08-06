package com.epicode.gestioneDispositivi.model;

import com.epicode.gestioneDispositivi.enums.StatoDispositivo;
import com.epicode.gestioneDispositivi.enums.TipoDispositivo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
public class Dispositivo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "utente_id")
	private Utente utente;
	
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private TipoDispositivo tipoDispositivo;
	
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private StatoDispositivo statoDispositivo;

	public Dispositivo(Utente utente, TipoDispositivo tipoDispositivo, StatoDispositivo statoDispositivo) {
		super();
		this.utente = utente;
		this.tipoDispositivo = tipoDispositivo;
		this.statoDispositivo = statoDispositivo;
	}
}
