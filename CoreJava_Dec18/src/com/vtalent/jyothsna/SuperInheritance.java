package com.vtalent.jyothsna;

class Onn{
	int x,y;
	public int function(int x,int y) {
	this.x=this.x+x;
	this.y=this.y+y;
	return x+y;
	}
}
class Tw extends Onn{
	int x;
	public int function(int x) {
	this.x=this.x+x;
	super.x=super.x+x;
	return super.x+x;
	}
}
class Thr extends Tw{
	float f1;
	int y;
	public float functionOne(int y,float f1) {
	super.y=super.y+y;
	this.y=this.y+super.y;
	this.f1=this.f1+f1;
	return f1;
	}
}
	

public class SuperInheritance {

	public static void main(String[] args) {
		Thr t1=new Thr();
		int k=t1.function(t1.function(2,3));
		float f1=t1.functionOne(k, t1.y);
		System.out.println(k);//12
		System.out.println(f1); //0.0
		System.out.println(t1.f1);//0.0
		System.out.println(t1.y);//15
		System.out.println(t1.x);//5
	}
}





