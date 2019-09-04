package com.vtalent.java.venkatesh;
class One1{
	int x,y;
	public int function(int x,int y) {
		this.x=this.x+x;
		this.y=this.y+y;
		return x+y;
	}
}
class Two1 extends One1{
	int x,y;
	public int function(int x) {
		this.x=this.x+x;
		super.x=super.x+x;
		return super.x+x;
	}}
class Three1 extends Two1{
	float f1;
	int y;
	public float functionone(int y,float f1) {
		super.y=super.y+y;
		this.y=this.y+super.y;
		this.f1=this.f1+f1;
		return f1;
	}
}
class Test3 {
public static void main(String[] args) {
	Three1 t1=new Three1();
	int k=t1.function(t1.function(2,3));
	float f1=t1.functionone(k,t1.y);
	System.out.println(k);
	System.out.println(f1);
	Two1 t2=new Two1();
	t2.function(5);
	System.out.println(t2.x);
	One1 t3=new One1();
	t3.function(4, 5);
	System.out.println(t3.x);
	System.out.println(t3.y);
	System.out.println(t3.x+t3.y);
	
}
}
