package com.vtalent.corejava.alekya;


public class Sample {
	int x,y,k;
	static float f1;
	public void function(){
		x=10;
		y=5;
		k=x-y;
		f1=1.5f;		
	}
	
	public static void demo(){
		System.out.println("hw r u");
	}

	public static void main(String[] args){
		demo();
		Sample sample=new Sample();
		sample.function();
		
		System.out.println(sample.k);
		System.out.println(sample.x+sample.y);
		System.out.print(f1);
		
	}
} 
	

