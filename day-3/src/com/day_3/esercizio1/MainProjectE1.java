package com.day_3.esercizio1;

public class MainProjectE1 {

	public static void main(String[] args) {
		
		String str1 = "ciao";
		stringPariDispari(str1);
		String str2 = "Mirko";
		stringPariDispari(str2);

		
		int anno1 = 2020;
        int anno2 = 2021;

        System.out.println(anno1 + " è bisestile? " + annoBisestile(anno1));
        System.out.println(anno2 + " è bisestile? " + annoBisestile(anno2));
	}
	
	public static  void stringPariDispari(String str) {
		if(str.length() % 2 == 0) {
			System.out.println(true);		
		}else {
			System.out.println(false);
		}
	}
	public static boolean annoBisestile(int anno) {
		if (anno % 4 == 0) {
            if (anno % 100 == 0) {
                if (anno % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }

	}

}
