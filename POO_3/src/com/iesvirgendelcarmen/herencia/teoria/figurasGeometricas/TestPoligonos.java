package com.iesvirgendelcarmen.herencia.teoria.figurasGeometricas;

public class TestPoligonos {

	public static void main(String[] args) {
		final TrianguloEquilatero triangulo1 = new TrianguloEquilatero(5.87f);
		System.out.println(triangulo1);
		System.out.printf("Area: %.2f - Perimetro: %.2f%n",
				triangulo1.getArea(),triangulo1.getPerimetro());

		TrianguloRectangulo triangulo2 = new TrianguloRectangulo(17.3f, 44.5093f);
		System.out.printf("%n%s",triangulo2);
		System.out.printf("Area: %.2f - Perimetro: %.2f%n",
				triangulo2.calcularArea(),triangulo2.getPerimetro());
		
		
		CuadrilateroRectangulo cuadrilatero1 = new CuadrilateroRectangulo(7.83f, 9.02f);
		System.out.printf("%n%s",cuadrilatero1);
		System.out.printf("Area del cuadrilatero: %.2f%nPerimetro: %.2f",
				cuadrilatero1.getArea(),cuadrilatero1.getPerimetro());
		
		//TrianguloEquilatero triangulo3 = new TrianguloEquilatero(44);
		//triangulo1=triangulo3; //Dará error porque triangulo1 es constante
	}

}
