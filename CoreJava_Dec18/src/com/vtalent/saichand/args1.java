package com.vtalent.saichand;

public class args1 {
	int[] iarray = new int[4];
	static float[] farray;

	public void function(float[] farray) {
		for (int i = 0; i <= farray.length - 1; i++)
			;
		{
			iarray[i] = (int) farray[i];
		}
	}

	public static void main(String args[]) {
		farray = new float[4];
		for (int i = 0; i <= 3; i++)
			farray[i] = 1.5f + i;
		args1 arg = new args1();
		arg.function(farray);
		System.out.println(args.iarray);
	}
}
