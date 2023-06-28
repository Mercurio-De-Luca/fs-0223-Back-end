package com.day_3.esercizio4;

import java.util.Scanner;

public class mainEsercizio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Inserisci un numero intero: ");
        int n = sc.nextInt();
        contoAllaRovescia(n);
		
		
	}
	
	public static int contoAllaRovescia(int n) {
		for(int i = n; i >= 0; i--) {
			System.out.println(i);
		}
		return n;
	}

}