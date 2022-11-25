package com.example.demo.herencia;

public class CanchaFutbolH extends CanchaH{
	
	private String sueloCancha;
	
	public Integer descuentoReserva() {
		System.out.println("La cancha tiene un descuento del 10%");
		return 10;		
	}
	
	//Set y Get

	public String getSueloCancha() {
		return sueloCancha;
	}

	public void setSueloCancha(String sueloCancha) {
		this.sueloCancha = sueloCancha;
	}
	

	@Override
	public String toString() {
		return super.toString() + "CanchaFutbolH [sueloCancha=" + sueloCancha + "]";
	}
}
