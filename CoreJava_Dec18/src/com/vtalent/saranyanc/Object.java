package com.vtalent.saranyanc;

public class Object {
	
	  int k;
	static int j;
	 
	 
	public   void function(){
		
	Object.j=10;
	this.k=this.k+j;
	j=j+1;
	

		
	
	
		
	}
	public static void main (String[] args){
		 Object oe=new Object();
	
	 System.out.println(oe.k);
		System.out.println(Object.j);
		
		
		oe. function();
		 System.out.println(oe.k);
			System.out.println(Object.j);
			
		
		
		
		
		
	}

}
