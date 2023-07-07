package com.esercizioday9;

public class Customer extends ClassAbstract{

	private Integer tier;

	public Customer(long id, String name, Integer tier) {
		super(id, name);
		this.tier = tier;
	}

	public Integer getTier() {
		return tier;
	}

	public void setTier(Integer tier) {
		this.tier = tier;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ",tier=" + tier + "]";
	}
	
	
}
