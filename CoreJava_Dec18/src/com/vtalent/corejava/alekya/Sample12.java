package com.vtalent.corejava.alekya;

public class Sample12 {
	int a,b; 
	
	public void function(int a,int b) { 
		  
		 this.a = a+this.b; 
		 this.b = this.a; 
		 a=this.a+this.b;
		b=a; 
		 System.out.println(this.a);
		 System.out.println(this.b);
		 System.out.println(a);
		 System.out.println(b);
		 
		 } 
	public void ThisExample(int a, int b) { 
		 this.a = a; 
		 this.b = b; 
		 System.out.println(this.a);
		 System.out.println(this.b);
		 System.out.println(a);
		 System.out.println(b);
		 } 

public static void main(String[] args) { 
 Sample12 abc = new Sample12();
 abc.ThisExample(5,6);
 abc.function(5,5);
 abc.ThisExample(10,10);
 
 } 
}

