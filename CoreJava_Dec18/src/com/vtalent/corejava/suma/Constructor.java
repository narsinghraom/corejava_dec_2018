

package com.vtalent.corejava.suma;

public class Constructor {
	int x,y;
	Constructor(){
	x=2;
	y=5;
	}
	Constructor(int x){
		this.x=this.x+x;
		y=y+x;
	}
	Constructor(int x, int y){
	this.x=this.x+x;
	this.y=this.y+y;
	
	}
	public static void main(String[] args){
		
			Constructor c1 = new Constructor();
			System.out.println(c1.x+c1.y);
			Constructor c2 = new Constructor(5);
			System.out.println(c2.x+c2.y);
			ConstructorEx c3 = new ConstructorEx(2,5);
			System.out.println(c3.x+c3.y);
			
		
		
	}
}
