package com.vtalent.sukesh;
public class Demo {
	int i, j;
	static float f1, f2;

	public void functionOne()

	{
		i = 5;
		j = 7;
	}

	public static int functionTwo(float F1) {
		Demo.f1 = F1 + Demo.f1;
		f2 = Demo.f1 + f2;
		return (int) F1;
	}

	public static void main(String[] args) {

		Demo D = new Demo();
		D.functionOne();
		int k = functionTwo((float) D.i);
		System.out.println(k);
		System.out.println(D.i + D.j);
		System.out.println(f1 + f2);

	}

}
