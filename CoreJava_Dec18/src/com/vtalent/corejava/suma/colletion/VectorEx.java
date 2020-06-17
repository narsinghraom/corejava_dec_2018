package com.vtalent.corejava.suma.colletion;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
Vector<String> vl=new Vector<String>();
vl.add("Hi");
vl.add("Hello");
System.out.println(vl);
Enumeration<String> en= vl.elements();
while(en.hasMoreElements()){//it will check whether the elements are present in collection or not
	System.out.println(en.nextElement());
}
	}
}
