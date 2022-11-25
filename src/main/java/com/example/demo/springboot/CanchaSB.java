package com.example.demo.springboot;

public class CanchaSB {
	
	private String numeroCancha, tipo;
	
	@Override
	public String toString() {
		return "CanchaSB [numeroCancha=" + numeroCancha + ", tipo=" + tipo + "]";
	}
	
	protected Integer descuentoReserva() {
		System.out.println("El precio de la reserva es: ");
		return 0;
	}
	
	//Set y get

	public String getNumeroCancha() {
		return numeroCancha;
	}

	public void setNumeroCancha(String numeroCancha) {
		this.numeroCancha = numeroCancha;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	

}
