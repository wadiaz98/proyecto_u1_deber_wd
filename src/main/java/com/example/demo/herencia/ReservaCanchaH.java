package com.example.demo.herencia;

import java.time.LocalDateTime;

public class ReservaCanchaH {
	
	private String numeroReserva;
	
	private UsuarioH usuario;
	
	private CanchaH cancha;
	
	private LocalDateTime fechaCita;
	
	private LocalDateTime fechaReserva;
	
	public void reservar(String numeroReservaH,LocalDateTime fechaCita, CanchaH canchaH, UsuarioH usuarioH) {
		
		this.numeroReserva = numeroReservaH;
		this.fechaCita = fechaCita;
		this.fechaReserva = LocalDateTime.now();
		this.cancha = canchaH;
		this.usuario = usuarioH;
		
		this.guardaReserva(this);
		cancha.descuentoReserva();
	}
	
	@Override
	public String toString() {
		return "ReservaCanchaH [numeroReserva=" + numeroReserva + ", usuario=" + usuario + ", cancha=" + cancha
				+ ", fechaCita=" + fechaCita + ", fechaReserva=" + fechaReserva + "]";
	}

	private void guardaReserva(ReservaCanchaH reservaCancha) {
		//Funciona como INSERT al conectarse a la base de datos
		System.out.println("Se ha resrevado la cancha: ");
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

	public UsuarioH getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioH usuario) {
		this.usuario = usuario;
	}

	public CanchaH getCancha() {
		return cancha;
	}

	public void setCancha(CanchaH cancha) {
		this.cancha = cancha;
	}

	public LocalDateTime getFechaCita() {
		return fechaCita;
	}

	public void setFechaCita(LocalDateTime fechaCita) {
		this.fechaCita = fechaCita;
	}
	

}
