package com.vtalent.naresh;

public class StringCharat {

	String s1="Oliver";
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
		StringCharat sc1=new StringCharat();
		sc1.Mychar(5);
		String s2=new String(ch);
	//	if(s1.b)
	System.out.println(s2);
		
		/*
		 * char[] ch1= {'a','s','n'}; String s3=new String(ch);
		 */
		}
		}

