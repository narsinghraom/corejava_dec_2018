package com.vtalent.java.venkatesh;

class PolyOne4 {
	double a, b;
	static int x, y;

	public int function(double a) {
		this.a = this.a + a;
		b = b + a;
		return (int) (a);
	}

	public double function(int x, int y, int z) {
		PolyOne4.x = PolyOne4.x + x;
		PolyOne4.y = PolyOne4.y + y;
		return (double) (x + y + z);
	}
}

class PolyTwo4 extends PolyOne4 {
	double a;

	public int function(double a) {
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

class PolyThree4 extends PolyTwo4 {
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
public class PolyTest5 {
public static void main(String[] args) {
	PolyTwo4 p5=new PolyTwo4(); 
	  int r=p5.function(2.0); 
	  r=p5.function((double)r,(double)r);
	  double d5=p5.function(r,r,r);
	  System.out.println(r);
	  System.out.println(d5);
	  System.out.println(p5.a);
	  System.out.println(p5.b);
}
}
