package com.iesvirgendelcarmen.herencia.ejercicios.ejercicio3;

public class Personajes {
	private String nombre;
	private double energia;
	public Personajes(String nombre, double energia) {
		this.nombre = nombre;
		this.energia = energia;
	}
	public String getNombre() {
		return nombre;
	}
	public double getEnergia() {
		return energia;
	}
	
	public void alimentarse(double alimento) {
		energia+=alimento;
	}
	public void setEnergia(double energia) {
		this.energia = energia;
	}
}
