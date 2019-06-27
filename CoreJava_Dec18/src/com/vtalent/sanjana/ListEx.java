package com.vtalent.sanjana;

import java.util.*;

public class ListEx {

	public static void main(String[] args) {
		
List<Object> al=new ArrayList<>();
List<Object> al1=new ArrayList<>();
List<Object> al2=new ArrayList<>(al1);
al.add("1");
al.add("sanju");
al.add("20.5f");
al.add("span");
al.add("sanju");
al2.addAll(al1);
al.remove("1");
al1.add("2");
al1.add("span");
al.addAll(1,al1);
al.set(3, "suma");

System.out.println(al.lastIndexOf("sanju"));
System.out.println();
System.out.println(al.indexOf("1"));
System.out.println(al.contains("sanju"));
System.out.println(al.get(0));
System.out.println(al.isEmpty());
System.out.println(al.size());
System.out.println(al);
System.out.println(al1);
System.out.println(al2);
System.out.println(al.subList(1, 4));
//al.clear();
//al.removeAll(al);
Iterator<Object> itr=al.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}
	}

}
