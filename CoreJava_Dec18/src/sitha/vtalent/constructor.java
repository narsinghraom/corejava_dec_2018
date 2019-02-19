package sitha.vtalent;

public class constructor {
 
	int x,y;
	constructor(){
	x=5;y=7;
	}
	constructor(int x){
		this.x=this.x+x;
		y=this.x;
		}
	constructor(int x,int y){
		x=this.x+x;
		y=this.y+y;
	}
	public void function(){
		System.out.println(x+y);
		}
	public static void main(String[]args){
		constructor c1=new constructor();
		constructor c2=new constructor(5);
		constructor c3=new constructor(2,8);
		System.out.println(c1.x);
		System.out.println(c2.x);
		System.out.println(c3.x);
				
	}
}
