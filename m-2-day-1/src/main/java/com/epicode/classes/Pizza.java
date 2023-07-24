package com.epicode.classes;

public class Pizza {

	private String nome;
	private double calories;
	private double price;
	
	public Pizza(String nome, double calories, double price) {
		super();
		this.nome = nome;
		this.calories = calories;
		this.price = price;
	}
	
	public String getMenu() {
		return this.nome + " Calorie: " + this.calories + " Price: " + this.price;
	}
	
}
