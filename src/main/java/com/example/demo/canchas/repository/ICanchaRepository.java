package com.example.demo.canchas.repository;

import com.example.demo.canchas.modelo.Cancha;

public interface ICanchaRepository {

	//
	public Cancha buscarPorNumero(String numeroCancha);

	// CRUD
	public Cancha buscar(Integer id);

	//
	public void actualizar(Cancha cancha);

	public void insertar(Cancha cancha);

	public void borrar(Integer id); // Recibe el id del objeto a borrar
}
