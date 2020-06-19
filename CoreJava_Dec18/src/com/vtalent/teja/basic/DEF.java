package com.vtalent.teja.basic;

public class DEF {
static boolean ispalindrome(String str) {
	int i=0,j=str.length()-1;
	while (i<j) {
		if(str.charAt(i)!=str.charAt(j))
	
	return false;
	i++;
	j--;
	}
	return true;
}
public static void main (String[] args)
{
	String str="madam";
	if(ispalindrome (str))
		System.out.print("Yes");
	else
		System.out.print("No");
}
	
	


}
