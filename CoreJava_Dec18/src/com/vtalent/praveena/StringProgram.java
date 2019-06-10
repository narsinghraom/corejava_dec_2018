package com.vtalent.praveena;

import java.util.Scanner;


public class StringProgram
{
public static void main(String[] args) 
	{
	Scanner input=new Scanner(System.in);

	System.out.println("enter String");
	String S1=new String(input.nextLine());
	StringTest Str=new StringTest();
	System.out.println("select your option");
	int a=input.nextInt();
	
	switch(a)
	{
	
	//To show the repeated character in a word
	
	case 1:
	
	String[] words=S1.split("\\s");    //Splitting the given string into words 
	
		for(int n=0;n<words.length;n++)  //for every word counting the repeated letter by calling method
		{
		Str.word(words[n]);
		
		}
		break;
	
		
		//To remove all the spaces in a given string
		
	case 2:
		Str.Removespaces(S1);
		break;
	
	
	//To show the repeated word in given string
	
	case 3:
		String[] words1=S1.split("\\s");
		Str.RepeatedWord(words1);
		break;
		
		//To delete repeated characters in given words of string
		
	case 4:
		String[] words3=S1.split("\\s");
		for(int n=0;n<words3.length;n++)
			{
			Str.DeleteExtraChars(words3[n]);
			
			}
		break;
		
		//To Add all the words of given string by removing first and last letter of the words if they are same
	
	case 5:
		String[] words2=S1.split("\\s");
		Str.StringConcat(S1,words2);
		break;
		
		//To add two string by removing common letter
		
	case 6:
		Str.StringAddition();
		break;
	case 7:
		Str.StringFactorial(S1);
		break;
	}
	}
}

	
	