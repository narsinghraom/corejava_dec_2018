package com.vtalent.shiva;

public class TestDemo1 {
	int x,y;
	static float f1,f2;
	public void function(int x,int y) {
		x=x+y;
		y=x*y;
	}
	  public static float function(float f1) {
	  return f1=f1+f2;
	  }
	  public static void main(String[] args) {
		TestDemo1 s1=new TestDemo1();
		s1.function(2, 3);
		function(1.5f);
		
		System.out.println(s1.x+s1.y);
		System.out.println(f1+f2);
	}
			 
	}
	


