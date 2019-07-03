package com.vtalent.naresh;
import java.util.*;
public class MapDemo {

	public static void main(String[] args) {
	//	Map<String,String>  m=new LinkedHashMap<> ();
			//insertion Order
			//Map<String,String>  m=new HashMap<> ();
				//Allows only one null key(No CT if more than 1)
				//No insertion Order
			
		//	Map<String,String>  m=new Hashtable<> ();
		Map<String,String>  m=new TreeMap<> ();
				//Does not Allow null values(RT Exception)
				//m.put(null, null);
			    //m.put(null, null);
			    m.put("Lang", null);
			    m.put("Name", "Naresh");
			    m.put("fav Colour", "b/w");
				m.put("fav sport","Cricket");
				m.put("fav Colour1", "b/b");
				
				
				//System.out.println(m);	// No insertion Order
				
			//	System.out.println(m.get("name"));		//Getting value by Key
			//	System.out.println(m.get("myname"));	//null
				
		
		  Set<String> s=m.keySet(); 
		  for(String s1:s) {
		  System.out.println(s1+":"+m.get(s1)); }
		 	
			//	Set<String> s=m.keySet();	
	
	}

}
