package com.epicode;

public class InfoSonda {

	private Long id;
	private double latitude;
	private double longitude;
	private int livelloFumo;

	public InfoSonda(Long id, double latitude, double longitude, int livelloFumo) {
		this.id = id;
		this.latitude = latitude;
		this.longitude = longitude;
		this.livelloFumo = livelloFumo;
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

	public int getlivelloFumo() {
		return livelloFumo;
	}

	public void setlivelloFumo(int livelloFumo) {
		this.livelloFumo = livelloFumo;
	}

	@Override
	public String toString() {
		return "InfoSonda [id=" + id + ", latitude=" + latitude + ", longitude=" + longitude + ", smokeLevel="
				+ livelloFumo + "]";
	}
}
