package com.compito.controll;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.compito.model.ElementoBibliotecario;
import com.compito.model.Libro;
import com.compito.model.Periodicita;
import com.compito.model.Prestito;
import com.compito.model.Rivista;
import com.compito.model.Utente;


public class MainArchivio {
	
	static EntityManagerFactory  emf = Persistence.createEntityManagerFactory("biblioteca");
	static EntityManager em = emf.createEntityManager();

	public static void main(String[] args) {
		
		Libro l1 = new Libro("001L", "La mentalità vincente",2018, 160,"George Mumford", "Sport");
		Libro l2 = new Libro("002L", "The Mamba mentality. Il mio basket ",2018, 210,"Koby Bryant", "Sport");
		Libro l3 = new Libro("003L", "Adrenalina. My untold stories",2018, 272,"Zlatan Ibrahimović ", "Sport");
		Libro l4 = new Libro("004L", "Lionel Messi. La biografia autorizzata. Ediz. illustrata",2018, 208," Florent Torchut", "Biografia");
		
		Rivista r1 = new Rivista("001R","Ricche minere. Rivista semestrale di storia dell'arte (2015) (Vol. 3)",2015, 140, Periodicita.SEMESTRALE);
		Rivista r2 = new Rivista("002R","Scenario. Rivista mensile delle arti della scena.",1938, 35, Periodicita.MENSILE);
		Rivista r3 = new Rivista("003R","L'illustrazione italiana. Rivista settimanale.",1915 , 16, Periodicita.SETTIMANALE);
		
		Utente u1 = new Utente(1, "Matteo", "Rossi", LocalDate.of(2000, 05, 02));
		Utente u2 = new Utente(2, "Francesca", "Verdi", LocalDate.of(2002, 04, 20));
		Utente u3 = new Utente(3, "Giovanna", "Bianchi", LocalDate.of(2002, 01, 19));
		
		Prestito p1 = new Prestito(u3,l2,LocalDate.of(2023, 05, 28),LocalDate.of(2023, 10, 28),LocalDate.of(2023, 10, 28));
		Prestito p2 = new Prestito(u2,r2,LocalDate.of(2023, 02, 02),LocalDate.of(2023, 05, 28),LocalDate.of(2024, 10, 28));
		Prestito p3 = new Prestito(u1,l4,LocalDate.of(2023, 04, 01),LocalDate.of(2023, 12, 28),LocalDate.of(2025, 10, 28));
		
		
		//aggiungiElementoBibliotecario(l1);
		//aggiungiElementoBibliotecario(l2);
		//aggiungiElementoBibliotecario(l3);
		//aggiungiElementoBibliotecario(l4);
		
		//aggiungiElementoBibliotecario(r1);
		//aggiungiElementoBibliotecario(r2);
		//aggiungiElementoBibliotecario(r3);
		
		//rimuoviElemento("001L");
		//ElementoBibliotecario r = ricercaPerIsbn("003R");
		//System.out.println(r);

		//List<ElementoBibliotecario>  e = ricercaPerAnno(2018);
		//System.out.println(e);
		
		//List<ElementoBibliotecario> a = ricercaAutore("Koby Bryant");
		//System.out.println(a);
		
		//List<ElementoBibliotecario> e = ricercaPerTitolo("delle arti ");
		//System.out.println("Elementi trovati: ");
		//for (ElementoBibliotecario elemento : e) {
		//    System.out.println(elemento.getTitolo());
		//}
		//aggiungiUtente(u1);
		//aggiungiUtente(u2);
		//aggiungiUtente(u3);
		
		//aggiungiPrestito(p1);
		//aggiungiPrestito(p2);
		//aggiungiPrestito(p3);
		
		//List<ElementoBibliotecario> elementiInPrestito = ricercaElementoPrestato(2);
		//System.out.println("Elementi trovati:");
		//for (ElementoBibliotecario elemento : elementiInPrestito) {
		//    System.out.println(elemento.getTitolo() + elemento.getIsbn());
		//}
		
		//List<Prestito> prestitiScaduti = ricercaPrestitiScadutiNonRestituiti();
		//System.out.println("Prestiti scaduti:");
		//for (Prestito prestito : prestitiScaduti) {
		//    System.out.println(prestito.getUtente().getNome() + prestito.getUtente().getCognome() +  prestito.getElementoPrestato().getTitolo());
		//}



	}
	
	public static void aggiungiElementoBibliotecario(ElementoBibliotecario e) {
		em.getTransaction().begin();
        em.persist(e);
        em.getTransaction().commit();
	}
	public static void aggiungiUtente(Utente e) {
		em.getTransaction().begin();
        em.persist(e);
        em.getTransaction().commit();
	}
	public static void aggiungiPrestito(Prestito p) {
		em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
	}
	
	public static void rimuoviElemento(String isbn) {
		em.getTransaction().begin();
		ElementoBibliotecario e = em.find(ElementoBibliotecario.class, isbn);
		em.remove(e);
		em.getTransaction().commit();
	}
	public static ElementoBibliotecario ricercaPerIsbn(String isbn) {
		em.getTransaction().begin();
		ElementoBibliotecario e = em.find(ElementoBibliotecario.class, isbn);
		em.getTransaction().commit();
		return e;
	}
	
	public static List<ElementoBibliotecario> ricercaPerAnno(int a ) {
		List<ElementoBibliotecario> e = em.createQuery("SELECT e FROM ElementoBibliotecario e WHERE e.annoPubblicazione = :anno", ElementoBibliotecario.class)
				.setParameter("anno",a)
				.getResultList();
		return e;
	}
	public static  List<ElementoBibliotecario> ricercaAutore(String a) {
		List<ElementoBibliotecario> e = em.createQuery("SELECT e FROM ElementoBibliotecario e WHERE e.autore = :autore", ElementoBibliotecario.class)
				.setParameter("autore",a)
				.getResultList();
		return e;
	}
	public static List<ElementoBibliotecario> ricercaPerTitolo(String t) {
	    List<ElementoBibliotecario> e = em.createQuery("SELECT e FROM ElementoBibliotecario e WHERE e.titolo LIKE :titolo", ElementoBibliotecario.class)
	            .setParameter("titolo", "%" + t + "%")
	            .getResultList();
	    return e;
	}
	public static List<ElementoBibliotecario> ricercaElementoPrestato(int nT) {
	    List<ElementoBibliotecario> elementiInPrestito = em.createQuery("SELECT p.elementoPrestato FROM Prestito p WHERE p.utente.numeroTessera = :numeroTessera AND p.dataRestituzioneEffettiva IS NULL", ElementoBibliotecario.class)
	        .setParameter("numeroTessera", nT)
	        .getResultList();
	    return elementiInPrestito;
	}
	public static List<Prestito> ricercaPrestitiScadutiNonRestituiti() {
	    LocalDate dataAttuale = LocalDate.now();
	    List<Prestito> prestitiScaduti = em.createQuery(
	        "SELECT p FROM Prestito p WHERE p.dataRestituzionePrevista < :dataAttuale AND p.dataRestituzioneEffettiva IS NULL", Prestito.class)
	        .setParameter("dataAttuale", dataAttuale)
	        .getResultList();
	    return prestitiScaduti;
	}
	
}
