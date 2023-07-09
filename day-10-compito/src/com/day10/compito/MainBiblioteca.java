package com.day10.compito;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MainBiblioteca {
	
	private static Logger log = LoggerFactory.getLogger(MainBiblioteca.class);
	private static List<Biblioteca> elementi = new  ArrayList<Biblioteca>(); 
	
	private static File file = new File("documenti/salvataggioFile.txt");

	public static void main(String[] args) {
		
		Libro l1 = new Libro("001L", "La mentalità vincente",2018, 160,"George Mumford", "Sport");
		Libro l2 = new Libro("002L", "The Mamba mentality. Il mio basket ",2018, 210,"Koby Bryant", "Sport");
		Libro l3 = new Libro("003L", "Adrenalina. My untold stories",2018, 272,"Zlatan Ibrahimović ", "Sport");
		Libro l4 = new Libro("004L", "Lionel Messi. La biografia autorizzata. Ediz. illustrata",2018, 208," Florent Torchut", "Biografia");
		
		
		Rivista r1 = new Rivista("001R","Ricche minere. Rivista semestrale di storia dell'arte (2015) (Vol. 3)",2015, 140, Periodicita.SEMESTRALE);
		Rivista r2 = new Rivista("002R","Scenario. Rivista mensile delle arti della scena.",1938, 35, Periodicita.MENSILE);
		Rivista r3 = new Rivista("003R","L'illustrazione italiana. Rivista settimanale.",1915 , 16, Periodicita.SETTIMANALE);
		
		aggiungiElemento(r1);
		aggiungiElemento(l1);
		aggiungiElemento(r2);
		aggiungiElemento(r3);
		aggiungiElemento(l2);
		aggiungiElemento(l3);
		aggiungiElemento(l4);
		
		//stampaElementi();
		
		log.info("Il risultato della ricerca è: " + ricercaPerISBN("002R"));
		//log.info("Il risultato della ricerca è: " + ricercaPerAnnoPubblicazione(1915));
		//log.info("Il risultato della ricerca è: " + ricercaPerAutore("Koby Bryant"));
		//rimuoviElemento("003L");
		//stampaElementi();
		
		 try {
			 salvaSuFile();
			 elementi = caricaDaFile();
			 stampaElementi();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void aggiungiElemento(Biblioteca elemento) {
        elementi.add(elemento);
    }
	
	 public static void rimuoviElemento(String codiceISBN) {
	        elementi.removeIf(e -> e.getIsbn().equals(codiceISBN));
	 }
	 
	 public static List<Biblioteca> ricercaPerISBN(String codiceISBN) {
		 
		 List<Biblioteca> elemento = elementi.stream()
				 								.filter(e -> e.getIsbn()
		 										.equals(codiceISBN))
				 								.collect(Collectors.toList());
		 
		return elemento;
	 }
	 
	 public static List<Biblioteca> ricercaPerAnnoPubblicazione(int annoPubblicazione) {
		 List<Biblioteca> elemento =  elementi.stream()
				 								.filter(e -> e.getAnnoPubblicazione() == annoPubblicazione)
				 								.collect(Collectors.toList());
	                
		 return elemento;
	 }
	 
	 public static List<Biblioteca> ricercaPerAutore(String autore) {
		 
		List<Biblioteca> elemento = elementi.stream()
												.filter(e -> e instanceof Libro && ((Libro) e)
												.getAutore().equals(autore))
												.collect(Collectors.toList());
	    	
	    return elemento;
	 }
	 
	 public static void salvaSuFile() throws IOException {
		 
		 String testo = "";
		 for(Biblioteca l : elementi) {
			 if (l instanceof Libro) {
				 testo += l.getIsbn() + " - " + l.getTitolo() + " - " +  l.getAnnoPubblicazione() + " - " +  l.getNumeroPagine() + " - " +  ((Libro) l).getAutore() + " - " +  ((Libro) l).getGenere() + " # ";
			 }else {
				 testo +=  l.getIsbn() + " - " + l.getTitolo() + " - " +  l.getAnnoPubblicazione() + " - " +  l.getNumeroPagine() + " - " +  ((Rivista) l).getPeriodicita() + " # ";
			 }
		 }
		 
		 FileUtils.writeStringToFile(file, testo, "UTF-8");
		 log.info("Testo scritto su file" + file.getPath());
	 }
	 
	 public static List<Biblioteca> caricaDaFile() throws IOException{
		 
		 elementi.clear();
		 
		 String testoFile = FileUtils.readFileToString(file, "UTF-8");
		 String [] p = testoFile.split("#");
		 for(String e : p) {
			 String[] par = e.split("-");
			 if(par.length == 6) {
				 Libro l = new Libro(par[0],par[1],Integer.parseInt(par[2].trim()), Integer.parseInt(par[3].trim()), par[4], par[5]);
				 elementi.add(l);
			 }else if(par.length == 5) {
				 Rivista r = new Rivista(par[0], par[1], Integer.parseInt(par[2].trim()), Integer.parseInt(par[3].trim()),Periodicita.valueOf(par[4].trim()) );
				 elementi.add(r);
			 }
			 
		 }
		 return elementi;
	 }

	public static void stampaElementi() {
		
		for(Biblioteca l : elementi) {
			log.info(l.toString());
		}
	}
	
}
	