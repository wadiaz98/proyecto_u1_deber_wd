package com.example.demo.tradicional;

import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) {
		
		ReservaCancha reserva = new ReservaCancha();
		
		reserva.reservar("12245", "Willan Diaz", "1725841538", LocalDateTime.of(2022, 11,17,12,11), "5D", "F");
		
	}

}
