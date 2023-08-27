package com.epicode;


public class ControlloSonda implements Observer {
	
	private Long id;
	ICentroControllo centrocontrollo;

	public ControlloSonda(Long id, ICentroControllo centrocontrollo) {
		this.id = id;
		this.centrocontrollo= centrocontrollo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public InfoSonda createInfosonda (Sonda son) {
		return new InfoSonda(son.getId(), son.getLatitude(),son.getLongitude(), son.getlivelloFumo());
		
	}
	@Override
	public void update(Subject son) {
		InfoSonda info = createInfosonda ((Sonda) son);
		centrocontrollo.rilevaIncendio(info);
	}


}
