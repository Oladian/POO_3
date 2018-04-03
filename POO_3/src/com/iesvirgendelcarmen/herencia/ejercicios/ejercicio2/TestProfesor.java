package com.iesvirgendelcarmen.herencia.ejercicios.ejercicio2;

import java.time.LocalDate;
import java.util.List;

public class TestProfesor {

	
	public static void main(String[] args) {

		ListaProfesores claustro = new ListaProfesores();
		Profesor prof1 = new ProfesorTitular("Paco", "998877445566", LocalDate.ofYearDay(1968, 25), "Mates", 126, 1900.5, LocalDate.of(1998, 9, 1));
		Profesor prof2 = new ProfesorTitular("Esteban", "123456789", LocalDate.ofYearDay(1989, 5), "Lengua", 126, 8000, LocalDate.of(1998, 9, 1));
		Profesor prof3 = new ProfesorTitular("Ana", "987654321", LocalDate.ofYearDay(1977, 12), "Fisica", 126, 1320.5, LocalDate.of(2013, 9, 1));
		Profesor prof4 = new ProfesorTitular("Emilio", "00110110101", LocalDate.ofYearDay(1969, 13), "Informatica", 100, 640.2, LocalDate.of(1997, 9, 1));
		Profesor prof5 = new ProfesorInterino("Pepe", "112233445566778899",LocalDate.ofYearDay(1992, 16), "Gimnasia", 0, LocalDate.now());
		Profesor prof6 = new ProfesorInterino("Julio", "22065482",LocalDate.ofYearDay(1977, 11), "Plastica", 0, LocalDate.now());
		Profesor prof7 = new ProfesorInterino("Luisa", "6698787897",LocalDate.ofYearDay(1992, 9), "Quimica", 0, LocalDate.now());
		
		claustro.añadirProfesor(prof1);
		claustro.añadirProfesor(prof2);
		claustro.añadirProfesor(prof3);
		claustro.añadirProfesor(prof4);
		claustro.añadirProfesor(prof5);
		claustro.añadirProfesor(prof6);
		claustro.añadirProfesor(prof7);
		
//		System.out.println(claustro.getLista()+"\n");

		List<Profesor> lista = claustro.getLista(); 
		for (Profesor profesor : lista) {
			System.out.println(profesor);
			if(profesor instanceof ProfesorTitular)
				System.out.println(((ProfesorTitular) profesor).getFechaIncorporacion());
			else if (profesor instanceof ProfesorInterino)
				System.out.println(((ProfesorInterino) profesor).getFinDeContrato());
		}
	}
}
