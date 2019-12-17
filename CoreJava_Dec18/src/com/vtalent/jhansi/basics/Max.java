package com.vtalent.jhansi.basics;

public class Max {
	public static void main(String[] args) {
		int a[]= {50,1,20,35,43};
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(max<a[i])
				max=a[i];
					}
		System.out.println("max of given numbers is "+max);
	}

}
