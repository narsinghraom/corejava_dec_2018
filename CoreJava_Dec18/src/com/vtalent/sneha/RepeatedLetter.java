package com.vtalent.sneha;

import java.util.Scanner;

public class RepeatedLetter {
	 static int findRepeatFirstN2(String s) 
	    {  
	        int pos= -1, i, j; 
	       
	        for (i = 0; i < s.length(); i++) 
	        { 
	            for (j = i + 1; j < s.length(); j++) 
	            {
	           
	            	if (s.charAt(i) == s.charAt(j)) 
	            {
	            		
	            		
	                        for(int c=0;c<s.length();c++)
	                        	pos = i;
	                        	
	                }
	            	
	            }
	           
	            if (pos != -1) 
	                break; 
	        } 
	      
	        return pos; 
	    } 
	      
	    // Driver code 
	    static public void main (String[] args) 
	    { 
	    	 /*Scanner s = new Scanner(System.in);  
		       System.out.print("Enter a name ");  
		       int str = s.nextInt();*/
	        String str = "singamsneha"; 
	        int pos = findRepeatFirstN2(str); 
	          
	        if (pos == -1) 
	            System.out.println("Not found");
	        
	        else
	        System.out.println( str.charAt(pos));
            
	    } 
	    }
	

