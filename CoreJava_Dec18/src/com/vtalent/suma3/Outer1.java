package com.vtalent.suma3;

public class Outer1 {
	private static int k;
	public void function (int k) {
		this.k=this.k+k;
	}
	static class Inner
	{
		int i;
		public void function()
		{
			System.out.println(i+k);
			System.out.println(" This Static Inner Class");
		}
	}
	public static void main(String[] args)
	{
		Outer1 o2=new Outer1();
		o2.k=2;
		o2.function(3);
		Outer1.Inner i2=new Outer1.Inner();
		i2.i=2;
		i2.function();
	}

}
