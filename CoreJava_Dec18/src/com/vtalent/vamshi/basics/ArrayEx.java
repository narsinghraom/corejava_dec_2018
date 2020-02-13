package com.vtalent.vamshi.basics;

public class ArrayEx {
int[] iarr=new int[4];
float[] farr;
public float[] function(int[] iarr)
{
	float[] farr=new float[iarr.length];
	for(int i=0;i<iarr.length-1;i++)
	{
		farr[i]=iarr[i]+3;
		
	}
	return farr;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayEx ae= new ArrayEx();
for(int i=0;i<=ae.iarr.length-1;i++)
{
	ae.iarr[i]= i+3;
	
}
ae.farr=ae.function(ae.iarr);
for(int k=0;k<=ae.farr.length-1;k++)
{
	System.out.println(ae.farr[k]);
}

	}
	}


