package com.vtalent.saranyanc;

public class ConstructorEx {
	int x,y;
	ConstructorEx(){
		x=5;
		y=7;
		
	}
ConstructorEx(int x){
	this(x,x+1);
	this.x=this.x+x;
	y=x+y;
}
ConstructorEx(int x,int y){
	this();
	this.x=this.x+x;
	this.y=this.y+y;
}
public void function(){
	System.out.println(x+y);
	
}
public static void main(String[] args){
	//*ConstructorEx c1= new ConstructorEx();
	ConstructorEx c2= new ConstructorEx(5);
	//*ConstructorEx c3= new ConstructorEx (2,5);
	
	//*c1.function();
	c2.function();
	//*c3.function();
	
	
}
}
