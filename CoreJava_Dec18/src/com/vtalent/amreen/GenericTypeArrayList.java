package com.vtalent.amreen;

import java.util.ArrayList;
import java.util.List;

public class GenericTypeArrayList {

	public static void main(String[] args) {
		List<String> ref = new ArrayList<>();
		ref.add("amr");
		ref.add("amr");
		ref.add("sul");
		ref.add("hyd");
		ref.add(4, "new");
		ref.add(5, "new1");
		// to print size
		System.out.println("size is" + ref.size());
		System.out.println(ref);
		/*
		 * ref.remove(0); System.out.println(ref);
		 */
		ref.remove("hyd");
		System.out.println(ref);

		/*
		 * List<String> ref1 = new ArrayList<>(); ref1.add("1"); ref1.add("2");
		 * ref.addAll(ref1);
		 */

		for (String s : ref) {
			System.out.println(s);

		}
	}

}
