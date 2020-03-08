package com.vtalent.corejava.avinash;

public class Constructor5 {
		int x,y;
		Constructor5(){
			this(2,6);
			x=2;
			y=5;
		}
		Constructor5(int x){
			this.x=this.x+x;
			y=y+x;
		}
		Constructor5(int x,int y){
			this(7);
			this.x=this.x+x;
			this.y=this.y+y;
		}
		public static void main(String[]args) 
		{
			Constructor5 c1=new Constructor5();
			System.out.println(c1.x+c1.y);
		}
	}


