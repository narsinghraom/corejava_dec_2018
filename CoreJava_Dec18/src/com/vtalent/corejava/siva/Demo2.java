package com.vtalent.corejava.siva;

public class Demo2 {
	int x,y;
	static float f1,f2;
	public void function(int x,int y) {
		this.x=x+y;
		this.y=x*y;
	}
		public static float  function(float f1) {
			Demo2.f1=f1+f2;
			return f1;
		}
		public static void main(String args[]) {
			Demo2 d1=new Demo2();
			d1.function(2,3);
			f2=function(1.5f);
			System.out.println(d1.x+d1.y);
			System.out.println(f1+f2);
		}

}
