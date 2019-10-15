package com.vtalent.varshini;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		System.out.println("enter the string");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char[] c=s.toCharArray();
		for( int i=0;i<c.length;i++)
		{
			int count=0;
		    int count1=0;
		    for(int j=0;j<=i;j++) {
		    	if(c[i]==c[j]) {
		    		count++;
		    	}
		    }
     if(count==1&&c[i]!= ' ') {
    	 for(int k=0;k<c.length;k++) {
    		 if(c[i]==c[k]) {
    			 count1++;
    		 }
    	 }
     }
    	 if(count>1) {
    		 System.out.println(c[i]+"letter"+ " "+ count + "times");
    	 }
     }
	}

}
