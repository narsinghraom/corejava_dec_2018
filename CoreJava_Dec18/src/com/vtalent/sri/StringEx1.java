package com.vtalent.sri;

public class StringEx1 {
	public static void main(String[] args) {
		String s1="123";
		int k=0;
		Integer i1=new Integer(s1);
		System.out.println(i1);
		k=i1.intValue();
		System.out.println(k);
		k=Integer.parseInt(s1);
		System.out.println(k);
		k=k+100;
		System.out.println(k);
		Integer iObj=new Integer(k);
		System.out.println(iObj);
		s1=iObj.toString();
		System.out.println(s1);
		
	}

}
