package com.compito.controll;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.compito.model.ElementoBibliotecario;
import com.compito.model.Libro;
import com.compito.model.Periodicita;
import com.compito.model.Rivista;


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
		
		
		//aggiungiElementoBibliotecario(l1);
		//aggiungiElementoBibliotecario(l2);
		//aggiungiElementoBibliotecario(l3);
		//aggiungiElementoBibliotecario(l4);
		
		//aggiungiElementoBibliotecario(r1);
		//aggiungiElementoBibliotecario(r2);
		//aggiungiElementoBibliotecario(r3);
		
		//rimuoviElemento("001L");
		//ElementoBibliotecario r = ricercaPerIsbn("002L");
		//System.out.println(r);

		//List<ElementoBibliotecario>  e = ricercaPerAnno(2018);
		//System.out.println(e);
		
		//List<ElementoBibliotecario> a = ricercaAutore("Koby Bryant");
		//System.out.println(a);
		
		List<ElementoBibliotecario> a = ricercaTitolo("La ment");
		System.out.println(a);
	}
	
	public static void aggiungiElementoBibliotecario(ElementoBibliotecario e) {
		em.getTransaction().begin();
        em.persist(e);
        em.getTransaction().commit();
	}
	
	public static void rimuoviElemento(String isbn) {
		em.getTransaction().begin();
		ElementoBibliotecario e = em.find(ElementoBibliotecario.class, isbn);
		em.remove(e);
		em.getTransaction().commit();
	}
	public static ElementoBibliotecario ricercaPerIsbn(String isbn) {
		ElementoBibliotecario e = em.find(ElementoBibliotecario.class, isbn);
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
	public static  List<ElementoBibliotecario> ricercaTitolo(String t) {
		List<ElementoBibliotecario> e = em.createQuery("SELECT e FROM ElementoBibliotecario e WHERE e.titolo LIKE :titolo", ElementoBibliotecario.class)
				.setParameter("titolo","%"+t+"%")
				.getResultList();
		return e;
	}
}
