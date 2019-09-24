package com.vtalent.prashanth;

class First {
	
	int i,j;
	public void function(int i) {
		this.i=this.i+i;
		j=i*i;
	}
}

class Second1 extends First {
	
	int i;
	public void function(int i,int j) {
		this.i=i+j;
		this.j=i+j+this.j;
	}
}

public class Test1 {
	
	public static void main(String[] args) {
		First f = new First();
		f.function(5);
		System.out.println(f.i);
		System.out.println(f.j);
		Second1 s = new Second1();
		s.function(3);
		s.function(f.i, f.j);
		System.out.println(s.i);
		System.out.println(s.j);

	}
}
