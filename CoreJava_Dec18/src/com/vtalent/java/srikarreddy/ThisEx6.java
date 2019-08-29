package com.vtalent.java.srikarreddy;

public class ThisEx6 {
	int i,j;
	ThisEx6(){
	  this(2);
	 i=5;
	 j=7;
}
	ThisEx6(int i){
		 
		
		this.i=this.i+i;
		j=j+this.i;
		
	}
	ThisEx6(int i,int j){
		  this( );
		this.i=this.i+i;
		this.j=this.j*j;
	}
	public static void main(String[] args) {
		ThisEx6 e3=new ThisEx6(5,2);
		System.out.println(e3.i+e3.j); 
	}
	

}
