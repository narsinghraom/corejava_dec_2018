package com.vtalent.suma3;

/* member class*/

public class Outer {
	private int k;
	public void function (int k)
	{
		this.k=this.k+k;
	}
	class Inner
	{
		int i;
		public void function()
		{
			System.out.println(i+k);
			System.out.println(" This is Inner class method");
		}
	}
public static void main( String[] args) {
	Outer o1=new Outer();
	o1.k=2;
	o1.function(3);
	Outer.Inner i1=o1.new Inner();
	i1.i=2;
	i1.function();
}
}
