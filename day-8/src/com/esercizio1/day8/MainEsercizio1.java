package com.esercizio1.day8;

public class MainEsercizio1 {

	public static void main(String[] args) {
		
		
		ClassThread t1 = new ClassThread("*");
		ClassThread t2 = new ClassThread("#");
		
		t1.start();
		t2.start();

	}

}
