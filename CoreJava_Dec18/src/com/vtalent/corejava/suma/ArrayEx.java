package com.vtalent.corejava.suma;

public class ArrayEx {
	
		int[] iArray;
		float[] fArray;
		public void arrayExample(int[] iarray){
		fArray=new float[iArray.length];
		for(int i=0;i<=iArray.length-1; i++){
		fArray[i]=iArray[i];

		}
		}
		public static void main(String[] args) {
		ArrayEx ae=new  ArrayEx();
		ae.iArray=new int[4];
		for(int i=0;i<=ae.iArray.length-1; i++){
		ae.iArray[i]=i+2;
		}
		ae.arrayExample(ae.iArray);
		for(int k=0;k<=ae.fArray.length-1;k++){
		System.out.println(ae.fArray[k]);
		}
		System.out.println(ae.iArray);
		System.out.println(ae.fArray);

		}
		}


