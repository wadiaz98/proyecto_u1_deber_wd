package com.example.demo.canchas.repository;

import com.example.demo.tradicional.ReservaCancha;

public interface IReservaCanchaRepository {

	// CRUD
	public ReservaCancha buscar(Integer id);

	public void actualizar(ReservaCancha reservaCancha);

	//
	public void insertar(ReservaCancha canchaReservaCancha);

	public void borrar(Integer id); // Recibe el id del objeto a borrar
}
