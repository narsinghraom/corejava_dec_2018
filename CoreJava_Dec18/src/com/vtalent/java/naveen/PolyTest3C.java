package com.vtalent.java.naveen;

class PolymorOne {
	double a, b;
	static int x, y;

	public int function(double a) {
		this.a = this.a + a;
		b += a;
		return (int) (a + b);
	}

	public double function(int x, int y) {
		PolyOne.x = PolyOne.x + x;
		PolyOne.y = PolyOne.y + y;
		return (double) (x + y);
	}
}

class PolymorTwo extends PolymorOne {
	double a;

	public int function(double a) {// 3.0
		this.a = this.a + a;// 3.0
		b += a;// 3.0
		return (int) (a + b);// 6
	}

	public int function(double a, double b) {// 2.0,3.0
		this.a = this.a + a;// 5.0
		this.b = this.b + b;// 6.0
		return (int) (a + b);// 5
	}
}

class PolymorThree extends PolymorTwo {

	public double function(int x, int y) {// 6,5
		PolyOne.x = PolyOne.x + x;// 6
		PolyOne.y = PolyOne.y + y;// 5
		return (double) (x + y);// 11.0

	}
}

public class PolyTest3C {
	public static void main(String[] args) {
		System.out.println("                                                  obj1");
		PolymorThree p1 = new PolymorThree();
		int i = p1.function(3.0);// 6
		int s = p1.function(2.0, 3.0);// 5
		double d = p1.function(i, s);// 11.0
		System.out.println(i + " " + s + " " + d);
		System.out.println("                                                   obj2");

		PolymorTwo p2 = new PolymorThree();
		int c = p2.function(3.0);
		int sa = p2.function((double) c, (double) c);
		double d1 = p2.function(sa, c);
		System.out.println(c + "  " + sa + "  " + d1);
		System.out.println("                                                   obj3");
		PolymorOne p3 = new PolymorThree();
		int n = p3.function(i);
		double d2 = p3.function(4, 5);
		System.out.println(n + "  " + d2);
		System.out.println("                                                       obj4");
		PolymorOne p4=new 	PolymorTwo();
		c=p4.function(sa);
		sa=(int)p4.function(c, n);
		System.out.println(c);
		System.out.println(sa);
	}

}
