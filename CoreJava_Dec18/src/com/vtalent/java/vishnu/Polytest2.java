package com.vtalent.java.vishnu;

class One1 {
	double a;

	public int function(double a) {
		this.a = this.a + a;
		return (int) a;

	}
}

class Two2 extends One1 {
	int x, y;

	public int function(int x, int y) {
		this.x = this.x + x;
		this.y = this.y + y;
		return x + y;

	}
}

class Three3 extends Two2 {
	int y;

	public int function(int x, int y) {
		this.x = this.x + super.function(x, y);
		this.y = x + this.y + y;
		return this.x + this.y;

	}

	public int function(double a) {
		int k = super.function(a);
		this.a = (double) k + a;
		return k + (int) this.a;

	}
}

public class Polytest2 {
	public static void main(String[] args) {
		Two2 t1 = new Three3();
		int k = t1.function(2.0);
		k = t1.function(k, k);
		System.out.println("k value" + k);
		System.out.println(t1.x + t1.y);
		System.out.println(t1.a);
		// given task as follows
		/*
		 * One1 ol=new Three3(); k=ol.function((double)4);
		 * //k=ol.function(k,k);error System.out.println("k value:"+k);
		 * //System.out.println(ol.x+ol.y);error System.out.println(ol.a); One1
		 * o2=new Two2(); k=o2.function((double)k); k=o2.function(k);
		 * //System.out.println(o2.x+o2.y);error System.out.println(o2.a);
		 */

	}

}
