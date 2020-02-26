package com.vtalent.corejava.naveenm;

public class Sample {
	static int x=2,y=5;
	static float f;
	public void function(){
		x=5;
		y=11;
		f=2.5f;
	}
	public static void main(String[] args) {
		Sample sample =new Sample();
		sample.function();
		System.out.println(sample.x+sample.y);
		System.out.println(f);
		System.err.println(sample);
	}

}
