package com.vtalent.corejava.avinash;

public class Sample {
	int x,y;
	static float f1;
	static float b2;
	static float k;
protected void function() {
		x=5;
		y=10;
		f1=1.5f;
	}
	public static void main(String[]args) {
		
		Sample Sample=new Sample();
		Sample.function();
		System.out.println(Sample.x+Sample.y);
		System.out.println(f1);
		System.out.println(Sample.b2);
		System.out.println(Sample.k);
		System.out.println(Sample);
	}
}
