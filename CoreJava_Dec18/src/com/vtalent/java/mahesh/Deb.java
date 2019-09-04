package com.vtalent.java.mahesh;
public class Deb {
int x,y;
public int function(int x,int y){
	this.x=this.x+x;
	this.y=this.y+y;
	return x+y;
}
}
class two extends Deb{
int x;
public int function(int x){
	this.x=this.x+x;
	super.x=super.x+x;
	return super.x+x;
}
}
class three extends two{
	float f;
	int y;
	public float functionone(int y,float f){
		super.y=super.y+y;
		this.y=this.y+super.y;
		this.f=this.f+f;
		return f;
	}
}
class Test2{
	public static void main(String args[]){
	three t=new three();
	int k=t.function(t.function(2,3));
	float f=t.functionone(k,t.y);
	System.out.println(k);
	System.out.println(f);
	}
}
