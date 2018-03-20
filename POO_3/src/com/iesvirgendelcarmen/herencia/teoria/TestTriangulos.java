package com.iesvirgendelcarmen.herencia.teoria;

public class TestTriangulos {

	public static void main(String[] args) {
		TrianguloEquilatero triangulo1 = new TrianguloEquilatero(5.87f);
		System.out.println(triangulo1.toString());
		
		System.out.printf("Area: %.2f - Perimetro: %.2f%n",
				triangulo1.getArea(),triangulo1.getPerimetro());
	}

}
