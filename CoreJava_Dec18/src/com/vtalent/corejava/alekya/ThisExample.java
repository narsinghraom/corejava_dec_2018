package com.vtalent.corejava.alekya;

public class ThisExample {
	
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
		public static void main(String[] args) { 
	 ThisExample example=new ThisExample(); 
	 example.function(5,10);
	 } 
	}