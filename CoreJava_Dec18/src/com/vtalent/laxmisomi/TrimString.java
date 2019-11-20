package com.vtalent.laxmisomi;
import java.util.*;

public class TrimString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s,word;
		System.out.println("enter a string");
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		System.out.println("please enter a word to be deleted");
		word=sc.nextLine();
	//	s=s.replaceAll(word," ");
		s=s.replaceAll(word,"tirupatamma");
		System.out.println("string after replacement is" + " " + s);

	}

}
