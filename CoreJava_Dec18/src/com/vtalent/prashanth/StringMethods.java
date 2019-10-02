package com.vtalent.prashanth;

public class StringMethods {

	public static void main(String[] args) {
		String s1 = "Prashanth_Reddy";
//		charAt Method
		char c1 = s1.charAt(0);
		System.out.println("Char at 0 position is: "+c1);
		char c2 = s1.charAt(9);
		System.out.println("Char at 9 position is: "+c2);
//		codePointAt Method
		int i1 = s1.codePointAt(5);
		System.out.println("Char value at 5 is: "+i1);
		int i2 = s1.codePointAt(9);
		System.out.println("Char value at 9 is: "+i2);
//		codePointBefore Method
		int i3 = s1.codePointBefore(9);
		System.out.println("Char value at 9 before is: "+i3);
//		codePointCount Method
		int i4 = s1.codePointCount(0, 10);
		System.out.println("codePointCount is: "+i4);
//		offsetByCodePoints Method
		int i5 = s1.offsetByCodePoints(11,2);
		System.out.println("offsetCodePoints String is: "+i5);
//		compareTo Method
		String s2 = "Prashanth";
		int i6 = s1.compareTo(s2);
		System.out.println("s1 and s2 strings compareTo: "+i6);
//		compareToIgnoreCase Method
		int i7 = s1.compareToIgnoreCase(s2);
		System.out.println("s1 and s2 strings compareToIgnoreCase: "+i7);
//		concat Method
		String st3 = s2.concat(" How").concat(" Are You?");
		System.out.println("String concatination: "+st3);
//		contains Method (boolean)
		System.out.println(s1.contains("Prashu"));
		System.out.println(s1.contains(s2));
//		contentEquals Method CharSequence (boolean)
		CharSequence cs = "Prashanth_Reddy";
		System.out.println("s1 and cs contentEquals: "+s1.contentEquals(cs));
		System.out.println("s2 and cs contentEquals: "+s2.contentEquals(cs));
//		contentEquals Method StringBuffer (boolean)
		StringBuffer sb = new StringBuffer("Prashanth");
		System.out.println("s1 and sb contentEquals: "+s1.contentEquals(sb));
		System.out.println("s2 and sb contentEquals: "+s2.contentEquals(sb));
		
//		getChars Method
		char[] c3 = new char[15];
		s1.getChars(2, 12, c3, 5);
		System.out.println("getChars Array is: ");
		for(int i=0;i<c3.length;i++) {
			System.out.print(c3[i]);
			System.out.print(" ");
		}
		System.out.println("");
//		getBytes Method
		byte[] b1 = new byte[15];
		s1.getBytes(4, 10, b1, 4);
		System.out.println("getBytes Array is: ");
		for(int i=0;i<b1.length;i++) {
			System.out.print(b1[i]);
			System.out.print(" ");
		}
		System.out.println(" ");
//		byte[] b2 = s1.getBytes();
//		for(int i=0;i<b2.length;i++) {
//			System.out.println(b2[i]);
//		}
		
	}
}
