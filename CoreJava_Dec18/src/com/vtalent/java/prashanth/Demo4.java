package com.vtalent.java.prashanth;

public class Demo4 {
	int x,y;
	static float f1,f2;//context area
	public void function(int x,int y) {
		x=x+y;
		y=x*y;
	}
	public static void function(float f1) {
		f1=f1+f2;
	}
	public static void main(String[] args) {
		
		Demo4 d=new Demo4();
		d.function(2, 3);//x=5,y=10
		function(1.5f);//f1=1.5f
		System.out.println(d.x+d.y);//5
		System.out.println(f1+f2);//1.5
	}

}
