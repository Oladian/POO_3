package com.iesvirgendelcarmen.herencia.teoria;

public class ProbarPersona {

	public static void main(String[] args) {
		Persona persona1 = new Persona("Paco", 23);
		Persona persona2 = new Persona("Paca", 25);
		
		/*
		 * 
		 * PROBANDO METODO EQUALS
		 * 
		 */
		
		System.out.println(persona1.equals(persona2)+" - Debe dar false -");
		Persona persona3 = persona1; //crea una referencia, no un objeto.
		
		System.out.println(persona1.equals(persona3)+" - Debe dar true -");
		persona2.setNombre("PACO");
		persona2.setEdad(23);
		System.out.println(persona1.equals(persona2)+" - Debe dar true -");
		
		System.out.println((persona1==persona3)+" - Debe dar true -"); //misma posicion de memoria
		System.out.println((persona1==persona2)+" - Debe dar false -"); //distintas posiciones de memoria
		
		/*
		 * 
		 * PROBANDO METODO CLONE
		 * 
		 */
		
		Persona persona4 = persona2;
		persona4.setEdad(33); //Modifica directamente el contenido referenciado, cambia la edad de persona 2
		System.out.println((persona4==persona2)+" - Debe dar true -");
		System.out.println(persona4.equals(persona2)+" - Debe dar true -"); 
		
		try {
			Persona persona5 = (Persona) persona2.clone();
			System.out.println((persona5==persona2)+" - Debe dar false -"); //Diferentes posiciones de memoria
			System.out.println(persona5.equals(persona2)+" - Debe dar true -"); //Mismo contenido del montículo
			persona5.setEdad(28); 
			System.out.println(persona5.equals(persona2)+" - Debe dar false -");	// al haber cambiado la edad, son objetos diferentes segun
															// el Override de equals().
			
		} catch (CloneNotSupportedException e) {
			System.out.println("exception");
		}
	}

}
