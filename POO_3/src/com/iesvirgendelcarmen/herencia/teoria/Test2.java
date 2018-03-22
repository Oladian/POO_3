package com.iesvirgendelcarmen.herencia.teoria;

public class Test2 {
	public static void main(String[] args) {
		A2 a = new A2();
		a.p(10);
		a.p(10.0);
		a.p(20);
		a.p(9);
	}
}

class B2 {
	public void p(double i) {
		System.out.println(i * 2);
	}
}

class A2 extends B2 {
	public void p(int i ) {
		System.out.println(i);
	}
}

