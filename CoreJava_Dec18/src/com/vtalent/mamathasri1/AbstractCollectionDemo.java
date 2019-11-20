package com.vtalent.mamathasri1;
import java.util.*;
import java.util.AbstractCollection;
public class AbstractCollectionDemo {
	public static void main(String args[]) {
		AbstractCollection<String> abs1=new TreeSet<String>();
		abs1.add("welcome");
		abs1.add("to");
		abs1.add("java");
		abs1.add("vtalent");
		System.out.println("Abstraction"+abs1);
	 AbstractCollection<String> abs2 = new TreeSet<String>(); 
	 abs2.addAll(abs1);   
     System.out.println("AbstractCollection 2: " + abs2); 
     abs1.clear();
     System.out.println("Is the collection empty? "
             + abs1.isEmpty()); 
	}

}
