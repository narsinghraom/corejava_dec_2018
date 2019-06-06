package com.vtalent.sanjana;
import java.util.Scanner;

public class RwordsDel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		int count=1;String s="";
		String[] s5=s1.split("\\s");
		
		for(int i=0;i<s5.length;i++)
		{
		for(int j=i+1;j<s5.length;j++)
		{
			if(s5[i].equals(s5[j]))
			{
				count++;
				s=s+s5[j];
			}
			
		}
		}
		if(count>=2)
		{
			System.out.println(s+"-"+count);
		}
		else
		{
			System.out.println("No Repeated Words");
		}
	}
	}


