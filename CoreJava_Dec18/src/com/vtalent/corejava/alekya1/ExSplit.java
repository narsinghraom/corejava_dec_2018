package com.vtalent.corejava.alekya1;

public class ExSplit {
	public static void main(String args[]){  
		String str ="My name is Alekya your name is ALEKYA aaa BBB";
		String[] arr=str.split(" ");
		for(String s : arr)
			System.out.println(s);
		
}
}
