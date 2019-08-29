package com.vtalent.java.prashanth;

public class ArrayEx {
	int[] iarray=new int[3];
	float farray;
	public float[] arrayFun(int[] iarray) {
		Float[] farray=new Float[iarray.length];
		for (int i = 0; i < iarray.length-1; i++) {
			farray[i]=iarray[i];
			
		}
		return farray;
		
	}
	public static void main(String[] args) {
		ArrayEx ae=new Arrayex();
		for (int i = 0; i < iarray.length; i++) {
			ae.iarray[i]=i+2;
			
		}
		ae.farray=ae.arrayFun(ae.iarray);
		for (int i = 0; i <= ae.farray.length-1; i++) {
			System.out.println(ae.farray[i]);
		}
	}

}
