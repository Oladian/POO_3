package com.iesvirgendelcarmen.herencia.ejercicios.ejercicio2;

import java.time.LocalDate;

public class Profesor extends Persona{
	private String especialidad;
	private long diasDeVacaciones;
	
	public Profesor(String nombre, String dni, LocalDate fechaDeNacimiento, String especialidad,
			long diasDeVacaciones) {
		super(nombre, dni, fechaDeNacimiento);
		this.especialidad = especialidad;
		this.diasDeVacaciones = diasDeVacaciones;
	}

	public long getNumeroDeDiasDeVacaciones() {
		return diasDeVacaciones;
	}
	public String toString() {
		return "Nombre: " + getNombre() + ", DNI: " + getDni() + ", Fecha de nacimiento: " + getFechaDeNacimiento();
	}

	public String getEspecialidad() {
		return especialidad;
	}
}
