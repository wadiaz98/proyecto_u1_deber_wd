package com.example.demo.canchas.modelo;

import java.math.BigDecimal;

public class Cancha {

	private String numero;
	private String tipo;
	private String complejo;
	private String sector;
	private String suelo;
	private BigDecimal descuento;

	// SET Y GET
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getSuelo() {
		return suelo;
	}

	public void setSuelo(String suelo) {
		this.suelo = suelo;
	}

	public String getComplejo() {
		return complejo;
	}

	public void setComplejo(String complejo) {
		this.complejo = complejo;
	}

	public BigDecimal getDescuento() {
		return descuento;
	}

	public void setDescuento(BigDecimal descuento) {
		this.descuento = descuento;
	}

}
