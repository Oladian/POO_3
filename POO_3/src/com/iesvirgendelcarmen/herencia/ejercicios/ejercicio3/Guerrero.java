package com.iesvirgendelcarmen.herencia.ejercicios.ejercicio3;

public class Guerrero extends Personajes {
	public String arma;

	public Guerrero(String nombre,double energia, String arma) {
		super(nombre, energia);
		this.arma = arma;
	}

	public String getArma() {
		return arma;
	}
	
	public void combatir(double energiaGastada) {
		setEnergia(getEnergia()-energiaGastada);
		System.out.println("Golpeado con "+getArma()+" con un uso de energia de "+energiaGastada);
	}
}
