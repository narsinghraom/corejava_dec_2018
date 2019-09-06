package com.vtalent.java.srikarreddy;
  class Srd1 {

	int i,j;
	public void function(int i)
	{
		this.i=this.i+i;
		j=i*i;
	}

}
  class Example extends Srd1 {

	int i;
	public void function(int i,int j)
	{
		this.i=i+j;
		this.j=i+j+this.j;
	}
}

public class Test0 {

	public static void main(String[] args) {
		Srd1 f = new Srd1();
		f.function(5);
		System.out.println(f.i);
		System.out.println(f.j);
		Example s = new Example() ;
		s.function(3);
		s.function(f.i, f.j);
		System.out.println(s.i);
		System.out.println(s.j);

	}
}
