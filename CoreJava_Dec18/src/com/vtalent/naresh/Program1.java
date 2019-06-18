package com.vtalent.naresh;


public class Program1 {
	int i, j;
	static float f1, f2;

	public void funtionOne() {
		i = 5;
		j = 7;

	}

	public static int funtionTwo(float f1) {

		Program1.f1 = f1 + Program1.f1;
		f2 = Program1.f1 + f2;
		return (int) f1;

	}

	public static void main(String[] args) {
		Program1 p = new Program1();

		p.funtionOne();
		int k = funtionTwo((float) p.i);
		System.out.println(k);
		System.out.println(p.i + p.j);
		System.out.println( f2);

		
	}
}
