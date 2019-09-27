package com.vtalent.swamy;

class ione {
	double a;

	public int function(double a) {
		this.a = this.a + a;// 2.0
		return (int) a;// 2
	}
}

class itwo extends ione {
	int x, y;

	public int function(int x, int y) {
		this.x = this.x + x;// 6
	y = this.y + y;// 6
		return x + y;// 12
	}
}

class ithree extends itwo {
	int y;

	public int function(int x, int y) {
		this.x = this.x + super.function(x, y);// 18
		this.y = x + this.y + y;// 12
		return this.x + this.y;//
	}

	public int function(double a) {
		int k = super.function(a);//
		this.a = (double) k + a;// 4.0
		return k + (int) this.a;// 6
	}
}

public class Inheritance2 {
	public static void main(String[] args) {
		itwo t = new ithree();
		int k = t.function(2.0);// 6
		k = t.function(k, k);// 30
		System.out.println(k);// 30
		System.out.println(t.x + t.y);// 24
		System.out.println(t.a);// 4.0

		ione o = new ithree();
		int r = o.function((double) k); // k=o.function(k,k);
		System.out.println(r); // System.out.println(o.x+o.y);
		System.out.println(o.a);
		ione o2 = new itwo();
		int r2 = o2.function((double) r); // k=o2.function(k,k); 
		System.out.println(r2);
		// System.out.println(o2.x+o2.y);
		System.out.println(o2.a);

	}

}
