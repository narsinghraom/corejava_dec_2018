package com.vtalent.java.venkatesh;

class PolyOne3 {
	double a, b;
	static int x, y;

	public int function(double a) {
		this.a = this.a + a;
		b = b + a;
		return (int) (a);
	}

	public double function(int x, int y) {
		PolyOne3.x = PolyOne3.x + x;
		PolyOne3.y = PolyOne3.y + y;
		return (double) (x + y);
	}
}

class PolyTwo3 extends PolyOne3 {
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

class PolyThree3 extends PolyTwo3 {
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
public class PolyTest4 {
public static void main(String[] args) {
	PolyThree3 p4=new PolyThree3(); 
	  int r=p4.function(2.0); 
	  double d4=p4.function(r,r,r);
	  System.out.println(r);
	  System.out.println(d4);
	  System.out.println(p4.a);
	  System.out.println(p4.b);
}
}
