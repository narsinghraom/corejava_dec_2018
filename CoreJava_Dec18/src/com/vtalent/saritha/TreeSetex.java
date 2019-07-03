package com.vtalent.saritha;
import java.util.*;

public class TreeSetex {
public static void main(String[] args) {
	TreeSet t=new TreeSet();
	t.add("a");
	t.add("b");
	t.add("c");
	t.add("x");
	t.add("l");
	
	//t.add(new Integer(10)); CLASS CAST EXCEPTION
	//t,add(null);      null pointer exception
	System.out.println(t);
}
}
