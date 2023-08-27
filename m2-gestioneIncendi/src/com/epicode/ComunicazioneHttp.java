package com.epicode;

public class ComunicazioneHttp {

	private String baseUrlNotifica;

	public ComunicazioneHttp(String baseUrlNotifica) {
		this.baseUrlNotifica = baseUrlNotifica;
	}

	public void getMessaggio(Long id, double latitude, double longitude, int livelloFumo) {
		String url = baseUrlNotifica + "?idsonda=" + id + "&lat=" + latitude + "&lon=" + longitude + "&smokelevel="
				+ livelloFumo;
		System.out.println("Chiamata HTTP: " + url);
	}
}
