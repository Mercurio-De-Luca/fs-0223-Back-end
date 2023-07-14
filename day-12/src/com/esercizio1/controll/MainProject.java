package com.esercizio1.controll;

import java.sql.SQLException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.esercizio1.model.Evento;
import com.esercizio1.model.TipoEvento;

public class MainProject {
	
	static EntityManagerFactory  emf = Persistence.createEntityManagerFactory("day12");
	static EntityManager em = emf.createEntityManager();

	public static void main(String[] args) {
		
		Evento e1 = new Evento("Finale coppa Italia","partita di calcio", TipoEvento.PRIVATO, 50000 );
		
		try {
			save(e1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	 public static void save(Evento e) throws SQLException {
			em.getTransaction().begin();
			em.persist(e);
			em.getTransaction().commit();
			System.out.println(e);
		}
}
