package com.iesvirgendelcarmen.herencia.teoria;

public class Test1 {
	public static void main(String[] args) {
		A1 a = new A1();
		a.p(10);
		a.p(10.0);
		a.p(8);
	}
}

class B1 {
	public void p(double i) {
		System.out.println(i * 2);
	}
}

class A1 extends B1 {
	public void p(double i ) {
		System.out.println(i);
	}
}
