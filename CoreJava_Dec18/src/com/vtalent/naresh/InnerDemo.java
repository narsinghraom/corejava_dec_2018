package com.vtalent.naresh;

class Outer{
	int a;
	public void show() {
		System.out.println("Outer Method of Non Static Class");
	}
	
	static  class Inner{
		public void display() {
			System.out.println("Inner Method of Static Class");
		}
	}
	
} 

public class InnerDemo {
	public static void main(String[] args) {
			Outer obj=new Outer();
				obj.show();
				
			//	Outer.Inner obj1=new Outer().new Inner(); for member class
				Outer.Inner obj1=new Outer. Inner();
						obj1.display();
						
	}

}


