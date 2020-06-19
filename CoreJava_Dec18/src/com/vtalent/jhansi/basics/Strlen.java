package com.vtalent.jhansi.basics;

public class Strlen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//WAP to find Length of String without inbuilt(String s="Helloree";)
				String helloWorld = "Helloree";
				System.out.println("length of Helloree string :" + getLengthOfStringWithCharArray(helloWorld));
			}

			public static int getLengthOfStringWithCharArray(String str) {
				int length = 0;
				char[] strCharArray = str.toCharArray();
				for (char ch : strCharArray) {
					length++;
					System.out.println("Characters : "+ch);
				}
				return length;
			}
	}


