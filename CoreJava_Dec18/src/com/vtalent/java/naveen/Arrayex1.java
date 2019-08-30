package com.vtalent.java.naveen;

import java.util.Arrays;

public class Arrayex1 {
 int iarray[] = new int[3];
 float[] farray;
 public  float[] arrayfunction(int[] iarray) {
	 farray=new float[iarray.length];
	 for(int i=0;i<=iarray.length-1;i++) {
		farray[i] =iarray[i];
	}
	 
	return farray;
 }
	public static void main(String[] args) {
		Arrayex1  ae=new Arrayex1();
		for(int i=0;i<=ae.iarray.length-1;i++) {
			ae.iarray[i]=i+2;
		}
		ae.farray=ae.arrayfunction(ae.iarray);
	
for(int i=0;i<=ae.farray.length-1;i++) {
	System.out.println(ae.farray[i]);
	Arrays.sort(ae.farray);
}
	}

}
