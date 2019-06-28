package com.vtalent.bhavani;

public class Static {
	 int a=10;

	public String function(){
		return a+"";
	}
	
public static int display(){
	System.out.println("static method");
	return 1;
}
static{
	
	System.out.println("static block1");
}
static{
	
	System.out.println("static block2");
}
public static void main(String[] args) {
	
	//display();
	Static a=new Static();
	System.out.println(a);
	
}
}