package com.vtalent.corejava.alekya1;

public class OffSet {
	public static void main(String[] args) {

		// initialize the StringBuffer object
		String str = new String("facebook.com(fb)");
		
		System.out.println( str);

		int index = 3;
		int codePointOffset = 9;

		System.out.println(str.offsetByCodePoints(index, codePointOffset));
        

}
}
