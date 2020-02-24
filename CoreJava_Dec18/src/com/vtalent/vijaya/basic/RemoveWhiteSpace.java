package com.vtalent.vijaya.basic;

public class RemoveWhiteSpace {
	public static void main(String[] args) {
		boolean amp;
		String inputstring="Saket Saurav        is a QualityAna    list";
		char[] charArray=inputstring.toCharArray();
		String stringwithoutspace=" ";
		for(int i=0;i<charArray.length;i++)
		{
			if((charArray[i]!=' ')&amp;&amp;(charArray[i]!='\t'))
			{
				stringwithoutspace=stringwithoutspace+charArray[i];
			}
		}
		System.out.println("input string without space-"+inputstring);
	}

}
