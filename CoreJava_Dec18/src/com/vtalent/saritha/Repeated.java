package com.vtalent.saritha;

import java.util.Scanner;

public class Repeated {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			String s1=sc.nextLine();

			String[] s2=s1.split("\\s");
			for(int k=0;k<s2.length;k++)
			{
				word(s2[k]);
			}
		}
			static public void word(String s1)
			{
				int count=1;char ch1='\u0000';
				char[] ch=new char[s1.length()];
				ch=s1.toCharArray();
				for(int j=0;j<ch.length;j++)
				{
					for(int i=j+1;i<ch.length;i++)
					{

							if(ch[j]==ch[i])
							{

								ch1=ch[j];
								count++;
							//System.out.println(ch1+" - "+count);
							break;
							}
			}
		}

				if(count>=2)
				{
					System.out.println(ch1+" - "+count);
				}
	}
	}


