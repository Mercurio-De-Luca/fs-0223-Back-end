package com.epicode.gestioneDispositivi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.epicode.gestioneDispositivi.model.Utente;
import com.epicode.gestioneDispositivi.service.GestioneService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/gestione_dispositivi")
public class GestioneController {
	
	
	@Autowired GestioneService gestioneService;

	@GetMapping("/utenti")
	@PreAuthorize("hasRole('USER')or hasRole('ADMIN')")
	public ResponseEntity<List<Utente>> getAll() {
		List<Utente> listaUtenti = gestioneService.getAllUtenti();
		ResponseEntity<List<Utente>> resp = new ResponseEntity<List<Utente>>(listaUtenti, HttpStatus.OK);
		return resp;
	}
	
	@GetMapping("/utenti/{id}")
	@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
	public ResponseEntity<?> getByID(@PathVariable Long id) {
			try {
			Utente u = gestioneService.getUtentiByID(id);
			return new ResponseEntity<Utente>(u, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/crea")
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<?> createU(@RequestBody Utente utente) {
		try {
			Utente u = gestioneService.createUtente(utente);
			return new ResponseEntity<Utente>(u, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}
	
	@PutMapping("/modifica/{id}")
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<?> updateU(@PathVariable Long id, @RequestBody Utente utente) {
		try {
			Utente u = gestioneService.updateUtente(id, utente);
			return new ResponseEntity<Utente>(u, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/elimina/{id}")
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<String> removeUtente(@PathVariable Long id) {
				
		try {
			String msg = gestioneService.removeUtenteByID(id);
			return new ResponseEntity<String>(msg, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
		}

	}
}
