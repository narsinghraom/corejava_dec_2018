package com.vtalent.mamathasri1;

import java.io.*;
import java.util.*;
class GFG
{
	public static void main(String args[]) {
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("practice. to arraytlist");
		a1.add("Quiz. geeks for geeks.org");
		a1.add("code. geeks for geeks.org");
		a1.add("contribute. for geeks for geks");
	System.out.println("ArrayList Elements are");
	Iterator it =a1.iterator();
	while (it.hasNext()) {
	      System.out.println(it.next());
	      Vector<String> v=new Vector<String>();
	      v.addElement("practice");
	      v.addElement("Quiz");
	      v.addElement("code");
          System.out.println("/n vector elements are");
          Enumeration e = v.elements();
          
     while(e.hasMoreElements()) {
           System.out.println(e.nextElement());
     }
	}
	}
}

