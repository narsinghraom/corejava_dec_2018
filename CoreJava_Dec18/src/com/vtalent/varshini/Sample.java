package com.vtalent.varshini;

public class Sample {
	int x,y;
	static float f1;
	public void function() {
		x=5;
		y=x+5;
	}
	public static float function(int x) {
		f1=x+0.5f;
		return f1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample sample = new Sample();
		sample.function();
		f1=function(sample.y);
		System.out.println(sample.x + sample.y);
		System.out.println(f1);

	}

}
