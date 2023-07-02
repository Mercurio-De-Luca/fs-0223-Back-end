package com.lettoreMultimediale;

import java.util.Scanner;

public class LettoreMusicale {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ElementoMultimediale[] elementi = new ElementoMultimediale[5];
		
		for(int i = 0; i < elementi.length; i++) {
			
			String titolo = null;
			int durata = 0;
			int volume = 0;
			int luminosita = 0;
			
			if(i == 0) {
				System.out.print("Inserisci il titolo: ");
				 titolo = sc.nextLine();
				
				System.out.print("Inserisci la durata: ");
				 durata = sc.nextInt();
				sc.nextLine();
				
				System.out.print("Inserisci il volume: ");
				 volume = sc.nextInt();
				sc.nextLine();	
			
			}else if(i == 1) {
				System.out.print("Inserisci il titolo: ");
				 titolo = sc.nextLine();
				
				System.out.print("Inserisci la durata: ");
				 durata = sc.nextInt();
				sc.nextLine();
				
				System.out.print("Inserisci la luminosità: ");
				 luminosita = sc.nextInt();
				sc.nextLine();
				
				System.out.print("Inserisci il volume: ");
				 volume = sc.nextInt();
				sc.nextLine();	
			}else {
				System.out.print("Inserisci il titolo: ");
				 titolo = sc.nextLine();
				 
				System.out.print("Inserisci la luminosità: ");
				 luminosita = sc.nextInt();
				sc.nextLine();
				
				
			}
			
			
			if (i == 0) {
                elementi[i] = new RegistarazioneAudio(titolo, durata, volume);
            } else if (i == 1) {
                elementi[i] = new Video(titolo, durata, volume, luminosita);
            } else {
                elementi[i] = new Immagine(titolo, luminosita);
            }
		}
		
		int numeroScelto;
		do {
			System.out.print("Inserisci l'indice dell'elemento da eseguire: ");
			numeroScelto = sc.nextInt();
			sc.nextLine();
			
			switch (numeroScelto) {
		    case 0:
		    	System.out.print("Lettore spento");
		        break;
		    case 1:
		    case 2:
		    case 3:
		    case 4:
		    case 5:
		        elementi[numeroScelto - 1].play();
		        break;
		    default:
		        System.out.println("Scelta non valida. Riprova.");
		        break;
		}
		}while(numeroScelto != 0);

	}

}
