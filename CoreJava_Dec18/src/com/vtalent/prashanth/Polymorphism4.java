package com.vtalent.prashanth;

class One1{
	double a;
	public int function(double a) {
		this.a = this.a + a;
		return (int)a;
	}
}
class Two1 extends One1{
	int x,y;
	public int function (int x,int y) {
		this.x = this.x + x;
		this.y = this.y + y;
		return (x + y);
	}
}
class Three1 extends Two1{
	int y;
	public int function(int x,int y) {
		/*
		 * this.x = this.x + super.function(x, y);
		 * o/p:- 24,18,4.0,72,48.0,72,72.0
		 * Because it will takes first this.x value
		 * and then only super.function(x,y) Executes.
		 */
		this.x = super.function(x, y) + this.x;
		this.y = x + this.y + y;
		return this.x + this.y;
	}
	public int function(double a) 
	{
		int k = super.function(a);
		this.a = (double)k + a;
		return k + (int)this.a;
	}
}

public class Polymorphism4 {

	public static void main(String[] args) {
		Two1 t1 = new Three1();
		int k = t1.function(2.0);
		k = t1.function(k, k);
		System.out.println(k);
		System.out.println(t1.x + t1.y);
		System.out.println(t1.a);
		
		One1 o1 = new Three1();
		k = o1.function((double)k);
		System.out.println(k);
		System.out.println(o1.a);
		
		One1 o2 = new Two1();
		k = o2.function((double)k);
		System.out.println(k);
		System.out.println(o2.a);

	}

}
