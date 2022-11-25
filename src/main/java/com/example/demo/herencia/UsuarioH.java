package com.example.demo.herencia;

public class UsuarioH {
	
	private String nombre, numroCedula;
	
	//Set y get

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumroCedula() {
		return numroCedula;
	}

	public void setNumroCedula(String numroCedula) {
		this.numroCedula = numroCedula;
	}

	@Override
	public String toString() {
		return "UsuarioH [nombre=" + nombre + ", numroCedula=" + numroCedula + "]";
	}
	
	

}
