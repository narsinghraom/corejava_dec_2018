package com.vtalent.swethajadhav;

public class ConstructorXEx {

	int x,y;
	ConstructorXEx(){
		x = 5;
		y = 7;
	}
	ConstructorXEx(int x){
		this(x,x+1);
		this.x = this.x+ x;
		y = y+x;	
	}
	ConstructorXEx(int x , int y){
		this();
		this.x = this.x + x;
		this.y = this.y + y;
	}
	public void function(){
		System.out.println(x+y);
		
	}
	public static void main(String[] args){
		//*ConstructorXEx c1 = new ConstructorXEx();
		ConstructorXEx c2 = new ConstructorXEx(5);
		//*ConstructorXEx c3 = new ConstructorXEx(2,5);
		//*c1.function();
		c2.function();
		//*c3.function();
		
	
	}
}
