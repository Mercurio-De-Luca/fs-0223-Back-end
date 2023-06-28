package com.day_3.esercizio3;

import java.util.Scanner;

public class Esercizio3 {

	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	        String stringa;

	        while (true) {
	            System.out.print("Inserisci una stringa :q per uscire dal loop: ");
	            stringa = sc.nextLine();

	            if (stringa.equals(":q")) {
	                break;
	            }

	            StringBuilder risultato = new StringBuilder();

	            for (int i = 0; i < stringa.length(); i++) {
	                char carattere = stringa.charAt(i);
	                risultato.append(carattere);

	                if (i < stringa.length() - 1) {
	                    risultato.append(", ");
	                }
	            }

	            System.out.println("Caratteri separati da virgola: " + risultato.toString());
	        }

	        System.out.println("loop finito.");
	    }

}
