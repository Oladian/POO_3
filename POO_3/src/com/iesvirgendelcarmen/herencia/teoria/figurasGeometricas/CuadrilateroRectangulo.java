package com.iesvirgendelcarmen.herencia.teoria.figurasGeometricas;

public class CuadrilateroRectangulo extends Cuadrilatero {
	private float lado1;
	private float lado2;

	public CuadrilateroRectangulo(float lado1, float lado2) {
		super(TipoCuadrilatero.RECTANGULO, lado1, lado2, lado1, lado2);
		this.lado1 = lado1;
		this.lado2 = lado2;
		
	}
	


	public float getArea() {
		return lado1*lado2;
	}

	public float getLado1() {
		return lado1;
	}

	public float getLado2() {
		return lado2;
	}

	@Override
	public String toString() {
		return super.toString()+"\n"+"CuadrilateroRectangulo lado 1 = " + lado1 + ", lado 2 = " + lado2 + "]";
	}
	
}
