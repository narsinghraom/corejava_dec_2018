package com.vtalent.corejava.alekya.Threads;
import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		Vector<String> v1= new Vector<String>();
		v1.add("Hi");
		v1.add("Hello");
		System.out.println(v1);//if prgm need thread safe go for vector if not arraylist both are same but diff is vector is synchronized
	Enumeration<String> en=v1.elements();
	while(en.hasMoreElements()){//it willcheck whether the elements present in collection or not
	//it is legacy we dont have any method to delete collection over here enumeration so we dont use this
	System.out.println(en.nextElement());
	}
	}

}
