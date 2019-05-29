package com.vtalent.naresh;


interface Example{
	public int f(float y);
	public float f(int x, int y);
}

interface Xyz1{
	public void f();
}

class Exampleimp implements Example{
	int y; float f1;
	public int f(float f1) {
		this.f1=this.f1+f1;
		return (int)(this.f1);
	}
	
	public float f(int x, int y) {
		this.y=this.y+y;
		f1=f1+x;
		return x+y;
	
	}
}

class Example2 extends Exampleimp implements Xyz1{
	int x=0; 
	//int x=2;
	
	public float f(int x, int y) {
		//super.f(x,y);
		this.x=this.x+x;
		this.y=this.y+y;
		return this.x+this.y;
	}
	
	public void f() {
		System.out.println(x+y);
	}
}

public class Interface3 {
	public static void main(String[] args) {
		
		Exampleimp e=new Exampleimp();
		//	int k=e.f(f(2,3)); // cannot call a non static method directly 
			int k=e.f(e.f(2,3));
			System.out.println(k);
		//	System.out.println(e.x+e.y); CT cx variable x is not present in Exampleimp class
	
			Exampleimp e2=new Example2();
				float m=e.f(e2.f(2.0f), e2.f(3.0f));
				System.out.println(m);
	
	}

}
