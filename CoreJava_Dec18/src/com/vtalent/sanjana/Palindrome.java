package com.vtalent.sanjana;

public class Palindrome {
	

		static String s1="Oliver";
		
		
		static char [] ch;
			public char Mychar(int index) {
				 ch=new char[s1.length()];
				int j=0;
				for(int i=s1.length()-1;i>=0 ;i--) {
					ch[j]=s1.charAt(i);
					j++;
				}
				return ch[index];
				}		
			
			public static void main(String[] args) {
		Palindrome p=new Palindrome();
		p.Mychar(5);
			String s2=new String(ch);
			System.out.println("Given string: "+s1);
			System.out.println("Reverse of a string: "+s2);
			if(s1.equals(s2))
			{
				System.out.println(s1+ " is a Palindrome");
			}
			else
			{
				System.out.println(s1+ " is not a Palindrome");
			}
			}
			}

