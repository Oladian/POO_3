package com.iesvirgendelcarmen.herencia.ejercicios.ejercicio1;

public class Programador extends Informatico{
	private String lenguaje;

	public Programador(String nombreEmpresa, String lenguaje) {
		super(nombreEmpresa);
		this.lenguaje = lenguaje;
	}

	public String getLenguaje() {
		return lenguaje;
	}
	
	@Override
	public double pagarSueldo(double horas) {
		return super.pagarSueldo(horas)*1.1;
	}

	@Override
	public String toString() {
		return "Informatico programador trabajando en empresa " + getNombreEmpresa()+ " en lenguaje " + lenguaje;
	}
	
}
