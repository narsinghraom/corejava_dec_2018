package com.vtalent.bharathi.basics;

import java.util.Scanner;

public class Permutations {  
	      
	    public static String swapString(String a, int i, int j) {  
	        char[] b =a.toCharArray();  // converting string to char array
	        char ch;  
	        ch = b[i];  // 
	        b[i] = b[j];  // 
	        b[j] = ch;  
	        return String.valueOf(b);  
	    }  
	      
	    public static void main(String[] args)  
	    {  
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("Enter the String");
	        String str = sc.nextLine();  
	        int len = str.length();  
	        System.out.println("All the permutations of the string are: ");  
	        generatePermutation(str, 0, len);  
	    }  
	    public static void generatePermutation(String str, int start, int end)  
	    {  
	        //Prints the permutations  
	        if (start == end-1)  
	            System.out.print(str+" ");  
	        else  
	        {  
	            for (int i = start; i < end; i++)  
	            {  
	                //Swapping the string by fixing a character  
	                str = swapString(str,start,i);  
	                //Recursively calling function generatePermutation() for rest of the characters   
	                generatePermutation(str,start+1,end);  
	                //Backtracking and swapping the characters again.  
	                str = swapString(str,start,i);  
	            }  
	        }  
	    }  
	}  
	   

