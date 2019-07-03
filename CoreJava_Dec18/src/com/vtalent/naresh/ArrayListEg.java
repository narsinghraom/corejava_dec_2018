package com.vtalent.naresh;
import java.util.*;
public class ArrayListEg {
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		ArrayList all=new ArrayList();
		List<String> aint=new ArrayList<String>();
			aint.add("2");
		//aint.add("hi"); //CT
			aint.add("5");
			aint.add("10");
			aint.add("8");
			al.add("Hi Oliver");
			al.add(null);
		//	al.add(1, "int type");	//storing index based
			al.add(null);
			al.add(3);
			al.add(1);
			al.add(2);
			all.add("this is other object");
			//al.addAll(all);	
			al.add(4);
			al.add("Hi Oliver");
			//int i=al.lastIndexOf("Hi Oliver");	//specifies the index value of an object which recently added)
			//int j=al.indexOf("Hi Oliver");	//specifies the index value of an object which occurred at first )
			//System.out.println("First Index of Oliver is- "+j);
			//System.out.println("Last Index of Oliver is- "+i);
			//System.out.println(al);

		/*
		 * for(Object obj :al) { System.out.println("by for each loop:"+obj); }
		 */
		/*
		 * Iterator itr=al.iterator(); while(itr.hasNext()) {
		 * System.out.println(itr.next()); }
		 */
		//aint.clear();
		/*
		 * Object obj= al.get(3); String s="hi"; int t=10; //int iz=(int)obj;
		 * aint.removeAll(aint);
		 */	
			/*
		 * Iterator itr1=aint.iterator(); System.out.println("hi");
		 * while(itr1.hasNext()) { System.out.println(itr1.next()); }
		 */	
			
			System.out.println(al.size());
			System.out.println(al.get(8));
		//	System.out.println(al);
			//al.add(8, 5);
			//System.out.println(al);
			//System.out.println(al.size());
		/*
		 * ListIterator lt=al.listIterator(); while(lt.hasPrevious()) { //int
		 * q=lt.nextIndex(); System.out.println("hi"); //System.out.println(q); }
		 */
	
	
	}	

}
