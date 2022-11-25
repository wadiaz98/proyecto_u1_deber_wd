package com.example.demo.herencia;

public class CanchaH {
	
	private String numeroCancha, tipo;
	
	@Override
	public String toString() {
		return "CanchaH [numeroCancha=" + numeroCancha + ", tipo=" + tipo + "]";
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
