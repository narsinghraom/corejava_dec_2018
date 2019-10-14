package com.vtalent.java.mahesh;
import java.util.Scanner;
public class FactorialTask {
	 public static void main(String args[]){  
		 System.out.println("Enter any string ");
			Scanner sc = new Scanner(System.in);
			String S = sc.nextLine();
			int n=S.length();
			FactorialTask FactorialTask = new FactorialTask(); 
			FactorialTask.permute(S, 0, n - 1); 
	    } 
	    private void permute(String s, int l, int r) 
	    { 
	        if (l == r) 
	            System.out.println(s); 
	        else { 
	            for (int i = l; i <= r; i++) { 
	                s = swap(s, l, i); 
	                permute(s, l + 1, r); 
	                s = swap(s, l, i); 
	            } 
	        } 
	    } 
	    public String swap(String a, int i, int j) 
	    { 
	        char temp; 
	        char[] charArray = a.toCharArray(); 
	        temp = charArray[i]; 
	        charArray[i] = charArray[j]; 
	        charArray[j] = temp; 
	        return String.valueOf(charArray); 
	    }  
	 }