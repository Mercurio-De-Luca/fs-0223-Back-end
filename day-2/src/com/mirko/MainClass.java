package com.mirko;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rettangolo r1 = new Rettangolo(15,25);
		stampaRettangolo(r1);
		
		Rettangolo r2 = new Rettangolo(10,22);
		Rettangolo r3 = new Rettangolo(9,25);
		stampaDueRettangoli(r2, r3);
		
	}
	
	
	public static void stampaRettangolo(Rettangolo r1) {
		System.out.println("Perimetro "+ r1.calcolaPerimetro());
		System.out.println("Area "+ r1.calcolaArea());
	}
	
	public static void stampaDueRettangoli(Rettangolo r2, Rettangolo r3) {
		System.out.println(r2.calcolaPerimetro());
		System.out.println(r2.calcolaArea());
		
		System.out.println(r3.calcolaPerimetro());
		System.out.println(r3.calcolaArea());
		
		System.out.println( "Somma del perimetro " + r2.calcolaPerimetro() + r3.calcolaPerimetro());
		System.out.println("Somma del Area " + r2.calcolaArea() + r3.calcolaArea());
	}
}
