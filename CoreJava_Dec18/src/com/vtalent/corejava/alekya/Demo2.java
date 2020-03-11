package com.vtalent.corejava.alekya;

public class Demo2 {
	int x,y;
	static float f1,f2;
	public int function(int x,int y) {
		x=x+y;
		y=x*y;
		
		return(x+y);
		
	}
		public static void function(float f1) {
			f1=f1+f2;
			f2=f1+f1;
			System.out.println(f2);
			System.out.println(f1);
			
		}
		public static void main(String args[]) {
			Demo2 d1=new Demo2();
			d1.function(2,3);
			function(2.5f);
			System.out.println(d1.x+d1.y);
			System.out.println(f1+f2);
			
		}
		}
	



