package com.epicode;

import java.util.List;

public class Sonda extends Subject{

	private Long id;
	private double latitude;
	private double longitude;
	private int livelloFumo;

	public Sonda(Long id, double latitude, double longitude) {
		this.id = id;
		this.latitude = latitude;
		this.longitude = longitude;

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public List<Observer> getObservers() {
		return observers;
	}


	public int getlivelloFumo() {
		return livelloFumo;
	}

	public void setlivelloFumo(int livelloFumo) {
		this.livelloFumo = livelloFumo;
		if (livelloFumo > 5) {
			notifyObserver();
			for (int i = 0; i < 5; i++) {

				System.out.println("alarm!!!");

				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}else {
			System.out.println("Incendio non pericoloso...");
		}
	}
}
