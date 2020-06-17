package com.vtalent.corejava.alekya1;

public class IntEx {
	public static void main(String[] args) {
		
		    String str = "www.fb.com";
		    String str1 = "w3resource.com";
		    int ctr = str1.codePointCount(1, 10);
		System.out.println("Original String : " + str);
		int val8 = str.codePointAt(5);
		int val9 = str.codePointAt(3);
		int val1 = str.codePointBefore(1);
		int val2 = str.codePointBefore(9);
		System.out.println("Character(unicode point) = " + val1);
		System.out.println("Character(unicode point) = " + val2);
		System.out.println("Character(unicode point) = " + val8);
		System.out.println("Character(unicode point) = " + val9);   
		System.out.println("Codepoint count = " +ctr);
		System.out.println();
		

}
}
