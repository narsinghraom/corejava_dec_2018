package com.vtalent.sri;

import java.util.Scanner;

public class Repeatedcharacters {
	    private static Scanner s;
	        public static void main(String [] args) {
	            String n, a[];
	            int i,j,l;
	            System.out.println("Enter the string:");
	            s= new Scanner(System.in);
	            n=s.nextLine();
	            a=n.split("");
	            l = a.length;
	            for(i=0; i<l; i++){
	                for(j=i+1; j<l; j++){
	                    if(a[i].equals(a[j])) {
	                        System.out.println(a[i]);
	                    
	                    }
	                }
	            }
	        }
}

	      
