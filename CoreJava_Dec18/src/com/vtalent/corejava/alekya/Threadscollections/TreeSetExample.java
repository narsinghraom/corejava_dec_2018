package com.vtalent.corejava.alekya.Threadscollections;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<Integer> t1 = new TreeSet<Integer>();
		TreeSet<String> t2 = new TreeSet<String>();
		t1.add(20);
		t1.add(10);
		t1.add(40);
		t1.add(10);
		System.out.println(t1);
		
		t2.add("F");//BECOZ BY DEFAULT TREE SET WILL TAKE BY ASCENDING ORDER
		t2.add("D");
		t2.add("K");
		t2.add("A");
		System.out.println(t2);
		TreeSet<Integer> t3 = new TreeSet<Integer>();//	addAll
		t3.add(5);
		t3.add(100);
		t3.add(45);
		t3.add(10);
		t1.addAll(t3);
		  System.out.println("Values in ADDALL TreeSet: " +t1);
		 
		  TreeSet <Integer>treeSet1 = new TreeSet<Integer>();//clone():
		  TreeSet <Integer>treeSet2 = new TreeSet<Integer>();
		  treeSet1.add(3);
		  treeSet1.add(5);
		  treeSet1.add(5);
		  treeSet1.add(1);
		  treeSet1.add(2);
 treeSet2=(TreeSet<Integer>) treeSet1.clone();
System.out.println("Values in Cloned TreeSet:" +treeSet2);

		
		TreeSet <Integer>treeSetObject1 = new TreeSet<Integer>();//Object ceiling(Object o):

		  treeSetObject1.add(3);
		  treeSetObject1.add(5);
		  treeSetObject1.add(5);
		  treeSetObject1.add(1);

		System.out.println("Ceiling value of '5' is:" +treeSetObject1.ceiling(5));

		System.out.println("Ceiling value of '2' is:" +treeSetObject1.ceiling(2));

		TreeSet <Integer>t0 = new TreeSet<Integer>();//clear():
		t0.add(3);
		t0.add(5);
		t0.add(5);
		  t0.add(1);
		  t0.add(2);
		  System.out.println("Values in TreeSet:" +t0);
		  t0.clear();
		  System.out.println("Values in TreeSet:" +t0);
		  
		  TreeSet <Integer>trees = new TreeSet<Integer>();//Comparator comparator(): This method returns the object of Comparator Class which is used to order the elements, or it returns null if it is using natural ordering as shown in the following program
		  TreeSet <Integer>treeSetComparator = new TreeSet<Integer>();
		  trees.add(3);
		  trees.add(5);
		  trees.add(5);
		  trees.add(1);
		  trees.add(2);
		  treeSetComparator= (TreeSet<Integer>) trees.comparator();
		  System.out.println("Value in Tree Set Comparator: " +treeSetComparator);


	}

}
