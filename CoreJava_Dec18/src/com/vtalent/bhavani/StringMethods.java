package com.vtalent.bhavani;

import java.util.Arrays;
import java.util.Collections; 
public class StringMethods {
			public static void main(String[] args) {
				
				String str1 = "hhhai";
				String str2 = "  Welocme to java";
				String str3 = "hai";
				String str4 = "Hai";
				String str5 = "";
				String str6="                        hai this is bhanu";
				String str7=new String("hai");
				String str8=new String("hai");
				
				String a="vnk";
				String b="bhanu";
				// 1.charAt() Method
				char ch = str1.charAt(2);
				System.out.println("character at zero index:" + ch);
				// 2. concat Method
				System.out.println(str1.concat(str2));
				
				//3. Equals Method
				System.out.println("Equals");
				System.out.println(str1.equals(str3));
				System.out.println(str1.equals(str2));
				System.out.println(str7.equals(str8));
				
				// == Method
				System.out.println("==");
				System.out.println(str1 == str7);
				System.out.println(str1 == str3);
				System.out.println(str7 == str8);
				// 4.equalsIgnoreCase Method
				System.out.println(str1.equalsIgnoreCase(str2));
				
				// 5.isEmpty method
				System.out.println("isEmpty method");
				System.out.println(str5.isEmpty());
				System.out.println(str4.isEmpty());
				//6.length method
				System.out.println("LENGTH");
				System.out.println(str1.length());
				//7.replace Method
				System.out.println("REPLACE");
				System.out.println(str1.replace(str1,str2));
				System.out.println(str1.replace('h','c'));
				//8.subString Method
				System.out.println("SUB STRING");
				System.out.println(str2.substring(3));
				System.out.println(str2.charAt(3));
				//System.out.println(str2.subSequence('j','a'));IndexOutOfBoundException
				System.out.println(str2.substring(4, 9));
				//9.ToLowercase method
				System.out.println("ToLowercase method");
				System.out.println(str2.toLowerCase());
				//10.ToUpperCase
				System.out.println("ToUpperCase");
				System.out.println(str2.toUpperCase());
				//11.Trim Method
				System.out.println("Trim Method");
				System.out.println(str6.trim());
				//12.CompareTo
				System.out.println("compareTo");
				System.out.println(b.compareTo(a));
				
				String[] arr = {"ravi","bhanu","venky","raju"}; 
				 Arrays.sort(arr,Collections.reverseOrder());
				 System.out.println("After sorting:" +Arrays.toString(arr));
		        // Sorts arr[] in descending order 
				 System.out.println("by using Array");
				  Arrays.sort(arr); 
				  System.out.println("After:"+Arrays.toString(arr));
		       //IndexOf
				  System.out.println("indexof");
				  System.out.println(str1.indexOf('i'));
		        
		                         
		}
}