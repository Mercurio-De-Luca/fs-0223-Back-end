package com.epicode.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.epicode.model.Pizza;
import com.epicode.services.PizzeServices;

@Component
public class PizzaRunner implements CommandLineRunner {

	@Autowired private PizzeServices ps;

	@Override
	public void run(String... args) throws Exception {
		
		Pizza pizzaMargherita = ps.createPizza("Pizza Margherita (tomato, cheese)", 4.99, 1104.0);
		Pizza pizzaHawaiian = ps.createPizza("Pizza Hawaiian (tomato, cheese, ham, pinapple)", 6.49, 1024.0);
		Pizza pizzaSalami = ps.createPizza("Pizza Salami (tomato, cheese, salami)", 5.99, 1160.0);
		
		ps.addPizze(pizzaMargherita);
		ps.addPizze(pizzaHawaiian);
		ps.addPizze(pizzaSalami);
		ps.getMenu();
	}
}
