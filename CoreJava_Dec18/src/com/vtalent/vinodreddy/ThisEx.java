package com.vtalent.vinodreddy;

public class ThisEx {
	int i ,j;
	 ThisEx() {

		 i=5;
		 j=7;
			
	} 
		
 ThisEx(int i){
	this.i =this.i +i;
	j = j+this.i;
	
}
ThisEx(int i,int j){
	
	this.i =this.i +i;
	this.j =this.j * j;
}
public static void main(String[] args) {
	ThisEx e1 =new ThisEx(4,5);
	System.out.println(e1.i+e1.j);
}
}
