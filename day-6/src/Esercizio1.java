import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Esercizio1 {

	public static void main(String[] args) {
		
		Logger log = LoggerFactory.getLogger(Esercizio1.class);
		int[] arrNum = new int[5];
		Scanner sc = new Scanner(System.in);
		int max = 10;
		int min = 1;
		int range = max - min +1;

		for(int i = 0; i < arrNum.length; i++) {
			arrNum[i] = (int) (Math.random() * range) + min;
		}
		
		System.out.println("Array iniziale: ");
		stampaArray(arrNum);
		
		int numero = 0;
		int posizione;
		
		do {
			try {
				System.out.print("Inserisci una posizione tra 1-5 (0 per interrompere il programma)");
				posizione = sc.nextInt();
				sc.nextLine();
				
				if(posizione == 0) {
					log.info("Programma terminato");
					break;
				}else if(posizione < 1 || posizione > 5) {
					log.error("Posizione inesistente");
					continue;
				}
				
				System.out.print("Inserisci il numero da inserire nell'array: ");
				numero = sc.nextInt();
				sc.nextLine();
				
                arrNum[posizione - 1] = numero;
                if(numero < 1 || numero > 10) {
					log.error("Numero non supportato");
					continue;
				}
				
				System.out.println("Array modificato: ");
				stampaArray(arrNum);
				
			}catch(Exception e) {
				log.error(e.getMessage());
			}
		}while(true);

	}
	
	private static void stampaArray(int[] arrNum) {
		for(int i = 0; i < arrNum.length; i++) {
			System.out.println(arrNum[i]);
		}
	}

}
