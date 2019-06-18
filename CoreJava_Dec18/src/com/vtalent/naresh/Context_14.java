package com.vtalent.naresh;

class A{
	private float f;
		private A() {
			f=2.5f;
		}
		
		public static A funtion() {
			A a1=new A();
			return a1;
		}
		
		public float getV() {
			return f;
		}
}


public class Context_14 {
	A a;
	public A funtion1() {
	A.funtion();
	
	return a;
	}
}
