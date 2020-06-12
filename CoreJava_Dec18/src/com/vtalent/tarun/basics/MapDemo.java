package com.vtalent.tarun.basics;

import java.util.*;

public class MapDemo {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.nextLine();
		char[] x = s.toCharArray();
		int size = x.length;
/*
 * HashMap stores data in random sequence of i/p data
 * LinkedHashMap stores data in sequence as of given i/p data
 * TreeMap stores data in ascending alphabetical order
 */
		Map<Character,Integer> map = new TreeMap<>();
		int i = 0;
		while(i!=size) {
			if(map.containsKey(x[i]) == false) {
				map.put(x[i],1);
			}
			else {
				int ol = map.get(x[i]);
				int nl = ol+1;
				map.put(x[i],nl);
			}
			++i;
		}
		Set<Map.Entry<Character, Integer>> hmap = map.entrySet();
		for(Map.Entry<Character, Integer> data : hmap) {
			if(data.getValue()>1) {
				/*to get repeated chars in string:
				 * System.out.print(data.getKey() +"\t"); 
				 * System.out.println(data.getValue());
				 */
				System.out.println("No unique chars in data");
				System.exit(0);
			}
			System.out.print(data.getKey() +"\t");
			System.out.println(data.getValue());
		}
		System.out.println("Data contains unique chars :)");
		
	}

}
