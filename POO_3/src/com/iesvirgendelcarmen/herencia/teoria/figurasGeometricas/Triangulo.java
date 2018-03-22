package com.iesvirgendelcarmen.herencia.teoria;

public class Triangulo extends Poligono {
	
	private TipoTriangulo tipo;
	private float lado1;
	private float lado2;
	private float lado3;
	
	public Triangulo(TipoTriangulo tipo, float lado1, float lado2, float lado3) 
	{
		super(3, ((lado1==lado2)&&(lado2==lado3)), "Triangulo"); // daddy constructor
		this.tipo = tipo;
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	public TipoTriangulo getTipo() {
		return tipo;
	}

	public float getLado1() {
		return lado1;
	}

	public float getLado2() {
		return lado2;
	}

	public float getLado3() {
		return lado3;
	}
	
	public float getPerimetro() {
		return lado1+lado2+lado3; 	//Segun Manolo los getters no 
										//se diferencian tanto de los atributos en cuanto a rendimiento
	}

	@Override
	public String toString() {
		return super.toString()+"\n"+"Triangulo de tipo= " + tipo + ", lado 1= " + lado1 + ", lado 2= " + lado2 + ", lado 3= " + lado3;
	}
	
}
