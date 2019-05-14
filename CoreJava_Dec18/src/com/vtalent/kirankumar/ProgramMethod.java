package com.vtalent.kirankumar;

public class ProgramMethod {

	int i, j;
	static float f1, f2;

	public void functionOne() {

		i = 5;
		j = 7;

	}

	/**
	 * 
	 * @param f1
	 * @return
	 */
	public static int functionTwo(float f1) {

		ProgramMethod.f1 = f1 + ProgramMethod.f1;
		f2 = ProgramMethod.f1 + f2;

		return (int) f1;
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String args[]) {

		ProgramMethod dem = new ProgramMethod();

		dem.functionOne();
		int k = functionTwo((float) dem.i);
		System.out.println(k);
		System.out.println(dem.i + dem.j);
		System.out.println(f1 + f2);
	}

}
