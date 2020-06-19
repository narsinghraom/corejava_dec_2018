package com.vtalent.jhansi.basics;
import java.util.*;

public class ArrayListEg {

	public static void main(String[] args) {
		//Non generic
		ArrayList al = new ArrayList();
		al.add("Hi");
		al.add("Hello");
		al.add(new Integer(10));
		System.out.println(al);
		String name = (String) al.get(0);
		System.out.println(name);
		
		//generic
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Hello");
		al1.add("Hi");
		System.out.println(al1);
		
		//iterator
		
		Iterator<String> itr = al1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		//other methods
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("SecondObject");
		al1.addAll(al2);
		System.out.println(al1);
		al1.add(2, "bye");
		System.out.println(al1);
		al2.clear();
		System.out.println("clear()"+al2);
		al2=(ArrayList<String>) al1.clone();
		System.out.println("clone"+al2);
		List<String> al3 = new ArrayList<String>();
		al3=al2.subList(0, 2);
		System.out.println("Sublist al3"+al3);
		al3.remove(0);
		System.out.println("remove" + al3);
		al2.set(1,"set");
		System.out.println("set"+ al2);
		
		
		

	}

}
