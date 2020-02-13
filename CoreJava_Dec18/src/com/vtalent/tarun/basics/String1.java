package com.vtalent.tarun.basics;

public class String1 {

	public static void main(String[] args) {
		String s1 = "Tarun";
		String s2 = "java";
		String s3 = "this is demo";
		int a = 69;
		boolean x = true;
		
		
		System.out.println(s1+10*2);
		System.out.println(s1.concat(s2));
		
		System.out.println(String.join("$$$$",s1,s2 ));
		System.out.println("U iz pro");
		System.out.println(s1.subSequence(0, 3));
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(0, s1.length()-s2.length()));
		s1 = s1.replaceAll(s1, "java");
		s2 = s2.replaceAll(s2, "Tarun");
		System.out.println("=========================");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("=========================");
		System.out.println(s3.replace("is", "was"));
		System.out.println(s3.replaceFirst("is", "was"));
		System.out.println(s3.replaceAll("is(.)", "was"));
		System.out.println(s3.replaceAll("is(.*)", "was"));
		System.out.println("=====================");
		System.out.println(s2.contains("run"));
		System.out.println("=====================");
		String s4 = String.valueOf(a);
		String s5 = String.valueOf(x);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println("---------------------------------");
		StringBuffer sb = new StringBuffer("Tarun");
		
		//System.out.println(sb.insert(5, "XOXO"));
		sb.ensureCapacity(100);
		sb.append("Kumar");
		sb.trimToSize();
		System.out.println(sb.capacity());
	}
	

}
