package com.vtalent.sathyam.basics;
import java.io.*;

public class Mutable {
public static void main(String[] args)throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.print("enter sur name:");
	String sur=br.readLine();
	System.out.print("enetr mid name:");
	String mid=br.readLine();
	System.out.print("enter last name:");
	String last=br.readLine();
	//create string buffer object
	StringBuffer sb=new StringBuffer();
	//append sur ,last to sb
	sb.append(sur);
	sb.append(last);                                                                                                                                                        
	//insert mid after sur
	int n=sur.length();
	sb.insert(n, mid);
	System.out.println("Full name="+sb);
System.out.println("In reverse="+sb.reverse());	
}
}
