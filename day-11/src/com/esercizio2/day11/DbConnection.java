package com.esercizio2.day11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class DbConnection {

	String url = "jdbc:postgresql://localhost:5432/";
	String dbName = "esercizio_2";
	String user = "postgres";
	String pass = "root";
	Statement st;
	
	
	public DbConnection() throws SQLException {
		Connection conn = DriverManager.getConnection(url+dbName, user, pass);
		st = conn.createStatement();
		creaTabellaStudenti();
		System.out.println("DB Connesso!!");
	}
	
	public void creaTabellaStudenti() throws SQLException {
		String sql =   " CREATE TABLE IF NOT EXISTS studenti ("
				+ "		id SERIAL PRIMARY KEY,"
				+ " 	name VARCHAR NOT NULL,"
				+ "		lastname VARCHAR NOT NULL,"
				+ "		gender VARCHAR NOT NULL,"
				+ "		birthdate DATE NOT NULL,"
				+ "		avg INTEGER NOT NULL,"
				+ "		min_vote INTEGER NOT NULL,"
				+ "		mix_vote INTEGER NOT NULL"
				+ " );" ;
		st.executeUpdate(sql);
		System.out.println("La tabella degli studenti è stata creata!!");
	}
	
	public void inserisciStudente(Studenti s) throws SQLException {
		String sql = " INSERT INTO studenti (name, lastname, gender, birthdate, avg, min_vote, mix_vote) "
				   + "VALUES ('"+s.getName()+"', '"+s.getLastname()+"', '"
				   + s.getGender()+"', "+s.getBirthdate()+", "+s.getAvg()+",  "+s.getMin_vote()+",  "+s.getMax_vote()+");";
		st.executeUpdate(sql);
	}

	
}
