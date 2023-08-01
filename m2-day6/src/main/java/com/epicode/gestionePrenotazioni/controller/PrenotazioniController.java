package com.epicode.gestionePrenotazioni.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PrenotazioniController {

	@GetMapping("/homepage")
	public String get() {
		return "index";
	}
	
	@GetMapping("/ITALIANO")
	public String getHomeItalian() {
		return "homeItaliano";
	}
}
