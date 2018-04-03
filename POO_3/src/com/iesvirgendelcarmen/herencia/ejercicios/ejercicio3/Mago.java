package com.iesvirgendelcarmen.herencia.ejercicios.ejercicio3;

public class Mago extends Personajes {
	private String poder;

	public Mago(String nombre, String poder) {
		super(nombre, 100);
		this.poder = poder;
	}

	public String getPoder() {
		return poder;
	}
	
	public String encantar() {
		setEnergia(getEnergia()-2);
		return poder;
	}
}
