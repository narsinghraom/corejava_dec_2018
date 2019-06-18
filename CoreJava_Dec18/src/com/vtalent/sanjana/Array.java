package com.vtalent.sanjana;

public class Array {
	int[] iarray=new int[4];
	static float[] farray;
	public void function(float[] farray)
	{
		for(int i=0;i<=farray.length-1;i++)
		{
			iarray[i]=(int)farray[i];
			
		}
	}

	public static void main(String[] args) {
farray=new float[4];
for(int i=0;i<=3;i++)
{
	farray[i]=1.5f+i;
}
Array ax=new Array();
ax.function(farray);
System.out.println(ax.iarray);
System.out.println(farray);
for(int k=0;k<=3;k++)
{
	System.out.println("ivalue=" +ax.iarray[k]);
	System.out.println("fvalue"+farray[k]);
}
	}

}
