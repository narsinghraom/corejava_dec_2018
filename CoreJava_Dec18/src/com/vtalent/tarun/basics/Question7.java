package com.vtalent.tarun.basics;

public class Question7 {

	public static void main(String[] args) {

		/*
		 * String str = "Tarun"; int i = (int) str;
		 */

		String str = "Java";
		StringBuffer sb = new StringBuffer();
		Object ob = str;
		String str1 = (String)ob;
		StringBuffer sb1 = (StringBuffer)ob;
		System.out.println(ob);
	}

}
