package com.vtalent.corejava.suma;

public class Suma {
	int i;
	int j;
	static float f1;
	
	static  {
		System.out.println("Hi");
	}
	
	public void function(){
		
		alekya();
		sample();
		i=10;
		j=20;
		f1=2.5f;			
	}
	public void sample(){
		System.out.println("suma");
		
	}
	public void alekya(){
		
		System.out.println("alekya");		

	}
	
	public static void fun(){
		System.out.println("World");
	}
	public void alekya1(){
	System.out.println("assah");	
	}
	
 public static void main(String[] args) {
fun();
	Suma sum = new Suma();
	sum.function();
	System.out.println(sum.i);
	System.out.println(sum.j);
	System.out.println(sum.i+sum.j);
	System.out.println(f1);
	System.out.println(sum);
	
	Suma sum2 = new Suma();
	sum2.alekya1();
	
}
 
 
}
