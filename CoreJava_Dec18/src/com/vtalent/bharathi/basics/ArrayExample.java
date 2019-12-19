package com.vtalent.bharathi.basics;

public class ArrayExample {


		int[] iArray = new int[4];
		float[] fArray;
		public float[] function(int[] iArray) {
			float[] fArraay = new float[iArray.length];
			for(int i=0;i<=iArray.length-1;i++) {
				fArraay[i] = iArray[i]+3;
			}
			return fArraay;
		}
	public static void main(String[] args) {
		ArrayExample ae = new ArrayExample();
		for(int i=0;i<=ae.iArray.length-1;i++) {
			ae.iArray[i]=i+3;
		}
		ae.fArray = ae.function(ae.iArray);
		for(int k=0;k<=ae.fArray.length-1;k++)
			System.out.println(ae.fArray[k]);
	}
	}

