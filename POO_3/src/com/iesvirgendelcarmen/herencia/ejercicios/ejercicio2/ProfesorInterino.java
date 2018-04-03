package com.iesvirgendelcarmen.herencia.ejercicios.ejercicio2;

import java.time.LocalDate;

public class ProfesorInterino extends Profesor {
	private LocalDate finDeContrato;

	public ProfesorInterino(String nombre, String dni, LocalDate fechaDeNacimiento, String especialidad,
			long diasDeVacaciones, LocalDate finDeContrato) {
		super(nombre, dni, fechaDeNacimiento, especialidad, diasDeVacaciones);
		this.finDeContrato = finDeContrato;
	}

	public LocalDate getFinDeContrato() {
		return finDeContrato;
	}

	@Override
	public String toString() {
		return getNombre()+" acaba su contrato en " + finDeContrato;
	}
	
	
}
