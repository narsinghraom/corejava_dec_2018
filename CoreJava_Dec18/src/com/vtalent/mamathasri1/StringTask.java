package com.vtalent.mamathasri1;

import java.util.Scanner;

public class StringTask {
	public static void main(String args[])
	{
		System.out.println("Enter any string");
		Scanner sc=new Scanner(System.in);
		String S =sc.nextLine();
		char[] C= S.toCharArray();
		for(int i=0;i<C.length;i++)
		{
			int Count=0;
			int Count1=0;
			for(int j=0;j<=i;j++) {
				if(C[i]==C[j]) {
					Count1++;
				}
			}
			
			if(Count1==1&&C[i]!=' ') {
				for(int k=0;k<C.length;k++) {
					if (C[i]==C[k]) {
						Count++;	
					}
				}
	if(Count>1)
	{
		System.out.println(C[i]+""+Count+"Times");
	}
	}

}

}
}
