package com.vtalent.java.venkatesh;

class PolyOne2 {
	double a, b;
	static int x, y;

	public int function(double a) {
		this.a = this.a + a;
		b = b + a;
		return (int) (a);
	}

	public double function(int x, int y, int z) {
		PolyOne2.x = PolyOne2.x + x;
		PolyOne2.y = PolyOne2.y + y;
		return (double) (x + y + z);
	}
}

class PolyTwo2 extends PolyOne2 {
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

class PolyThree2 extends PolyTwo2 {
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
public class PolyTest3 {
public static void main(String[] args) {
	PolyTwo2 p3=new PolyThree2(); 
	  int r=p3.function(2.0); 
	  double d3=p3.function(r,r,r);
	  System.out.println(r);
	  System.out.println(d3);
	  System.out.println(p3.a);
	  System.out.println(p3.b);
}
}