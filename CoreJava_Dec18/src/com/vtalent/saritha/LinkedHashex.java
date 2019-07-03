package com.vtalent.saritha;
import java.util.*;

public class LinkedHashex {
public static void main(String[] args) {
	LinkedHashSet lh=new LinkedHashSet();
	lh.add("b");
	lh.add("c");
	lh.add("d");
	lh.add("z");
	lh.add("null");
	lh.add(10);
	System.out.println(lh.add("k"));
	System.out.println(lh);
}
}
