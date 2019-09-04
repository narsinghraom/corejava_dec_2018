package com.vtalent.java.naveen;

public class Con3This {

	int i, j;
//zero-arg constructor
	public Con3This() {
		i = 5;
		j = 7;
	}
 //Parameterized constructors
	public Con3This(int i) {
		this(2, 3);
		this.i = this.i + i;// 12
		j += this.i;// 33
	}

	public Con3This(int i, int j) {
		this();
		this.i = this.i + i; // 7
		this.j = this.j * j;// 21
	}

	public static void main(String[] args) {
		Con3This ct3 = new Con3This(5);
		System.out.println(ct3.i + ct3.j);// 45

	}

}
