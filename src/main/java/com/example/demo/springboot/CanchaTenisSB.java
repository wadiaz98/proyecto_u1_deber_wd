package com.example.demo.springboot;

import org.springframework.stereotype.Component;

@Component
public class CanchaTenisSB extends CanchaSB{
	
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
