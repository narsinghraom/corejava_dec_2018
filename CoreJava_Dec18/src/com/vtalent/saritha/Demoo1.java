package com.vtalent.saritha;

public class Demoo1 {
	int x,y;
	public void function1(int x){
	this.x=x+this.x;
	y=x+y;
	}
	public void function2(int x,int y){
		this.x=this.x+x;
		this.y=this.y+y;
	}
	class Demo2 extends Demoo1{
		int x;
		public void function(int x){
			this.x=this.x+x;
		}
	}
	
			

}

