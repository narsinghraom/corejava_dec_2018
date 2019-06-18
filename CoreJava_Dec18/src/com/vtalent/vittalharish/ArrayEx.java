package com.vtalent.vittalharish;

 class ArrayEx {
	 
	 int[] iarray = new int[4];
	 static float[] farray;
	 public void function (float[] farray) {
		for(int i=0; i<=farray.length-1; i++){
			iarray[i]=(int) farray[i];
		}
	}
public static void main(String[] args) {
	farray = new float [4];
	for(int i=0;i<=3;i++){
		farray[i]=1.5f+i;
	}
	ArrayEx ae= new ArrayEx();
	ae.function(farray);
	System.out.println(ae.iarray);
	System.out.println(farray);
	for(int k=0;k<=3;k++)
	{
		System.out.println("i.value="+ae.iarray[k]);
		System.out.println("f.value="+farray[k]);
	}
}
}
