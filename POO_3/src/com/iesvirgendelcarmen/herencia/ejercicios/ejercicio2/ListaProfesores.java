package com.iesvirgendelcarmen.herencia.ejercicios.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class ListaProfesores {
	private List<Profesor> lista = new ArrayList<Profesor>();
	
	public boolean añadirProfesor(Profesor profesor) {
		return lista.add(profesor);
	}

	public List<Profesor> getLista() {
		return lista;
	}
	
	
}
