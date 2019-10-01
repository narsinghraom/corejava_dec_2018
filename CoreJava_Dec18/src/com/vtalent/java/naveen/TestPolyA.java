package com.vtalent.java.naveen;

  class Single {
	double a;
   int $_123=100;
	public int function(double a) {
		this.a = this.a + a;//2.0
		return (int) a;//2
	}
}

class Double extends Single {
	int x, y;

	public int function(int x, int y) {
		this.x = this.x + x;//6
		this.y = this.y + y;//6
		return x + y;//12
	}
}

class Third3 extends Double {
	int y;

	public int function(int x, int y) {
		this.x = this.x + super.function(x, y);//
		this.y = x + this.y + y;//
		return this.x + this.y;//
	}

	public int function(double a) {
		int k = super.function(a);
		this.a = (double) k + a;//4.0
		return   k+ (int) this.a;//6
	}
}

public class TestPolyA {

	public static void main(String[] args) {
		Double d = new Third3();
		int k = d.function(2.0);
		k = d.function(k, k);
		System.out.println(k);
		System.out.println(d.x + d.y);
		System.out.println(d.a);
		System.out.println(d.y);
		Single s=new Third3();
		int la=s.function(k);
		System.out.println(la);
	System.out.println(s.a);	
	Single s1=new Double();
	s1.function(k);
		
	

	}

}
