package com.vtalent.sneha;
import java.util.*;

public class Arraylist {
	public static void main(String args[]) 
	{  
		  ArrayList<String> list=new ArrayList<String>();  
		  list.add("singam");        
		  list.add("sneha");  
		  list.add("karthik");  
		  list.add("saritha");  
		  
		 
		  
		  //Iterator itr=list.iterator();  
		 // while(itr.hasNext()){  
		  // System.out.println(itr.next());
		  
		  for (String i:list){
			  System.out.println(i);
			  
		  }
		  }  

}