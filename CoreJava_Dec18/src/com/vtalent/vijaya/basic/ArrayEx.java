package com.vtalent.vijaya.basic;

public class ArrayEx {
	int[] iarr=new int[4];
	float[] farr;
	public float[] function(int[] iarr) {
		float[] farr=new float[iarr.length];
		for(int i=0;i<=iarr.length-1;i++) {
			farr[i]=iarr[i]+2;
		}
		return farr;
	}
	public static void main(String[] args) {
		ArrayEx ae=new ArrayEx();
		for(int i=0;i<=ae.iarr.length-1;i++) {
			ae.iarr[i]=i+2;
		}
			ae.farr=ae.function(ae.iarr);
			for(int k=0;k<=ae.farr.length-1;k++) {
				System.out.println(ae.farr[k]);
			}
			System.out.println(ae.farr);
			System.out.println(ae);
		}
	}


