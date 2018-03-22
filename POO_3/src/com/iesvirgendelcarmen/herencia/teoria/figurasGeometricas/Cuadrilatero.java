package com.iesvirgendelcarmen.herencia.teoria.figurasGeometricas;

public class Cuadrilatero extends Poligono {
	
	private TipoCuadrilatero tipo;
	private float lado1;
	private float lado2;
	private float lado3;
	private float lado4;
	
	public Cuadrilatero(TipoCuadrilatero tipo,float lado1, float lado2, float lado3,
			float lado4) {
		super(4, ((lado1==lado2)&&
				(lado2==lado3)&&
				(lado3==lado4)), "Cuadrilatero");
		
		this.tipo=tipo;
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.lado4 = lado4;
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

	public float getLado4() {
		return lado4;
	}
		
	public float getPerimetro() {
		return lado1+lado2+lado3+lado4;
	}

	@Override
	public String toString() {
		return super.toString()+"\n"+"Cuadrilatero de tipo= " + tipo + ", lado 1= " + lado1 + 
				", lado 2= " + lado2 + ", lado 3= " + lado3 + ", lado 4= "
				+ lado4;
	}
		
		
}
