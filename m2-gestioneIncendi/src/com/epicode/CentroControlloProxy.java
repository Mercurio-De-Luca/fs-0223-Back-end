package com.epicode;

public class CentroControlloProxy implements ICentroControllo{

	ICentroControllo concreteCentroControllo;

	public CentroControlloProxy() {
		concreteCentroControllo = new CentroControlloFactory().createCentroControllo("HTTP");
	}

	public void rilevaIncendio(InfoSonda infoSonda) {
		System.out.println("proxy.rilevaIncendio");
		concreteCentroControllo.rilevaIncendio(infoSonda);
	}
	
}
