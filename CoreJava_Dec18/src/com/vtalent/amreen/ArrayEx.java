package com.vtalent.amreen;

public class ArrayEx {
	static int[] iarray = new int[4];
	static float[] farray;

	public void m1(float[] farray) {
		for (int i = 0; i <= farray.length - 1; i++) {
			iarray[i] = (int) farray[i];

		}
	}

	public static void main(String[] args) {
		farray = new float[4];
		for (int i = 0; i <= 3; i++) {
			farray[i] = farray[i] + i;

		}
		ArrayEx ae = new ArrayEx();

		ae.m1(farray);
		System.out.println(ae.iarray);
		System.out.println(farray);
		for (int k = 0; k <= 3; k++) {

			System.out.println("i value" + iarray[k]);
			System.out.println("f value" + farray[k]);
		}

	}

}
