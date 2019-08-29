package com.vtalent.prashanth;

public class ThisEx2 {
	int i,j;
	ThisEx2(){
		this(8,4);
		i=5;
		j=7;
	}
	ThisEx2(int i){
		this.i = this.i + i;
		j = j + this.i;
	}
	ThisEx2(int i,int j){
		this(2);
		this.i = this.i + i;
		this.j = this.j * j;
	}


	
	public static void main(String[] args) {
		ThisEx2 e1 = new ThisEx2();
		System.out.println(e1.i + e1.j);

	}

}
