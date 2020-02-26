package com.vtalent.corejava.krishnavardhan;

public class Sample {
	int x=20,y=20;//non static variables
	static float f=1.5f;//static variables
	public void run(){//non static method
	System.out.println("hi");}
	static void speed(){//staticmethod
		System.out.println("hello");
		
	}
	public static void main (String[]args){//main method
	Sample vd = new Sample();//object created using class name
	System.out.println(f);//static variables we can call directly
	System.out.println(vd.x + vd.y);//non static variables we have to call using ubj.reference
	vd.run();
	speed();
	}}