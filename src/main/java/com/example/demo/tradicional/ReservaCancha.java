package com.example.demo.tradicional;

import java.time.LocalDateTime;

public class ReservaCancha {
	
	private String numeroReserva;
	
	private Usuario usuario;
	
	private Cancha cancha;
	
	private LocalDateTime fechaCita;
	
	private LocalDateTime fechaReserva;
	
	public void reservar(String numeroReserva, String nombreUsuario, String numeroCedula,LocalDateTime fechaCita, String numeroCancha,String tipo) {
		
		this.numeroReserva = numeroReserva;
		this.fechaCita = fechaCita;
		
		usuario = new Usuario();
		usuario.setNombre(nombreUsuario);
		usuario.setNumroCedula(numeroCedula);
		
		//T es tenis y F futbol
		if(tipo.equals("T")) {
			CanchaTenis  canchaT = new CanchaTenis();
			canchaT.setTipoRaqueta("Raqueta de potencia");
			canchaT.setTipo("T");
			
			this.cancha = canchaT;
			System.out.println("Cancha Tenis");
		}else {
			CanchaFutbol  canchaF = new CanchaFutbol();
			canchaF.setSueloCancha("Cesped");
			canchaF.setTipo("F");
			
		
			this.cancha = canchaF;
			System.out.println("Cancha Futbol");
		}
		
		this.cancha.setNumeroCancha(numeroCancha);
		this.guardaReserva(this);
	}
	
	@Override
	public String toString() {
		return "ReservaCancha [numeroReserva=" + numeroReserva + ", usuario=" + usuario + ", cancha=" + cancha
				+ ", fechaCita=" + fechaCita + ", fechaReserva=" + fechaReserva + "]";
	}

	private void guardaReserva(ReservaCancha reservaCancha) {
		//Funciona como INSERT al conectarse a la base de datos
		System.out.println("Se ha reservado la cancha:");
		System.out.println(reservaCancha);
	}
	//Set y get

	public String getNumeroReserva() {
		return numeroReserva;
	}

	public void setNumeroReserva(String numeroReserva) {
		this.numeroReserva = numeroReserva;
	}

	public LocalDateTime getFechaReserva() {
		return fechaReserva;
	}

	public void setFechaReserva(LocalDateTime fechaReserva) {
		this.fechaReserva = fechaReserva;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Cancha getCancha() {
		return cancha;
	}

	public void setCancha(Cancha cancha) {
		this.cancha = cancha;
	}

	public LocalDateTime getFechaCita() {
		return fechaCita;
	}

	public void setFechaCita(LocalDateTime fechaCita) {
		this.fechaCita = fechaCita;
	}
	

}
