package com.example.demo.herencia;

public class CanchaTenisH extends CanchaH{
	
	private String tipoRaqueta;
	
	public Integer descuentoReserva() {
		System.out.println("La cancha tiene un descuento del 18%");
		return 18;
	}
	
	//Set y Get

	public String getTipoRaqueta() {
		return tipoRaqueta;
	}

	public void setTipoRaqueta(String tipoRaqueta) {
		this.tipoRaqueta = tipoRaqueta;
	}

	@Override
	public String toString() {
		return super.toString() + "CanchaTenisHq [tipoRaqueta=" + tipoRaqueta + "]";
	}
	
	

}
