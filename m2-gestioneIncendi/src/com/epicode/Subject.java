package com.epicode;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject{

	List<Observer> observers = new ArrayList<>();

	public void notifyObserver() {
		for (Observer ob : observers) {
			ob.update(this);
		}
	}

	public void addObserver(Observer ob) {
		observers.add(ob);
	}

	public void removeObserver(Observer ob) {
		observers.remove(ob);
	}

	public List<Observer> getObservers() {
		return observers;
	}
}
