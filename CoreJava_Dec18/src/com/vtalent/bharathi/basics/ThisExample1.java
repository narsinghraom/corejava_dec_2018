package com.vtalent.bharathi.basics;

public class ThisExample1 {
	int x,y;
	
	ThisExample1(){
		this(2); // calling aconstructor with one signature
		x= 5;
		y = 7;
		
	}
	ThisExample1(int x){
		this.x = this.x+x;
		y = x+y;
		
		
	}
	ThisExample1(int x,int y){  //x = 5, y = 6
		this(); // calling default constructor
		this.x = this.x+x;  
		this.y = this.y+y;
		
	}
	public static void main(String[] args) {
		/*
		 * ThisExample1 obj1 = new ThisExample1();
		System.out.println(obj1.x);
		System.out.println(obj1.y);
		
		ThisExample obj2 = new ThisExample(5);
		System.out.println(obj2.x);
		System.out.println(obj2.y);
		*/

		ThisExample1 obj3 = new ThisExample1(5,6);
		System.out.println(obj3.x);
		System.out.println(obj3.y);
	}
}
