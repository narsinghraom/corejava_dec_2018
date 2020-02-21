package com.vtalent.corejava.alekya;


public class Sample {
	int x,y,k;
	static float f1;
	public void function(){
		x=5;
		y=5;
		k=x+y;
		f1=1.5f;		
	}
	public void alekya(){
		System.out.println("Hi i am Alekya");
	}
	public static void demo(){
		System.out.println("hw r u");
	}

	public static void main(String[] args){
		demo();
		Sample sample=new Sample();
		sample.function();
		sample.alekya();
		System.out.println(sample.x+sample.y);
		System.out.print(f1);
		System.out.println(sample);
	}
}
	

