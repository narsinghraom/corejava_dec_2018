package com.vtalent.prashanth;

public class ThisEx5 {
	int i,j;
	ThisEx5(){
		this(2);
		i=5;
		j=7;
	}
	ThisEx5(int i){
		this.i = this.i + i;
		j = j + this.i;
	}
	ThisEx5(int i,int j){
		this();
		this.i = this.i + i;
		this.j = this.j * j;
	}


	
	public static void main(String[] args) {
		ThisEx5 e3 = new ThisEx5(6,4);
		System.out.println(e3.i + e3.j);

	}

}
