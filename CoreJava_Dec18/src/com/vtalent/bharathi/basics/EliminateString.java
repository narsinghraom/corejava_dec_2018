package com.vtalent.bharathi.basics;
import java.util.*;

public class EliminateString {
	
	    public static void main(String args[])
	    {
	    	Scanner input = new Scanner(System.in);
	    	System.out.print("Enter boy name = ");
	    	String s1 = input.nextLine();
	    	 
	    	System.out.println();
	    	System.out.print("Enter girl name = ");
	    	String s2 = input.nextLine();
	        
	        s1 = s1.toLowerCase();
	        s2 = s2.toLowerCase();
	 
	        StringBuilder sb1 = new StringBuilder(s1);// converting to string builder
	        StringBuilder sb2 = new StringBuilder(s2);
	       
	        int m=sb1.length();
	        int n=sb2.length();
	        for(int i=0; i<m;i++)
	        {
	            for(int j=0; j<n;j++)
	            {
	                if(sb1.charAt(i) == sb2.charAt(j))
	                {
	                    sb1.replace(i, i+1, "0"); // replacing matching characters into "0"
	                    sb2.replace(j,j+1,"0");
	                }
	            }
	        }
	 

	 
	        int x1=0;
	        int y1=0;
	      
	        s1 = sb1.toString();
	        s2 = sb2.toString();
	            for(int i=0;i<s1.length();i++){ //length of string to remove 0 and find the length
	                if(s1.charAt(i)!='0'){
	                    System.out.print(" "+s1.charAt(i));
	                    x1 +=1;
	                    
	                 }
	            }
	            System.out.println();
	            
	    
	            for(int i=0;i<s2.length();i++){
	            if(s2.charAt(i)!='0'){
	                System.out.print(" "+s2.charAt(i));
	                y1 +=1;
	                
	                }
	            } 
	            
	    }
	}

