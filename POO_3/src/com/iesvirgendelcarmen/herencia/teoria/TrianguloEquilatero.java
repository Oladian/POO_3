package com.iesvirgendelcarmen.herencia.teoria;

public class TrianguloEquilatero extends Triangulo {
	private float longitud;

	public TrianguloEquilatero(float longitud) {
		super(TipoTriangulo.EQUILATERO, longitud, longitud, longitud);
		this.longitud = longitud;
	}

	public float getLongitud() {
		return longitud;
	}
	
	public float getArea() {
		return (float)(Math.sqrt(3)/4)*(longitud*longitud);
	}

	@Override
	public String toString() {
		return super.toString()+"\n"+"TrianguloEquilatero longitud: " + longitud;
	}
	
	
}
