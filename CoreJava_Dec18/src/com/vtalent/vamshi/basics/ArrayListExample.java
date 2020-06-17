package com.vtalent.vamshi.basics;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("HI");
		al.add(new Integer(10));
		System.out.println(al);
        String name = (String) al.get(0);
        Object id= al.get(0);
        
        ArrayList<String> al1=new ArrayList();
        al1.add("HI");
        al1.add("Hello");
        String sl1=al1.get(0);
        al1.add(null);
        al1.add(2, "Bye");
        al1.remove(0);
        System.out.println(al1);
        ArrayList<String> al2=new ArrayList();
        al2.add("secondobject");
        al1.addAll(al2);
        Iterator<String> itr=al1.iterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        }
	}
}

