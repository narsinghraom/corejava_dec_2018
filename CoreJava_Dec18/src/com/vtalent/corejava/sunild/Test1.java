package com.vtalent.corejava.sunild;


class First{
int x;
public void function(int x){
this.x=this.x+x;
}
}
class Second extends First{
	 int x,y;
	public void functionOne(int x, int y){
		this.x=this.x+x;
		this.y=this.y+y;
	super.x=super.x+x;
	}
}
public class Test1{
	public static void main(String[] args) {
		First first= new First();
		first.function(5);
		System.out.println(first.x);
		Second second= new Second();
		second.function(5);
		second.functionOne(2,3);
		System.out.println(second.x+second.y);
	}
}