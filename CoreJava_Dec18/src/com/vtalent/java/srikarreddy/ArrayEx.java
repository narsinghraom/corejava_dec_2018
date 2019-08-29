package com.vtalent.java.srikarreddy;

public class ArrayEx {
	int[] iarray=new int[3];
	float[] farray;
	public float[] arrayfunction(int[] iarray) {
		float[] farray=new float[iarray.length];
		for(int i=0;i<=iarray.length-1;i++) {
			farray[ i]=iarray[i ];
		}
		return farray;
		
	}
	public static void main(String[] args) {
		ArrayEx ae=new ArrayEx();
		for(int i=0;i<=ae.iarray.length-1;i++) {
			ae.iarray[i]=i+2;
		}
		ae.farray=ae.arrayfunction(ae.iarray);
		for(int i=0;i<=ae.farray.length-1;i++) {
			System.out.println(ae.farray[i]);
		}
	}
	

}
