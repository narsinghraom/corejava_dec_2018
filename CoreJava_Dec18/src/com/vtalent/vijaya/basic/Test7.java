package com.vtalent.vijaya.basic;

class First0 {

	int i,j;
	public void function(int i)
	{
		this.i=this.i+i;
		j=i*i;
	}

}
class Second0 extends First0 {

	int i;
	public void function(int i,int j)
	{
		this.i=i+j;
		this.j=i+j+this.j;
	}
}

public class Test7{
	public static void main(String[] args) {
		First0 f = new First0();
		f.function(5);
		System.out.println(f.i);
		System.out.println(f.j);
		Second0 s = new Second0();
		s.function(3);
		s.function(f.i, f.j);
		System.out.println(s.i);
		System.out.println(s.j);

	}
}
