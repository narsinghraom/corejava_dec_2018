package com.vtalent.java.venkatesh;

public class SizeOfArray {
	static int array[]= {10,0,40,2};
	static int largest() {
		int m=array[0];
		for(int i=0;i<array.length;i++) {
			if(array[i]>m) {
				m=array[i];
			}
		}
		return m;
	}
	static int smallest() {
		int n=array[0];
		for(int i=0;i<array.length;i++) {
			if(array[i]<n) {
				n=array[i];
			}
		}
		return n;
	}
	public static void main(String[] args) {
		System.out.println("max value:"+largest());
		System.out.println("min value:"+smallest());
	}
}