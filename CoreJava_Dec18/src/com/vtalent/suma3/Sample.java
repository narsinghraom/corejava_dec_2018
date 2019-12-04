package com.vtalent.suma3;

class Sample {
	int a,b;
	static int c;
	public static void main( String[] args)
	{
		c=10;
		Sample s1 = new Sample ();
		s1.funtion(c);
		System.out.println(s1.a+s1.b+c);
	}
	public void funtion(int c) {
		a=c;
		b=c+5;
	}

}
