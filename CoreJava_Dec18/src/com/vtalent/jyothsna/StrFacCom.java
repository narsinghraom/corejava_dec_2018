package com.vtalent.jyothsna;

import java.util.Scanner;

public class StrFacCom {
	public static void main(String args[]){  
		Scanner sc = new Scanner(System.in); 
	
		System.out.println("Enter string you want check");
		        String str = sc.nextLine();
		        int len=str.length();
		        int i,fact=1;  
		         
		        for(i=1;i<=len;i++){    
		            fact=fact*i;    
		        }    
		          System.out.println(fact);
		          

}
}
