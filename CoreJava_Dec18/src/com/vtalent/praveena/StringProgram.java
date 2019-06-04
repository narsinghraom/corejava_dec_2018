package com.vtalent.praveena;

import java.util.Scanner;


public class StringProgram
{
public static void main(String[] args) 
	{
	Scanner input=new Scanner(System.in);

	System.out.println("enter String");
	String S1=new String(input.nextLine());
	//System.out.println("enter second string");
	//String S2=new String(input.nextLine());
	
	StringTest Str=new StringTest();
	System.out.println("select your option");
	int a=input.nextInt();
	switch(a)
	{
	case 1:
	//Splitting the given string into words 
	String[] words=S1.split("\\s");
	
	
	//for every word counting the repeated letter by calling method
	
		for(int n=0;n<words.length;n++)
		{
		Str.word(words[n]);
		
		}
		break;
		
	case 2:
		Str.Removespaces(S1);
		break;
	case 3:
		String[] words1=S1.split("\\s");
		Str.RepeatedWord(words1,S1);
		break;
	case 4:
		Str.DeleteExtraChar(S1);
		break;
	case 5:
		String[] words2=S1.split("\\s");
		Str.StringConcat(S1,words2);
		break;
		
	/*case 6:
		Str.StringAddition(S1,S2);
		break;*/
	case 7:
		Str.StringFactorial(S1);
		break;
	}
	}
}

	
	