package com.vtalent.corejava.alekya.Threadscollections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedLi{
	   public static void main(String args[]){

	     LinkedList<String> list=new LinkedList<String>();

	     //Adding elements to the Linked list
	     list.add("Sita");
	     list.add("Geetha");
	     list.add("Ram");
	     list.addFirst("Seetha");//Adding an element to the first position
	     list.addLast("Ramudu");//Adding an element to the last position
	     list.add(2, "laxman");//Adding an element to the 3rd position

	     //Iterating LinkedList
	     Iterator<String> iterator=list.iterator();
	     while(iterator.hasNext()){
	       System.out.println(iterator.next());
	     }
	     
	     LinkedList<String> li4 = new LinkedList<String>();

	       li4.add("Item1");
	       li4.add("Item5");
	       li4.add("Item3");
	       li4.add("Item6");
	       li4.add("Item2");
	   System.out.println("Linked List Content:"+li4);

	       
	       li4.addFirst("First Item");
	       li4.addLast("Last Item");
	       System.out.println("LinkedList Content after addition: " +li4);

	       Object firstvar = li4.get(0);
	       System.out.println("First element: " +firstvar);
	       li4.set(0, "Changed first item");
	       Object firstvar2 = li4.get(0);
	       System.out.println("First element after update by set method: " +firstvar2);

	       
	       li4.removeFirst();
	       li4.removeLast();
	       System.out.println("LinkedList after deletion of first and last element: " +li4);

	       
	       li4.add(0, "Newly added item");
	       li4.remove(2);
	       System.out.println("Final Content: " +li4);
	   
	     
	     
	     
  LinkedList<String> list1=new LinkedList<String>();//remove
	      list1.add("Steve");
	      list1.add("Carl");
	      list1.add("Raj");
	      list1.add("Negan");
	      list1.add("Rick");
	      list1.removeFirst();//Removing First element
	      list1.removeLast();//Removing Last element

	      //Iterating LinkedList
	      Iterator<String> it=list1.iterator();
	      while(it.hasNext()){
	         System.out.print(it.next()+" ");
	      }
	      list1.remove(1);//removing 2nd element, index starts with 0

	      System.out.print("After removing second element: ");
	      //Iterating LinkedList again
	      Iterator<String> iterator2=list1.iterator();
	      while(iterator2.hasNext()){
	         System.out.print(iterator2.next()+" ");
	      }

	     	   } 
	} 
