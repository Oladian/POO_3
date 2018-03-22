package com.iesvirgendelcarmen.herencia.teoria.figurasGeometricas;

public class TrianguloRectangulo extends Triangulo {
	private float cateto1;
	private float cateto2;
	
	public TrianguloRectangulo(float cateto1, float cateto2) {
		super(TipoTriangulo.RECTANGULO, cateto1, cateto2, calcularHipotenusa(cateto2, cateto2));
		this.cateto1 = cateto1;
		this.cateto2 = cateto2;
	}
	
	public float getCateto1() {
		return cateto1;
	}

	public float getCateto2() {
		return cateto2;
	}

	public static float calcularHipotenusa(float cateto1, float cateto2) {
		return (float)Math.sqrt((Math.pow(cateto1, 2)+Math.pow(cateto2, 2)));
	}
	
	public float calcularArea() {
		return(cateto1*cateto2)/2.0f;
	}

	@Override
	public String toString() {
		return super.toString()+"\n"+"TrianguloRectangulo: cateto1= " + cateto1 + ", cateto2= " + cateto2;
	}
	
	
}
