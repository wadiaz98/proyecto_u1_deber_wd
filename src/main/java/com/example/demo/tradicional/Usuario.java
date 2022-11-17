package com.example.demo.tradicional;

public class Usuario {
	
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
		return "Usuario [nombre=" + nombre + ", numroCedula=" + numroCedula + "]";
	}
	
	

}
