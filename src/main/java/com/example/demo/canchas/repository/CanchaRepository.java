package com.example.demo.canchas.repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.canchas.modelo.Cancha;

public class CanchaRepository implements ICanchaRepository {

	private static List<Cancha> baseCanchas = new ArrayList();

	@Override
	public Cancha buscarPorNumero(String numeroCancha) {
		// TODO Auto-generated method stub
		// SELECT * FROM CANCHA C WHERE C.NUMERO = numeroCancha
		Cancha cancha = new Cancha();
		cancha.setNumero("125");
		cancha.setTipo("Futbol");
		cancha.setSuelo("Cesped");
		cancha.setComplejo("Leon");
		cancha.setSector("Conocoto");
		cancha.setDescuento(new BigDecimal(0.15));
		return cancha;
	}

	@Override
	public Cancha buscar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizar(Cancha cancha) {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertar(Cancha cancha) {
		// TODO Auto-generated method stub
		baseCanchas.add(cancha);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub

	}

}
