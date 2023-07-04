package com.esercizio.day7;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainEsercizio1 {
	
	private static Logger log = LoggerFactory.getLogger(MainEsercizio1.class);

	public static void main(String[] args) {
		
		inserisciDatiUtente();

	}

	public static void inserisciDatiUtente() {
		
		Scanner sc = new Scanner(System.in);
		int n;
		String parola;
		
		Set<String> paroleDuplicate = new HashSet<String>();
		Set<String> paroleDistinte = new HashSet<String>();
		
		System.out.print("Inserisci il numero delle parole: ");
		n = sc.nextInt();
		sc.nextLine();
			
		for(int i = 0; i < n; i++) {
				System.out.print("Inserisci la parola: ");
				parola = sc.nextLine();
				
				if(!paroleDistinte.add(parola)) {
					   paroleDuplicate.add(parola);
				}
		}
		
		
		   System.out.println("Parole duplicate:");
	        for (String parole : paroleDuplicate) {
	           log.info(parole);
	        }
		
		
		int size = paroleDistinte.size();
		log.info("Numero di parole distinte: " + size);

		
		 System.out.println("Elenco delle parole distinte:");
	        for (String parole : paroleDistinte) {
	        	log.info(parole);
	        }
	}
}
