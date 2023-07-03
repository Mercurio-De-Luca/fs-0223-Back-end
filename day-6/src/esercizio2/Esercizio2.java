package esercizio2;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Esercizio2 {

	public static void main(String[] args) {
		
		Logger log = LoggerFactory.getLogger(Esercizio2.class);
		
		Scanner sc = new Scanner(System.in);
		double km;
		double litri;
		
		do {
			try {
				System.out.print("Inserisci i km percorsi: ");
				km = sc.nextInt();
				sc.nextLine();
				
				System.out.print("Inserisci i litri di carburante consumati: ");
				litri = sc.nextInt();
				sc.nextLine();
				
				
				if(litri == 0) {
					log.error("Errore nell'inserire i litri di carburante consumati");
					continue;
				}
				
				kmLitri(km,litri);
			}catch(Exception  e) {
				log.error("ERRORR" + e.getMessage());
			}
		}while(true);
	}
	
	private static void kmLitri(double a, double b) {
		System.out.println("Numero di km/litro percorsi: " + a / b);
	}

}
