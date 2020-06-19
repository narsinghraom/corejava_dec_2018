package com.vtalent.mallikarjun.basics;



import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class hashsetex {

	public static void main(String[] args) {

		Set<String> set1 = new HashSet<String>();
		String s1 = "Vtalent";
		String s2 = "Info";
		String s3 = "Vtalent";
		System.out.println("hashcode vales of the strings are s1 = " + s1.hashCode() + " s2 = " + s2.hashCode()
				+ " s3 =" + s3.hashCode());
		set1.add(s1);
		set1.add(s2);
		set1.add(s3);
		set1.add(null);
		set1.add(null);
		System.out.println(set1);
		Iterator<String> itr = set1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		if (null != set1 && !set1.isEmpty()) {
			for (String s : set1) {
				System.out.println(s);
			}

		}
	}

}


