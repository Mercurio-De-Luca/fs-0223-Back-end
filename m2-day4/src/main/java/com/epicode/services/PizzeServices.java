package com.epicode.services;

import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.epicode.model.Pizza;
import com.epicode.repository.IPizzeDAORepository;

import jakarta.transaction.Transactional;

import com.epicode.model.Menu;

@Service
public class PizzeServices {
	
	@Autowired IPizzeDAORepository repo;
	
	@Autowired @Qualifier("menulist") private ObjectProvider<Menu> pizzaListProvider;
	@Autowired @Qualifier("pizza") private ObjectProvider<Pizza> createPizza;
	
	public void addPizze (Pizza p) {
		List<Pizza> pizza = pizzaListProvider.getObject().getMenu();
		pizza.add(p);
	}
	
	public void getMenu() {
		List<Pizza> pizze = pizzaListProvider.getObject().getMenu();
		pizze.forEach(p -> System.out.println(p));
	}
	
	public Pizza createPizza(String name, double price, double calories) {
		Pizza p = createPizza.getObject();
		
		return p.builder()
					.name(name)
					.price(price)
					.calories(calories)
					.build();
	}
	
	public void addPizzaDB(Pizza p) {
		repo.save(p);
		System.out.println(p.getName() + " " + " salvato nel DB!!!");
	}
	
	public void updatePizza(Pizza p) {
		repo.save(p);
		System.out.println(p.getName() + " " + " modificato nel DB!!!");
	}
	
	@Transactional
	public void removePizza(Pizza p) {
		repo.delete(p);
		System.out.println(p.getName() + " " + " eliminato dal DB!!!");
	}
}
