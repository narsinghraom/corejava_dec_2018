package com.vtalent.jhansi.basics;

class ThreeVariables{
	int x,y;
	public void add(int x,int y){
		
		System.out.println("this.x+this.y = "+ this.x+this.y );
		System.out.println("x+y = " + x+y);
		}
}


public class ThreeVariablesEg extends ThreeVariables{
	
	public void add(int x,int y)
	{
		System.out.println("this.x+this.y = "+ this.x+this.y );
		System.out.println("x+y = " + x+y);
		System.out.println("calling super class");
		super.add(5,6);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreeVariablesEg t1=new ThreeVariablesEg();
		ThreeVariables t=new ThreeVariables();
		int x=5;
		int y=6;
	t1.add(x, y);


}
}