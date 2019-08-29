package com.vtalent.prashanth;

public class ThisEx4 {
	int i,j;
	ThisEx4(){
		i=5;
		j=7;
	}
	ThisEx4(int i){
		this(i,2);
		this.i = this.i + i;
		j = j + this.i;
	}
	ThisEx4(int i,int j){
		this();
		this.i = this.i + i;
		this.j = this.j * j;
	}


	
	public static void main(String[] args) {
		ThisEx4 e2 = new ThisEx4(3);
		System.out.println(e2.i + e2.j);

	}

}
