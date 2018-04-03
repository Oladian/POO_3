package com.iesvirgendelcarmen.herencia.ejercicios.ejercicio1;

public class TestInformatico {

	public static void main(String[] args) {
		Programador programador1 = new Programador("Nichosoft", "Z--");
		Analista analista1 = new Analista("Pineapple", "Datos");
		
		System.out.printf("Sueldo de programador: %.2f%nSueldo de analista: %.2f",
				programador1.pagarSueldo(45.3),analista1.pagarSueldo(45.3));
		
		System.out.printf(
				"%nProgramador 1 trabaja en: %s"+
				"%nAnalista 1 trabaja en: %s%n",
				programador1.getNombreEmpresa(),
				analista1.getNombreEmpresa()
				);
		
		System.out.println(programador1);
		
		Informatico informatico = new Programador("Meecretefe","Jevi");
		System.out.println(informatico+" con sueldo "+informatico.pagarSueldo(140));
	}
}
