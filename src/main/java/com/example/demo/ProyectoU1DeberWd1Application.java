package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.springboot.CanchaFutbolSB;
import com.example.demo.springboot.ReservaCanchaSB;
import com.example.demo.springboot.UsuarioSB;

@SpringBootApplication
public class ProyectoU1DeberWd1Application implements CommandLineRunner{
	
	@Autowired
	private CanchaFutbolSB canchaF;
	
	@Autowired
	private ReservaCanchaSB reservaCancha;
	
	@Autowired
	private UsuarioSB usuario;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1DeberWd1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Spring Boot");
		
		this.canchaF.setNumeroCancha("122332");
		this.canchaF.setSueloCancha("Cesped");
		this.canchaF.setTipo("F");
		
		this.usuario.setNombre("Willan Diaz");
		this.usuario.setNumroCedula("1723548");
		
		this.reservaCancha.reservar("13232", LocalDateTime.of(2022,8,24,10,41), canchaF, usuario);
	}

}
