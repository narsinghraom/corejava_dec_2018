 package com.vtalent.java.venkatesh;

    class StringExample1 {
    	//returns the char value
    static String s="venkatesh";
    static char c=s.charAt(0);
	static char c1=s.charAt(1);
	static char c2=s.charAt(3);
	static char c4=s.charAt(4);
	//codepointAt
    static int i=s.codePointAt(4);
    //codepointBefore
    static int l=s.codePointBefore(4);
    }
	class StringExample extends StringExample1{
	public static void main(String[] args) {
		 StringExample1 e=new StringExample1();
		System.out.println("char at 0 is. "+c);
		System.out.println("char at 1 is. "+c1);
		System.out.println("char at 3 is. "+c2);
		System.out.println("char at 4 is. "+c4);
		System.out.println("char value="+i);
		System.out.println("char value="+l);
		//System.out.println("string="+s);
		//codePointCount
		int cpc=s.codePointCount(0,8);
		System.out.println("cout="+cpc);
		//compareTo 
		//compareToIgnoreCase
		String st="venky";
		String st1="Venky sonu";
		int i1= st.compareTo(st1);
		int i2=st.compareToIgnoreCase(st1);
		System.out.println("st and st1 comparision="+i1);
		System.out.println("st and st1 compareToIgnoreCase="+i2);
		//string concatenation
		String st2="hi";
		st2=st2.concat(" how").concat(" are you");
		System.out.println(st2);
		//content method(boolean)
		System.out.println(st1.contains("sonu"));
		System.out.println(st1.contains("the"));
		//contentEquals charSequence
		CharSequence cs="venky";
		System.out.println("charsequence="+st.contentEquals(cs));
		System.out.println("charsequence="+st2.contentEquals(cs));
		//contentEquals stringBuffer
		StringBuffer sb=new StringBuffer("venky");
		System.out.println("stringbuffer="+st.contentEquals(sb));
		System.out.println("stringbuffer="+st1.contentEquals(sb));
		//copyValueOf(char[] data)
		char[] data= {'v','e','n','k','y'};
		String str="Text";
		str=str.copyValueOf(data);
		System.out.println("str copyvalue="+str);
		//	copyValueOf(char[] data, int offset, int count)
		str=str.copyValueOf(data, 2, 2);
		System.out.println("str copy valu="+str);
		//endsWith(String suffix)
		boolean b=st.endsWith("y");
		boolean b1=st1.endsWith("n");
		System.out.println("st ends with y="+b);
		System.out.println("st1 ends with n="+b1);
		//equals(Object anObject)
		String str1="venky";
		System.out.println(st.equals(st1));
		if(st.equals(str1)) {
		System.out.println("strings are equal");
		}else
			System.out.println("strings are unequal");
		}
}
