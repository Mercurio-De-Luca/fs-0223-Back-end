package com.epicode;

public class GestioneMain {

	public static void main(String[] args) {
		
		CentroControlloProxy centrocontrollo = new CentroControlloProxy();
		Sonda sonda = new Sonda(1l, 21.83, 59.15);
		ControlloSonda c = new ControlloSonda(1L, centrocontrollo);
		sonda.addObserver(c);
		sonda.setlivelloFumo(10);

	}

}
