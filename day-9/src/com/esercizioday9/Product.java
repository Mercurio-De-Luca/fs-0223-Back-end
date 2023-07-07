package com.esercizioday9;

public class Product extends ClassAbstract{
	
	private String category;
	private double price;
	
	
	public Product(long id, String name, String category, double price) {
		super(id, name);
		this.category = category;
		this.price = price;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public double getPrice() {
		return price;
	}


	public void setPrince(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + "]";
	}
	
	
	
	
	

}
