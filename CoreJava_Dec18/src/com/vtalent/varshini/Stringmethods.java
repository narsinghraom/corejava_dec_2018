package com.vtalent.varshini;

public class Stringmethods {
	
		public static void main(String[] args) {
			String String = "Java is fun to learn";
			String s1= "JAVA";
			String s2= "Java";
			String s3 = "  Hello Java  ";
			
			System.out.println("Char at index 2(third position): " + String.charAt(2));
			System.out.println("After Concat: "+ String.concat("-Enjoy-"));
			System.out.println("Checking equals ignoring case: " +s2.equalsIgnoreCase(s1));
			System.out.println("Checking equals with case: " +s2.equals(s1));
			System.out.println("Checking Length: "+ String.length());
			System.out.println("Replace function: "+ String.replace("fun", "easy"));
			System.out.println("SubString of targetString: "+ String.substring(8));
			System.out.println("SubString of targetString: "+ String.substring(8, 12));
			System.out.println("Converting to lower case: "+ String.toLowerCase());
			System.out.println("Converting to upper case: "+ String.toUpperCase());
			System.out.println("Triming string: " + s3.trim());
			System.out.println("searching s1 in targetString: " + String.contains(s1));
			System.out.println("searching s2 in targetString: " + String.contains(s2));

			char [] charArray = s2.toCharArray();
			System.out.println("Size of char array: " + charArray.length);
			System.out.println("Printing last element of array: " + charArray[3]);

		}

	}



