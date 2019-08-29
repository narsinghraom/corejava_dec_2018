package com.vtalent.java.venkatesh;

public class ThisEx3 {
	int i,j;
	ThisEx3(){
		this(3,5);
		i=5;
		j=7;
	}
	ThisEx3(int i){
		this();
		this.i=this.i+i;
		j=j+this.i;
	}
	ThisEx3(int i,int j){

		this.i=this.i+i;
		this.j=this.j*j;
		
	}
	public static void main(String[] args) {
		ThisEx3 e2=new ThisEx3(2);
		System.out.println(e2.i+e2.j);
		
	}

}

