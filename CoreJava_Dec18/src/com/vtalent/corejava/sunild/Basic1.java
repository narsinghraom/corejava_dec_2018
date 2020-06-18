package com.vtalent.corejava.sunild;


public class Basic1 {
	int i;
	float f1;
	public void function(){
		int x=method(3,30.0f);
		System.out.println("My value of X"+" "+x);
	}
	public int method(int i,float f1){
		this.i=(int) (i+f1);//the value of i and f1 will typecasted into integer and store to int 
		
		this.f1=(float) (this.i); /*this float value is converted to float the 
									parameters from method which are non-static varibiles*/
		
		return (int)(this.i+this.f1); /* the float value and integer are access 
										from object section and return a integer*/
		
	}
	public static void main(String[] args) {
		Basic1 basic1 = new Basic1();
		basic1.function();
	}

}