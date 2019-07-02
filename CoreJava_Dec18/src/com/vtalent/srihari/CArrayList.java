package com.vtalent.srihari;

import java.util.ArrayList;
import java.util.Iterator;

public class CArrayList {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("sri");
		al.add("hari");
		al.add("Rowdy");
		al.add(2, "sowmya");
		al.remove(1);
		al.add("gg");
	al.set(0,"Raju");
		al.retainAll(al);
		Iterator it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}

	}
                                    
}