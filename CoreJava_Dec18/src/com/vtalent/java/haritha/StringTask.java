package com.vtalent.java.haritha;
import java.util.*;
public class StringTask {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.next();
		char[] c=s.toCharArray();//string to array conversion
		for(int i=0;i<c.length;i++) {
			int k=0;
			int count=0;
			for(int j=0;j<=i;j++) {
				if(c[i]==c[j]) {
				k++;	
				}
			}
				if(k==1 && c[i]!=' ') {
					for(int x=0;x<c.length;x++)
					{
						if(c[i]==c[x]) {
							count++;
						
						}
						
					}
				
				if(count>1) {
					System.out.println(c[i]+"   "+count);
				}
			}
			
		}
	}
}
