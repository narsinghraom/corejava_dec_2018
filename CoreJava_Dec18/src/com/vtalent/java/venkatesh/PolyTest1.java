package com.vtalent.java.venkatesh;

class Poly1 {
	double a, b;
	static int x, y;

	public int function(double a) {
		this.a = this.a + a;
		b = b + a;
		return (int) (a);
	}

	public double function(int x, int y, int z) {
		Poly1.x = Poly1.x + x;
		Poly1.y = Poly1.y + y;
		return (double) (x + y + z);
	}
}

class Poly2 extends Poly1 {
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

class Poly3 extends Poly2 {
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

class PolyTest1 {
	public static void main(String[] args) {
		 Poly1 p1=new Poly2(); 
		 int k=p1.function(2.0);
		/* k=p1.function((double)k,(double)k); */ 
		 double d1=p1.function(k,k,k);
		 System.out.println(d1); 
		 System.out.println(k); 
		 System.out.println(p1.a);
		 System.out.println(p1.b);
	}
}
