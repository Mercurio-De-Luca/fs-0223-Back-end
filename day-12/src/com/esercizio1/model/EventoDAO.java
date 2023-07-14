package com.esercizio1.model;

import java.sql.SQLException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EventoDAO {
	
	static EntityManagerFactory  emf = Persistence.createEntityManagerFactory("day12");
	static EntityManager em = emf.createEntityManager();

	 void save(Evento e) throws SQLException {
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
		System.out.println(e);
	}
	public Evento getById() {
		return null;
	}
	public void delete(Evento e) {}
	
	
}
