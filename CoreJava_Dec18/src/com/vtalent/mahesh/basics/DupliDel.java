package com.vtalent.mahesh.basics;

import java.util.Scanner;

public class DupliDel {

	public static String unii(String s) 
    { 
        String str = new String(); 
        int len = s.length(); 
          
        // loop to traverse the string and 
        // check for repeating chars using 
        // IndexOf() method in Java 
        for (int i = 0; i < len; i++)  
        { 
            // character at i'th index of s 
            char c = s.charAt(i); 
              
            // if c is present in str, it returns 
            // the index of c, else it returns -1 
            if (str.indexOf(c) < 0) 
            { 
                // adding c to str if -1 is returned 
                str += c; 
            } 
            else { str += c; }
        } 
          
        return str; 
    } 
	public static void main(String args[]) 
	{ 		
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter string 1");
		        String s1 = sc.nextLine();
		        System.out.println("Enter string 2");
		        String s2 = sc.nextLine();

String a=s1+s2;
System.out.println(a);
String dup= unii(a);

System.out.println("dup     "+dup);

	
	}

	}