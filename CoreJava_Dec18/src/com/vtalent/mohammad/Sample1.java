package com.vtalent.mohammad;

public class Sample1 {
	int a,b;
	static int c;
	public void function(int c)
	{
		a=c;
		b=c+5;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c=10;
		Sample1 sam=new Sample1();
		sam.function(c);
		System.out.println(sam.a+sam.b+c);
	}

}
