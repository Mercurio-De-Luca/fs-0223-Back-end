package com.day10.compito;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MainBiblioteca {
	
	private static Logger log = LoggerFactory.getLogger(MainBiblioteca.class);
	private static List<Libro> libri = new  ArrayList<Libro>(); 
	private static List<Rivista> riviste = new  ArrayList<Rivista>();

	public static void main(String[] args) {
		
		Libro l1 = new Libro("001L", "La mentalità vincente",LocalDate.of(2017, 11, 15)  , 160,"George Mumford", "Sport");
		Libro l2 = new Libro("002L", "The Mamba mentality. Il mio basket ",LocalDate.of(2018, 11, 13)  , 210,"Koby Bryant", "Sport");
		Libro l3 = new Libro("003L", "Adrenalina. My untold stories",LocalDate.of(2021, 12, 2)  , 272,"Zlatan Ibrahimović ", "Sport");
		Libro l4 = new Libro("004L", "Lionel Messi. La biografia autorizzata. Ediz. illustrata",LocalDate.of(2022, 05, 31)  , 208," Florent Torchut", "Biografia");
		
		
		Rivista r1 = new Rivista("001R","Ricche minere. Rivista semestrale di storia dell'arte (2015) (Vol. 3)",LocalDate.of(2015, 06, 19) , 140, Periodicita.SEMESTRALE);
		Rivista r2 = new Rivista("002R","Scenario. Rivista mensile delle arti della scena.",LocalDate.of(1939, 12, 31) , 35, Periodicita.MENSILE);
		Rivista r3 = new Rivista("003R","L'illustrazione italiana. Rivista settimanale.",LocalDate.of(1915, 01, 1) , 16, Periodicita.SETTIMANALE);
		
		aggiungiLibri(l1);
		aggiungiLibri(l2);
		aggiungiLibri(l3);
		aggiungiLibri(l4);
		
		aggiungiRivista(r1);
		aggiungiRivista(r2);
		aggiungiRivista(r3);
	
		stampaLibri();
		stampaRiviste();
		 
		//rimozioneLibro("003L");
		
		//rimozioneRivista();
		 
		
		//log.info("Questo è il risultato della ricerca: "+ ricercaLibro("004L"));
		//log.info("Questo è il risultato della ricerca: "+ ricercaRivista("002R"));
		
		//log.info("Questo è il risultato della ricerca: "+ ricercaPerAnnoUnLibro(LocalDate.of(2017, 11, 15)));
		//log.info("Questo è il risultato della ricerca: "+ ricercaPerAnnoUnRivista(LocalDate.of(1915, 01, 1)));
		log.info("Questo è il risultato della ricerca: "+ ricercaPerAutoreLibro("Koby Bryant"));
	}

	public static void aggiungiLibri(Libro l) {
		
		libri.add(l);
		
	}
	public static void aggiungiRivista(Rivista r) {
			
		riviste.add(r);
			
	}
	
	public static void stampaLibri() {
        for (Libro elemento : libri) {
            System.out.println(elemento);
        }
    }
	
	public static void stampaRiviste() {
        for (Rivista elemento : riviste) {
            System.out.println(elemento);
        }
    }
	
	public static void rimozioneLibro(String isbn) {
		
		libri.removeIf(e -> e.getIsbn().equals(isbn));
		;
	}
	
	public static void rimozioneRivista(String isbn) {
		
		riviste.removeIf(e -> e.getIsbn().equals(isbn));
		
	}
	
	public static List<Libro>  ricercaLibro(String isbn) {
		
		List<Libro> libro = libri.stream().filter(e -> e.getIsbn().equals(isbn)).collect(Collectors.toList());
		 
		return libro ;
	}
	
	public static List<Rivista>  ricercaRivista(String isbn) {
		
		List<Rivista> rivista = riviste.stream().filter(e -> e.getIsbn().equals(isbn)).collect(Collectors.toList());
		 
		return rivista ;
	}
	
	public static List<Libro> ricercaPerAnnoUnLibro (LocalDate d) {
		
		List<Libro> libro = libri.stream().filter(e -> e.getAnnoPubblicazione().equals(d)).collect(Collectors.toList());
		
		return libro ;
	}
	
    public static List<Rivista> ricercaPerAnnoUnRivista (LocalDate d) {
		
		List<Rivista> rivista = riviste.stream().filter(e -> e.getAnnoPubblicazione().equals(d)).collect(Collectors.toList());
		
		return rivista ;
	}
    
    
    public static List<Libro> ricercaPerAutoreLibro(String autore){
    	
    	List<Libro> libro = libri.stream().filter(e -> e.getAutore().equals(autore)).collect(Collectors.toList());
    	
    	return libro;
    }
}
	