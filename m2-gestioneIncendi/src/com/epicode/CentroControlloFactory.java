package com.epicode;

public class CentroControlloFactory {

	public ICentroControllo createCentroControllo(String tipoControllo) {
		if (tipoControllo == null) {
			return null;
		} else if (tipoControllo.equals("HTTP")) {
			return new CentroControlloHttp();
		}
		return null;
	}
}
