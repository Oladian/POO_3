package com.iesvirgendelcarmen.herencia.ejercicios.ejercicio2;

import java.time.LocalDate;

public class Persona {
	private String nombre;
	private String dni;
	private LocalDate fechaDeNacimiento;
	
	public Persona(String nombre, String dni, LocalDate fechaDeNacimiento) {
		this.nombre = nombre;
		this.dni = dni;
		this.fechaDeNacimiento=fechaDeNacimiento;
	}
	public String getNombre() {
		return nombre;
	}
	public String getDni() {
		return dni;
	}
	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	@Override
	public String toString() {
		return "Nombre: " + nombre + ", DNI: " + dni + ", Fecha de nacimiento: " + fechaDeNacimiento;
	}
	
}
