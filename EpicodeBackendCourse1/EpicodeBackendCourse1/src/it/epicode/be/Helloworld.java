package it.epicode.be;

public class Helloworld {

public static void main (String[] args){
	
		String[] persone = {"Mirko","Matteo","Francesca","Giovanna","Leo"};
	
		System.out.println(moltiplica(2,5));
		
		System.out.println(concatena("ciao", 23));
		
		

		}

public static int moltiplica(int x, int y) {
	return x * y;
}
public static String concatena(String x, int y) {
	return x + y;
}
public static String[] inserisciInArray(String [] x, String y) {
	String[] arr = new String[6];
	arr[0] = x[0];
	arr[1] = x[1];
	arr[2] = x[2];
	arr[3] = y;
	arr[4] = x[4];
	arr[5] = x[5];
	
	return arr;
}
	
}



