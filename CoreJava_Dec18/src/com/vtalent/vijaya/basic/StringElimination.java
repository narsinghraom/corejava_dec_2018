package com.vtalent.vijaya.basic;

import java.util.Scanner;
public class StringElimination {

		 static int MAX = 26; 
		    
		    static void findAndPrintUncommonChars(String str1, String str2)  
		    { 
		        int present[] = new int[MAX]; 
		        for (int i = 0; i < MAX; i++)  
		        { 
		            present[i] = 0; 
		        } 
		  
		        int l1 = str1.length(); 
		        int l2 = str2.length(); 
		        for (int i = 0; i < l1; i++) 
		        { 
		            present[str1.charAt(i) - 'a'] = 1; 
		        }
		        for (int i = 0; i < l2; i++) 
		        { 
		            if (present[str2.charAt(i) - 'a'] == 1 || present[str2.charAt(i) - 'a'] == -1)  
		            { 
		                present[str2.charAt(i) - 'a'] = -1; 
		            }  
		              
		            // else mark its presence as 2 
		            else
		            { 
		                present[str2.charAt(i) - 'a'] = 2; 
		            } 
		        } 
		  
		        for (int i = 0; i < MAX; i++) 
		        { 
		            if (present[i] == 1 || present[i] == 2)  
		            { 
		                System.out.print((char) (i + 'a') + " "); 
		            } 
		        } 
		    } 
		  
		    // Driver code 
		    public static void main(String[] args)  
		    { 
		    	Scanner scan=new Scanner(System.in);
		        String str1,str2; 
		        System.out.println("please enter string 1");
		        str1=scan.next();
		        System.out.println("please enter string 2");
		        str2=scan.next();
		        
		        findAndPrintUncommonChars(str1, str2); 
		    } 
		}





