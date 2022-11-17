package com.example.demo.tradicional;

public class CanchaFutbol extends Cancha{
	
	private String sueloCancha;
	
	//Set y Get

	public String getSueloCancha() {
		return sueloCancha;
	}

	public void setSueloCancha(String sueloCancha) {
		this.sueloCancha = sueloCancha;
	}
	

	@Override
	public String toString() {
		return super.toString() + "CanchaFutbol [sueloCancha=" + sueloCancha + "]";
	}
}
