package com.vtalent.bharathi.basics;

public class ThisExample {
	int x,y;
	
	ThisExample(){
		x= 5;
		y = 7;
		
	}
	ThisExample(int x){
		this.x = this.x+x;
		y = x+y;
		
		
	}
	ThisExample(int x,int y){
		this.x = this.x+x;
		this.y = this.y+y;
		
	}
	public static void main(String[] args) {
		ThisExample obj1 = new ThisExample();
		System.out.println(obj1.x);
		System.out.println(obj1.y);
		
		ThisExample obj2 = new ThisExample(5);
		System.out.println(obj2.x);
		System.out.println(obj2.y);
		ThisExample obj3 = new ThisExample(5,6);
		System.out.println(obj3.x);
		System.out.println(obj3.y);
	}
}
