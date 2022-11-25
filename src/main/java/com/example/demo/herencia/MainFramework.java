package com.example.demo.herencia;

import java.time.LocalDateTime;

public class MainFramework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CanchaFutbolH canchaF = new CanchaFutbolH();
		canchaF.setNumeroCancha("1243");
		canchaF.setSueloCancha("Cesped");
		canchaF.setTipo("F");
		
		CanchaTenisH canchaT = new CanchaTenisH();
		canchaT.setNumeroCancha("2345");
		canchaT.setTipoRaqueta("Potencia");
		canchaT.setTipo("T");
		
		UsuarioH usuario = new UsuarioH();
		usuario.setNombre("Willan Diaz");
		usuario.setNumroCedula("122132");
		
		ReservaCanchaH reservaCancha = new ReservaCanchaH();
		reservaCancha.reservar("311223", LocalDateTime.of(2022, 11,24,13,20), canchaT, usuario);
	}

}
