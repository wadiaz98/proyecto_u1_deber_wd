package com.example.demo.tradicional;

public class Cancha {
	
	private String numeroCancha, tipo;
	
	@Override
	public String toString() {
		return "Cancha [numeroCancha=" + numeroCancha + ", tipo=" + tipo + "]";
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
