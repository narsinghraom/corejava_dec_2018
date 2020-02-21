package com.vtalent.corejava.avinash;

public class sample2 {
	int x,y;
	static float f1;
	public void function() {
		x=5;
		y=10;
		f1=1.5f;
	}
	public static void main(String[]args) {
		sample2 sample=new sample2();
		sample.function();
		System.out.println(sample.x+sample.y);
		System.out.println(f1);
		System.out.println(sample);
		}
}
