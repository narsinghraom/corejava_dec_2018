package com.vtalent.bharathi.basics;

public class ThisExample {
	int x,y;
	
	ThisExample(){
		
	}
	ThisExample(int x){
		
	}
	ThisExample(int x,int y){
		
	}
	public static void main(String[] args) {
		ThisExample obj1 = new ThisExample();
		System.out.println(obj1.x);
		
		ThisExample obj2 = new ThisExample();
		System.out.println(obj2.x);
		ThisExample obj3 = new ThisExample();
		System.out.println(obj3.x);
	}
}
