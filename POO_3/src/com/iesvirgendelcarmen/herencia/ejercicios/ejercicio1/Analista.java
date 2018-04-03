package com.iesvirgendelcarmen.herencia.ejercicios.ejercicio1;

public class Analista extends Informatico {
	private String especialidad;

	public Analista(String nombreEmpresa, String especialidad) {
		super(nombreEmpresa);
		this.especialidad = especialidad;
	}
	
	@Override
	public double pagarSueldo(double horas) {
		return super.pagarSueldo(horas)*1.3;
	}

	public String getEspecialidad() {
		return especialidad;
	}
}
