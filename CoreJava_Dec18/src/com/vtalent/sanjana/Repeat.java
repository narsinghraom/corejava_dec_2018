package com.vtalent.sanjana;
import java.util.Scanner;

public class Repeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Statement");
		String s1=sc.nextLine();
		
		String[] s5=s1.split("\\s");
		for(int k=0;k<s5.length;k++)
		{
			word(s5[k]);
		}
	}
		static public void word(String s1)
		{
			System.out.println(s1);
			int count=1;char ch1='\u0000';
			char[] ch=new char[s1.length()-1];
			ch=s1.toCharArray();
			char[] ch5=new char[s1.length()-1];
			int n=0;
			int count1=0;
			for(int j=0;j<ch.length;j++)
			{
				for(int i=j+1;i<ch.length;i++)
				{
				
						if(ch[j]==ch[i])
						{
							
							ch1=ch[j];
							count++;
						//System.out.println(ch1+" - "+count);
						
						}
		         }
	
               if(count>=2)
				{
					
				
				for(int k=0;k<ch5.length;k++)
				{
					if(ch5[k]==ch1)
					{
						count1++;
						count=1;
					}
				
				}
					if(count1==0)
					{
				
				System.out.println( ch1+" - "+count);
				ch5[n]=ch1;
				n++;
				
				
				count=1;
			}
				}
			}
		}
}
