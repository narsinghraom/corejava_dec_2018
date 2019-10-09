package com.vtalent.vinodreddy;

import java.util.Scanner;

public class DuplicateCharacters {
	
    static final int Size = 256; 

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		
		System.out.println("enter the string ");
		String name = s.next();
		int count[] = new int[Size]; 
		  
		
		  int len = name.length();
		   
        // Initialize count array index 
        for (int i = 0; i < len; i++) 
            count[name.charAt(i)]++; 
  
		char ch[] = new char[name.length()]; 
		
		for (int i=0;i<ch.length;i++) {
            ch[i] = name.charAt(i); 
            int find = 0; 
            for(int j=0;j<ch.length;j++) {
            	if (name.charAt(i) == ch[j])  
                    find++;                 
            }
          
			if (find== 1)  
                System.out.println("Number of Occurrence of " + 
                 name.charAt(i) + " is:" + count[name.charAt(i)] );
			
		}
	}

}
