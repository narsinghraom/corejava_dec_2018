package com.vtalent.sanjana;
import java.util.Scanner;

public class RwordsDel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		int count=1;String s="";
		String st="";
		String[] s5=s1.split("\\s");
		
		for(int i=0;i<s5.length-1;i++)
		{
		for(int j=i+1;j<s5.length;j++)
		{
			if(s5[i].equals(s5[j]))
			{
				count++;
				s=s5[i];
			}
			
		}
		
		if(count>1)
		{
			if(st.contains(s))
			{
				count=1;
			}
		
		    else 
		    {
			System.out.println(s+"-"+count);
			count=1;
			st=st+s;
			}
		}
		
		
		}
		
	}
	}


