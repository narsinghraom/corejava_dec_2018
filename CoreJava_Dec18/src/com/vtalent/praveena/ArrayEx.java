package com.vtalent.praveena;

public class ArrayEx {
int[]iarray=new int[4];
static float[] farray;
public void function(float[]farray)
{
	for(int i=0;i<=farray.length-1;i++)
	{
		iarray[i]=(int) farray[i];
	}
}
public static void main(String[]args)
{
	farray=new float[4];
	for(int i=0;i<=3;i++)
	{
		farray[i]=1.5f+i;
	}
	ArrayEx ex=new ArrayEx();
	ex.function(farray);
	System.out.println(ex.iarray);
	System.out.println(farray);
	}
}
