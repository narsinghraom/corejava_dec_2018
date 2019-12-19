package com.vtalent.aasritha.basic;

/**
 * @author ADMIN
 *
 */
public class ThisExp {
	int x,y;
	ThisExp(){
		x=5;
		y=7;
	}
	ThisExp(int x){
		this(2,4);
		this.x=this.x+x;
		y=x+y;
	}
	ThisExp(int x, int y){
		this();
		this.x=this.x+x;
		this.y=this.y+y;
	}
	public static void main(String[] args) {
		/*ThisExp thisExp = new ThisExp();
		System.out.println(thisExp.x);
		System.out.println(thisExp.y);*/
		ThisExp thisExp2 = new ThisExp(5);
		System.out.println(thisExp2.x);
		System.out.println(thisExp2.y);
		/*ThisExp thisExp3 = new ThisExp(2,3);
		System.out.println(thisExp3.x);
		System.out.println(thisExp3.y);*/
	}

}
