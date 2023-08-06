package com.epicode.gestioneDispositivi.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.epicode.gestioneDispositivi.enums.TipoDispositivo;
import com.epicode.gestioneDispositivi.model.Dispositivo;
import com.epicode.gestioneDispositivi.model.Utente;
import com.epicode.gestioneDispositivi.repositoryDispositivo.DispositivoRepository;
import com.epicode.gestioneDispositivi.repositoryDispositivo.UtenteRepository;
import com.epicode.gestioneDispositivi.security.exception.MyAPIException;

import jakarta.persistence.EntityExistsException;
import jakarta.persistence.EntityNotFoundException;


@Service
public class GestioneService {

	@Autowired UtenteRepository utenteRepo;
	@Autowired DispositivoRepository dispositivoRepo;
	
	public List<Utente> getAllUtenti() {
		return (List<Utente>) utenteRepo.findAll();
	}
	
	public Utente getUtentiByID(Long id) {
		if(!utenteRepo.existsById(id)) {
			throw new EntityNotFoundException("Utente not exists!!!");
		}
		return utenteRepo.findById(id).get();
	}
	
//	public Utente createUtente(Utente utente) {
////		if(utenteRepo.existsByEmail(utente.getEmail())) {
////			throw new EntityExistsException("Utente email exists!!!");
////		}
////		return  utenteRepo.save(utente);
//		
//		 if(utenteRepo.existsByUsername(utente.getUsername())){
//	            throw new MyAPIException(HttpStatus.BAD_REQUEST, "Username is already exists!.");
//	        }
//		 
//		Utente u = new Utente();
//		u.setNome(u.getNome());
//        u.setUsername(u.getUsername());
//        u.setEmail(u.getEmail());
//        List<Dispositivo> d = new ArrayList<>();
//        
//       u.getDispositivo().forEach(disp -> {
//    	   	Dispositivo dis = utenteRepo.findByRoleName(getDispositivo(disp)).get();
//   			d.add(dis);
//       })
//	}
	
	public Utente createUtente(Utente utente) {
	    if (utenteRepo.existsByUsername(utente.getUsername())) {
	        throw new MyAPIException(HttpStatus.BAD_REQUEST, "Username is already exists!.");
	    }

	    Utente u = new Utente();
	    u.setNome(utente.getNome());
	    u.setUsername(utente.getUsername());
	    u.setEmail(utente.getEmail());
	    List<Dispositivo> d = new ArrayList<>();

//	    utente.getDispositivo().forEach(disp -> {
//	        TipoDispositivo tipoDispositivo = getDispositivo(disp);
//	        Dispositivo dis = dispositivoRepo.findByRoleName(tipoDispositivo).get();
//	        d.add(dis);
//	    });


	    u.setDispositivo(d);
	    return utenteRepo.save(u);
	}
	
	public Utente updateUtente(Long id, Utente u) {
		if(!utenteRepo.existsById(id)) {
			throw new EntityNotFoundException("Utente inesistente!!!");
		}
		if(id != u.getId()) {
			throw new EntityNotFoundException("id e UtenteID non corrispondono!!!");
		}
		return  utenteRepo.save(u);
	}
	
	public String removeUtenteByID(Long id) {
		if(!utenteRepo.existsById(id)) {
			throw new EntityNotFoundException("Utente inesistente!!!");
		}
		Utente c = getUtentiByID(id);
		utenteRepo.delete(c);
		return "Utente eliminato!!!";
	}
	
	public TipoDispositivo getDispositivo(String d) {
	    if (d.equals("smartphone")) return TipoDispositivo.SMARTPHONE;
	    else if (d.equals("tablet")) return TipoDispositivo.TABLET;
	    else if (d.equals("laptop")) return TipoDispositivo.LAPTOP;
	    else return null;
	}
}
  

