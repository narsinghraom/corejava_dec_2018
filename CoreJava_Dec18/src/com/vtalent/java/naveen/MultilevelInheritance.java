package com.vtalent.java.naveen;
class one{
	int  x,y;
	public int  function(int x,int y) {
		this.x=this.x+x;
		this.y=this.y+y;
		return x+y;	
	}
}
class Two extends one{
	int x;
	public int function(int x) {
		this.x=this.x+x;
		super.x=super.x+x;
		return super.x+x;
	}
}
class Three extends Two{
	int y;
	float f1;
	public float functionone(int y,float f1) {
	super.y=super.y+y;
	this.y=this.y+super.y;
	this.f1=this.f1+f1;
		return f1;
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		Three t1= new Three();
		int k = t1.function(t1.function(2, 3));//(5)// k=12
		float f1 = t1.functionone(k, t1.y);//
		System.out.println(k);//12
		System.out.println(f1);//0.0

	}
}
