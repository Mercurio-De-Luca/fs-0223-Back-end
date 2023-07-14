package com.esercizio2.day11;


import java.sql.SQLException;
import java.time.LocalDate;

public class MainEsercizio2 {

	public static void main(String[] args) {
		
		try {
			DbConnection db = new DbConnection();
			Studenti s1 = new Studenti("Mirko", "De Luca", "m", LocalDate.of(2000, 05, 30), 5, 2, 10);
			db.inserisciStudente(s1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
