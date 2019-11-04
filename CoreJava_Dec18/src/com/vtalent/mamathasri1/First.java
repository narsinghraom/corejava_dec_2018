package com.vtalent.mamathasri1;

import com.vtalent.rakesh.Second;

public class First {
	int x, y;

	public int function(int x) {
		this.x = this.x + x;
		y = y + x;
		return x;
	}
}

class Second1 extends First {
	int y;

	public int function(int y) {
		this.y = this.y + y;
		x = x + y;
		return y;
	}

	public int function(int x, int y) {
		this.x = this.x + x;
		this.y = this.y + y;
		return x + y;

	}
}

class Third extends Second1 {
	int x;

	public int function(int x, int y) {
		this.x = this.x + x;
		this.y = this.y + y;
		return x + y;
	}

}

class test {
	public static void main(String args[]) {
		Third t1=new Third();
		int k=t1.function(5);
		k=t1.function(k,k);
		System.out.println(k);
		System.out.println(t1.x+t1.y);
		Second1 s1=new Third();
		k=s1.function(k);
		k=s1.function(k,k);
		System.out.println(k);
		System.out.println(s1.x+s1.y);
		First f1=new Third();
		k=f1.function(k);
		//k=f1.function(k,k);
		System.out.println(k);
		System.out.println(f1.x+f1.y);
		First f2=new Second1();
		k=f2.function(k);
		System.out.println(k);
		System.out.println(f1.x+f1.y);
		First f3=new First();
		k=f3.function(k);
		System.out.println(k);
		System.out.println(f1.x+f1.y);
		Second1 s2=new Second1();
		k=s2.function(k);
		k=s2.function(k,k);
		System.out.println(k);
		System.out.println(s2.x+s2.y);
		
	}
}