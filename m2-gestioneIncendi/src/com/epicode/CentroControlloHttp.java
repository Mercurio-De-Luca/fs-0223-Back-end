package com.epicode;

public class CentroControlloHttp implements ICentroControllo{

	ComunicazioneHttp canaleComunicazione;
	private String baseUrlNotifica = "http://host/alarm";

	public CentroControlloHttp() {
		this.canaleComunicazione = new ComunicazioneHttp(baseUrlNotifica);
	}

	@Override
	public void rilevaIncendio(InfoSonda info) {
		canaleComunicazione.getMessaggio( info.getId(), info.getLatitude(), info.getLongitude(), info.getlivelloFumo());
	}

}
