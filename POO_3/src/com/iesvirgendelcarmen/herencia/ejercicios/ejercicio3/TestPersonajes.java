package com.iesvirgendelcarmen.herencia.ejercicios.ejercicio3;

public class TestPersonajes {
	public static void main(String[] args) {
		Personajes pj1 = new Guerrero("Brutus", 50, "Mazo");
		Personajes pj2 = new Mago("Merlin", "Llover Asensios");
		
		//Pruebas para guerrero.
		pj1.alimentarse(300);
		System.out.println("	        Personaje Guerrero"
				+ "\n=================================================\n"
				+ "Energia tras alimentarse: "+pj1.getEnergia());
		System.out.println("Arma equipada: "+((Guerrero)pj1).getArma());
		//System.out.printf("Combatiendo con: "+((Guerrero)pj1).combatir(80));
		((Guerrero)pj1).combatir(80);
		System.out.println("Energia tras combatir: "+pj1.getEnergia()+"\n\n");
		
		//Pruebas para mago.
		pj2.alimentarse(500);
		System.out.println("	        Personaje Mago"
				+ "\n=================================================\n"
				+ "Energia tras alimentarse: "+pj2.getEnergia());
		System.out.println("Lanzando el hechizo: "+((Mago)pj2).encantar());
		System.out.println("Energia tras encantar: "+pj2.getEnergia());
		
	}
}
