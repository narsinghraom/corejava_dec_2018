package com.vtalent.bharathi.basics;

import java.util.Scanner;

public class CharOccuranceCount {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the string");  
		String s = sc.nextLine();   // getting the string from the user
		String string = s.toLowerCase();  // is there any upper case letters it will convert to the lower case
		int count = 1;   // initialize to count the occurrences
		char[] ch = string.toCharArray();     // it will converting the given string in to the character array and return char array
		
	        
	        for (int i = 0;i<string.length();i++) {  // take an for loop until the length becomes fail
	        	for(int j = i+1;j<string.length();j++) { // another for loop for comparing the two characters of a character array
	        		if (ch[i] == ch[j]) {  // if the first index and second index matches count will increment by 1
	        			count+=1;
	        			ch[j]=0;
	        			
	        		}
	        	}
	        	if (ch[i]!=0 && ch[i]!=' ') {  // it will checks for 0s and " "
	        		System.out.println(ch[i]+" repeated "+count+" time");  // printing output
	        		count = 1;
	        		}
	        		
	        	}
	        	
	        }
	        
	        
	        
	        
	    }
		
	
		 
	  
		


