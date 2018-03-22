package com.iesvirgendelcarmen.herencia.teoria.figurasGeometricas;

public final class TrianguloEquilatero extends Triangulo { //Solo la clase última en la jerarquía pueden ser finales
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
