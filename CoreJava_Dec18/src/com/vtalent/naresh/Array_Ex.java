package com.vtalent.naresh;

public class Array_Ex {
	int a=5;
	  int[] iarray=new int[4];
	static float[] farray;
	 public void funtionOne(float[] farray) {
		 for (int i=0; i<=farray.length-1; i++) {
			 iarray[i]=(int)farray[i];
		 }
	}
	
	public static void main(String[] args) {
			farray=new float[4];
			for(int i=0;i<=3;i++) {
				farray[i]=1.5f+i;
			}
			
			Array_Ex ae=new Array_Ex();
			ae.funtionOne(farray);
			
			System.out.println(ae.iarray);
			System.out.println(ae.farray);
			
			for(int k=0; k<=3; k++) {
				System.out.println("i value= "+ae.iarray[k]);
			}
		
			
	}

}
