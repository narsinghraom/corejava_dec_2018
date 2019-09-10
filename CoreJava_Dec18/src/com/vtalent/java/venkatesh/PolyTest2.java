package com.vtalent.java.venkatesh;

class PolyOne1 {
	double a, b;
	static int x, y;

	public int function(double a) {
		this.a = this.a + a;
		b = b + a;
		return (int) (a);
	}

	public double function(int x, int y, int z) {
		PolyOne1.x = PolyOne1.x + x;
		PolyOne1.y = PolyOne1.y + y;
		return (double) (x + y + z);
	}
}

class PolyTwo1 extends PolyOne1 {
	double a;

	public int function(double a) {
		super.function(a);
		this.a = this.a + a;
		b = b + a;
		return (int) (a + b);
	}

	public int function(double a, double b) {
		this.a = this.a + a;
		this.b = this.b + b;
		return (int) (a + b);
	}
}

class PolyThree1 extends PolyTwo1 {
	double c;
    public int function(double c) {
    	this.a = this.a + c;
		b = b + c;
		return (int) (c);
	}

	public int function(double a, double b, double c) {
		this.a = this.a + a;
		this.b = this.b + b;
		this.c = b + c;
		return (int) (a + b + c);
	}
}

public class PolyTest2 {
	public static void main(String[] args) {
		  PolyOne1 p2=new PolyThree1();
		  int q = p2.function(3.0); 
		 q = p2.function((double)q); 
		  double d2 = p2.function(q, q, q); 
		  System.out.println(d2);
		  System.out.println(q); 
		  System.out.println(p2.a); 
		  System.out.println(p2.b);
}
}