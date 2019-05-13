package com.vtalent.saritha;

public class ConstructorExample {
	int x,y;
		ConstructorExample(){
			x=5;
			y=7;
		}
		ConstructorExample(int x){
			this.x=this.x+x;
			y=y+this.x;
		}
		ConstructorExample(int x, int y){
			this.x=this.x+x;
			this.y=this.y+y;
		}
		public static void main(String args[]){
			ConstructorExample c1=new ConstructorExample();
			//ConstructorExample c2=new ConstructorExample(5);
			ConstructorExample c3=new ConstructorExample(5,5);
			System.out.println(c1.x+c1.y);
			//System.out.println(c2.x+c2.y);
			System.out.println(c3.x+c3.y);
		
		}
	
		
	}


