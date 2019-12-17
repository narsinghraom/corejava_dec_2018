package com.vtalent.jhansi.basics;

public class Min {
	public static void main(String[] args) {
		int a[]= {50,1,20,35,43};
		int min=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(min>a[i])
				min=a[i];
					}
		System.out.println("max of given numbers is "+min);
	}

}
