package com.example.demo.springboot;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class ReservaCanchaSB {
	
	private String numeroReserva;
	
	private UsuarioSB usuario;
	
	private CanchaSB cancha;
	
	private LocalDateTime fechaCita;
	
	private LocalDateTime fechaReserva;
	
	public void reservar(String numeroReservaH,LocalDateTime fechaCita, CanchaSB canchaH, UsuarioSB usuarioH) {
		
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

	private void guardaReserva(ReservaCanchaSB reservaCancha) {
		//Funciona como INSERT al conectarse a la base de datos
		System.out.println("Se ha reservado la cancha: ");
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

	public UsuarioSB getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioSB usuario) {
		this.usuario = usuario;
	}

	public CanchaSB getCancha() {
		return cancha;
	}

	public void setCancha(CanchaSB cancha) {
		this.cancha = cancha;
	}

	public LocalDateTime getFechaCita() {
		return fechaCita;
	}

	public void setFechaCita(LocalDateTime fechaCita) {
		this.fechaCita = fechaCita;
	}
	

}
