package com.vtalent.java.karthik;

public class Sample {
	
		int x,y;//non static variables
		static float f ;//static variable
		
		public void function(){
		x=10;
		y=20;
		f=1.20f;
		}
		public static void karthik(){
			System.out.println("Hi i am Karthik");
		}
		public static void main(String[]args)//main method
		{
			karthik();
		Sample sample=new Sample();//creating object with class name with new keyword.	
		sample.function();
		
	System.out.println(sample.x+sample.y);
	System.out.println(f);
	//System.out.println(sample.f);
	System.out.println(sample);
	
		}
}
