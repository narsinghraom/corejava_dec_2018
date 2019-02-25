package com.vtalent.saranyanc;

public class Object {
	
	 static int k;
	 int j;
	 
	 
	public  void function(){
		
	k=10;
	
	
	

	this.j=this.j*k;
	k=k-1;
	}

		
	
	
		
	
	public static void main (String[] args){
		 Object oe=new Object();
	
	 System.out.println(Object.k);
		System.out.println(oe.j);
		
		
		oe. function();
		
		 System.out.println(Object.k);
			System.out.println(oe.j);
			
		
		
		
		
		
	}

}
