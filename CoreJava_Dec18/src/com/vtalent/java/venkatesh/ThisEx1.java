package com.vtalent.java.venkatesh;

public class ThisEx1 {
	int i,j;
	ThisEx1(){
		this(3,5);
		i=5;
		j=7;
	}
	ThisEx1(int i){
		this.i=this.i+i;
		j=j+this.i;
	}
	ThisEx1(int i,int j){
		this(i+j);
		this.i=this.i+i;
		this.j=this.j*j;
		
	}
	public static void main(String[] args) {
		ThisEx1 e1=new ThisEx1();
		System.out.println(e1.i+e1.j);
		
	}

}