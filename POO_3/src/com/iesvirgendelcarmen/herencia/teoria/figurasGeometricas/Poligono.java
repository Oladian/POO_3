package com.iesvirgendelcarmen.herencia.teoria.figurasGeometricas;

public class Poligono {
	private int numLados;
	private boolean regular;
	private String nombre;
	
	public Poligono(int numLados, boolean regular, String nombre) {
		this.numLados = numLados;
		this.regular = regular;
		this.nombre = nombre;
	}
	
	public int getNumLados() {
		return numLados;
	}
	public boolean isRegular() {
		return regular;
	}
	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return "Poligono [numLados=" + numLados + ", regular=" + regular + ", nombre=" + nombre + "]";
	}
	
	
}
