package com.iesvirgendelcarmen.herencia.teoria;

public class Uno extends Dos {
	public static void main (String[]args){
		new Uno ();
	}
	public Uno () {
		System.out.println ("Constructor de uno");
	}
}

class Dos extends Tres{
	public Dos (){
		this ("Llamando al constructor de Dos");
		System.out.println ("Constructor de Dos");
	}
	
	public Dos (String s){
		System.out.println (s);
	}
}

class Tres {
	public Tres (){
		System.out.println ("Constructor de Tres");
	}
}