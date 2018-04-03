package com.iesvirgendelcarmen.herencia.ejercicios.ejercicio2;

import java.time.LocalDate;

public class ProfesorTitular extends Profesor{
	private double sueldo;
	private LocalDate fechaIncorporacion;
	
	public ProfesorTitular(String nombre, String dni, LocalDate fechaDeNacimiento, String especialidad,
			long diasDeVacaciones, double sueldo, LocalDate fechaIncorporacion) {
		super(nombre, dni, fechaDeNacimiento, especialidad, diasDeVacaciones);
		this.sueldo = sueldo;
		this.fechaIncorporacion = fechaIncorporacion;
	}

	public double getSueldo() {
		return sueldo;
	}

	public LocalDate getFechaIncorporacion() {
		return fechaIncorporacion;
	}

	@Override
	public String toString() {
		return getNombre() + " cobra " + sueldo + " y se incorporó en " + fechaIncorporacion;
	}
	
	
}
