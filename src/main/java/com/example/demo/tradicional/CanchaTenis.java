package com.example.demo.tradicional;

public class CanchaTenis extends Cancha{
	
	private String tipoRaqueta;
	
	//Set y Get

	public String getTipoRaqueta() {
		return tipoRaqueta;
	}

	public void setTipoRaqueta(String tipoRaqueta) {
		this.tipoRaqueta = tipoRaqueta;
	}

	@Override
	public String toString() {
		return super.toString() + "CanchaTenis [tipoRaqueta=" + tipoRaqueta + "]";
	}
	
	

}
