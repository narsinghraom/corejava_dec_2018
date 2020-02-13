package com.vtalent.jhansi.basics;

public class Third extends Second{
	public  void functiontwo() {
		this.x=this.x+x;
		y=x+y;
	}
	public static void main(String[] args) {
		
		First f1=new First();
		f1.function();
		System.out.println(f1.x+f1.y);
		Second s1=new Second();
		s1.function();
		s1.functionone();
		System.out.println(s1.x+s1.y);
		Third t1=new Third();
		t1.functiontwo();
		System.out.println(t1.x+t1.y);
		
		
	}
	

}
