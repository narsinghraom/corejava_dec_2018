package com.vtalent.corejava.aravind;

public class ExampleJava {

	int x;
	int y;
	static float f1;
	
	public void function() {
		x=10;
		y=20;
		f1= 1.2F;
		
	}
	public static void main(String[] args) {
		ExampleJava java = new ExampleJava();
		java.function ();
		System.out.println(java.x + java.y);
		System.out.println(f1);
		System.out.println(java);
		
	}
}
