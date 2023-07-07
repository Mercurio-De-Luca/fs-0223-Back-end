package com.esercizioday9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MainProject {

	public static void main(String[] args) {
		
		
		Product prodotto1 = new Product(001, "libro", "books", 100.0);
		Product prodotto2 = new Product(001, "libro", "books", 15.0);
		Product prodotto3 = new Product(001, "libro", "books", 200.0);
		Product prodotto4 = new Product(001, "libro", "books", 150.0);
		Product prodotto5 = new Product(001, "libro", "books", 80.0);
		Product prodotto6 = new Product(001, "libro", "books", 700.0);

		
		List<Product> books = new ArrayList<>();
		books.add(prodotto1);
		books.add(prodotto2);
		books.add(prodotto3);
		books.add(prodotto4);
		books.add(prodotto5);
		books.add(prodotto6);
		
		Stream<Product> bs = books.stream();
		Stream<Product>  booksCostosi = bs.filter(e -> ((Product) bs).getPrice() > 100);
		
	}

}
