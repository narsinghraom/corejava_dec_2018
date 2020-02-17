package com.vtalent.vijaya.basic;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Test30 {
     public static void main(String[] args) {
			int count=0;
			Pattern p=Pattern.compile("\\w+");
			Matcher m=p.matcher("We joined in Vtalent Company as a Traniee, Vtalent is Very Good company\r\n" + 
					"   Vtalent provides many services. ");
		   String temp="Vtalent";
			while(m.find()) {
	     String str=m.group();
		 if(str.equals(temp)) 
			 count++;
		 }
		System.out.println(count);

			}
		}

