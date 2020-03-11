package com.vtalent.corejava.alekya;

public class ThisExample {
	
		int a,b; 
		public ThisExample() { 
		 System.out.println("Default");
		 } 
		public ThisExample(int a) { 
			 this(a,4); 
			 this.a = a; 
			 System.out.println("hi");
			 } 
			public ThisExample(int a, int b) { 
			 this();
			 this.a = a; 
			 this.b = b; 
			 System.out.println(this.a);
			 System.out.println(this.b);
			 System.out.println(a);
			 System.out.println(b);
			 
			 } 
	
	public static void main(String[] args) { 
	 ThisExample example=new ThisExample(5); 
	 } 
	}