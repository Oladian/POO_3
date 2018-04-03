package com.iesvirgendelcarmen.herencia.ejercicios.ejercicio1;

public class Informatico {
	private String nombreEmpresa;
	private double sueldoBase=20.0;
	
	public Informatico(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	
	public double pagarSueldo(double horas) {
		return sueldoBase*horas;
	}
}
