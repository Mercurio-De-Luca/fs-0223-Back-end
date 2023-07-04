package com.esercizio2.day7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.esercizio.day7.MainEsercizio1;

public class MainEsercizio2 {
	
	private static Logger log = LoggerFactory.getLogger(MainEsercizio2.class);

	public static void main(String[] args) {
		
int N = 10;
        
        List<Integer> listaCasuale = listaRandom(N);
        System.out.println("Lista casuale:");
        System.out.println(listaCasuale);
        
        List<Integer> listaInversa = listaInversa(listaCasuale);
        System.out.println("Lista inversa:");
        System.out.println(listaInversa);
        
        boolean stampaPari = true;
        pariDispari(listaCasuale, stampaPari);

	}

	
	public static List<Integer> listaRandom(int N) {
		
		List<Integer> lista = new ArrayList();
		Random ran = new Random();
		
		for(int i = 0; i < N; i++) {
			int nR = ran.nextInt(101);
			lista.add(nR);
		}
		return lista;
	} 
	
	public static List<Integer> listaInversa(List<Integer> lista){
		
		List<Integer> listaInversa = new ArrayList(lista);
		List<Integer> listaOriginale = new ArrayList(lista);
		 int size = listaOriginale.size();
		
		for(int i = size - 1;i >= 0; i--) {
			 listaInversa.add(listaOriginale.get(i));
		}
		
		return listaInversa;
	}
	
	public static void pariDispari(List<Integer> lista, boolean a) {
		
		int size = lista.size();
		
		if(a) {			 
			 for(int i = 0;i < size; i +=2) {
				 log.info("pari: " + lista.get(i));
			 }
		}else {
			for(int i = 1; i < size; i += 2) {
				log.info("dispari: " + lista.get(i));
			}
		}
	}
}
