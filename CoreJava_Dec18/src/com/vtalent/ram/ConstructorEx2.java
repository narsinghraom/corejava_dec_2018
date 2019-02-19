package com.vtalent.ram;

public class ConstructorEx2 {
	int x,y;
	ConstructorEx2(){
		x=5;
		y=7;
		
	}
ConstructorEx2(int x){
	this(x,x+1);
	this.x=this.x+x;
	y=y+x;
}
ConstructorEx2(int x,int y)
{
	this();
	this.x=this.x+x;
	this.y=this.y+y;
	
}
public void function(){
	System.out.println(x+y);
}
public static void main(String[] args) {
	//ConstructorEx2 c1=new ConstructorEx2();
	ConstructorEx2 c2=new ConstructorEx2(5);
	//ConstructorEx2 c3=new ConstructorEx2(2,5);
	//c1.function();
	c2.function();
	//c3.function();
	//System.out.println(c1);
	System.out.println(c2);
	//System.out.println(c3);
}
}
