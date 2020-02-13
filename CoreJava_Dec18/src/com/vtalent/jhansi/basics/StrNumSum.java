package com.vtalent.jhansi.basics;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class StrNumSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pattern p=Pattern.compile("\\d+");
		Matcher m=p.matcher("page 14 of 99");
		   int temp=0;
	    while(m.find()) {
            String str=m.group();
            temp =temp+Integer.parseInt(str);
      	}System.out.println(temp);
//4  Extract the number from the string?(String msg="you are about to delete 300 tasks please confirm";
      	System.out.println("\"you are about to delete 300 tasks please confirm\"");
      	Pattern p1=Pattern.compile("\\d+");
      	Matcher m1=p1.matcher("you are about to delete 300 tasks please confirm");
      	while(m1.find())
      	{
      		System.out.println(m1.group());
      	}
      	
      	String str1="you are about to delete 300 tasks please confirm";
    	char[] ch=str1.toCharArray();
    	for(int i=0;i<str1.length();i++) {
    		if(ch[i]>='0' && ch[i]<='9') {
    			System.out.print(ch[i]);
    		}
    	}
}}
