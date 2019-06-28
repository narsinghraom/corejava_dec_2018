package com.vtalent.saritha;

import java.util.*;

public class ArrayListEx {
	
	public static void main(String []args){
		ArrayList l1=new ArrayList();
		l1.add("a");
		l1.add("saritha");
		l1.add(10);
		l1.add("A");
		l1.add(null);
		System.out.println(l1);
		l1.remove(2);
		l1.add(2,"m");
		l1.add("n");
		System.out.println(l1);
		l1.indexOf("n");
		System.out.println(l1);
		l1.get(1);
		System.out.println(l1);
	}

}
