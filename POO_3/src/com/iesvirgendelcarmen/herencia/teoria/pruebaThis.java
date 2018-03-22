package com.iesvirgendelcarmen.herencia.teoria;

public class pruebaThis {
	private String str;
	
	public pruebaThis() {
		this("Hola");
		System.out.println("adios");
	}

	public pruebaThis(String s) {
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		new pruebaThis();
	}
}
