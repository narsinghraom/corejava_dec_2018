package com.vtalent.raju;

 class Outer {

	int a;
	public void show() {
		System.out.println("outer method is non static ");
		
	}
	static class Inner{
		public void display() {
			System.out.println("inner method of static class");
		}
	}

}
 class  InnerDemo{
	public static void main(String[] args) {
		Outer obj=new Outer();
		obj.show();
		Outer.Inner obj1=new Outer.Inner();
		obj1.display();
		
				
	}
}

