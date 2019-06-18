package com.vtalent.sanjana;
import java.util.Scanner;

public class RCharDel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Statement");
		String s1=sc.nextLine();
		
		String[] s5=s1.split("\\s");
		for(int k=0;k<s5.length;k++)
		{
			character(s5[k]);
		}
	}
	static public void character(String s6)
	{
		for(int j=0;j<s6.length();j++)
		{
			for(int i=j+1;i<s6.length();i++)
			{
				if(s6.charAt(j)==s6.charAt(i))
				{
					s6=s6.replace(s6.charAt(j),' ');
				}
				
			}
		}
		System.out.print(s6.replace(" ", "")+" ");
	}

}
