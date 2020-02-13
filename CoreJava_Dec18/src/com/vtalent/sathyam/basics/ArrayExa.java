package com.vtalent.sathyam.basics;

public class ArrayExa {
	int[] iarr=new int[4];
	static float[] farr;
	public float[] function(int[] iarr)
	{
		float[] farr = new float[iarr.length];
		for(int i=0;i<=iarr.length-1;i++)
		{
			farr[i]=iarr[i]+2;
		}
		return farr;
	}
	public static void main(String[] args) {
		ArrayExa ae =new ArrayExa();
		for(int i=0;i<=ae.iarr.length-1;i++) {
			ae.iarr[i]=i+2;
		}
		ae.farr=ae.function(ae.iarr);
		for(int k=0;k<=farr.length-1;k++)
		{
			System.out.println(farr[k]);
		}
		System.out.println(farr);
		System.out.println(ae);

		
	}
		}
		 
	
