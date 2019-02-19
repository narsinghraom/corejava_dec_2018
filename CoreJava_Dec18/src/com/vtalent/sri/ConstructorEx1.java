package com.vtalent.sri;

public class ConstructorEx1 {
int x,y;

ConstructorEx1(){
	x=5;
	y=7;
}
ConstructorEx1(int x){
	this.x=this.x+x;
	y=y+x;
}
ConstructorEx1(int x,int y){
	this.x=this.x+x;
	this.y=this.y+y;
}
public void function(){
	System.out.println(x+y);
}
public static void main(String[] args){
ConstructorEx1 c1=new ConstructorEx1();
ConstructorEx1 c2=new ConstructorEx1(5);
ConstructorEx1 c3=new ConstructorEx1(2,5);
c1.function();
c2.function();
c3.function();
System.out.println(c1);
System.out.println(c2);
System.out.println(c3);
}
}
