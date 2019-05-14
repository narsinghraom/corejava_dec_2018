package com.vtalent.naresh;

public class Constructor_Demo2 {



		int x,y;
		
		Constructor_Demo2(){
			this(5,5);
		}
		
		Constructor_Demo2(int x){
			
			//this();
		this.x=this.x+x;	//10		//10
		y=y+this.x;			//10		//15
		}
	Constructor_Demo2(int x,int y){
		this(x+y);
		this.x=this.x+x;	//15	//5
		this.y=this.y+y; 	//15	//5
	}
		
		public static void main(String[] args) {
			Constructor_Demo2 c1=new  Constructor_Demo2();
			//Constructor_Demo2 c1=new  Constructor_Demo2(5);
			System.out.println( c1.x+c1.y);
		}

	}


