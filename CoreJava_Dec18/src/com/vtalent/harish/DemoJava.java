package com.vtalent.harish;

public class DemoJava {
	int a,b;
	public void function1(int a, int b)
	{
      this.a=a+b;
      
      this.b=a*b;
	}
	public static void main(String[] args) {
	
     DemoJava 	dj=new DemoJava();
     dj.function1(2,5);
     System.out.println(dj.a+dj.b);
	}
     
}
