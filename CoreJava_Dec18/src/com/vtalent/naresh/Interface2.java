package com.vtalent.naresh;

interface Abc2{
	public static final float pi=3.14f;
	public void f(int x);
	public abstract void f(int x, int y); 
}

interface Xyz{
	public void f();
	public void f(int x);
}

interface Mnr extends Abc2,Xyz{
	
}

class Abc2imp implements Abc2{
	int x,y;
	public void f(int x) {
		this.x=this.x+x+(int)pi;
	}
	public void f(int x, int y) {
	this.x=this.x+x;
	this.y=this.y+y;
	}
}

class Mnrimp extends Abc2imp implements Mnr{
	public void f() {
		System.out.println(x+y); //10
	}
}


public class Interface2 {
	public static void main(String[] args) {
		Abc2 a=new Mnrimp();
			a.f(2);
			a.f(2,3);
			//a.f(); CT cz Abc2 Doesn't have method f(){}
			//System.out.println(a.pi);
			
			Mnr m=new Mnrimp(); 
			m.f(2);
			m.f(2,3);
			m.f();
			
			Xyz x=new Mnrimp();
				x.f(5);
				x.f();	//8
			//x.f(2,3); CT 
			
	}

}
