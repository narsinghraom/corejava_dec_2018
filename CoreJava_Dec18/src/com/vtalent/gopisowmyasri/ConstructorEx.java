package com.vtalent.gopisowmyasri;

public class ConstructorEx {
int x,y;
ConstructorEx(){
	x=5;
	y=7;
	
}
ConstructorEx(int x){
	this.x=this.x+x;
	y=y+x;
	
}
ConstructorEx(int x,int y)
{
	this.x=this.x+x;
	this.y=this.y+y;
	}
public void  function(){
	System.out.println(x+y);
}
public static void main(String[] args){
	ConstructorEx c1 = new ConstructorEx();
	ConstructorEx c2 = new ConstructorEx(5);
	ConstructorEx c3 = new ConstructorEx(2,5);
	c1.function();
	c2.function();
	c3.function();
	
	
}
}

