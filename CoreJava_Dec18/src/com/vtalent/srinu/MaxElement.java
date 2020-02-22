package com.vtalent.srinu;

public class MaxElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={45,85,76,25,84};
		int max=a[0];
		for (int i = 1; i < a.length; i++) {
			if(max<a[i])
			{
				max=a[i];
			
			System.out.println(max);
			}
		}

	}

}
