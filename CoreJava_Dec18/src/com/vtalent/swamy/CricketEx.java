package com.vtalent.swamy;

import java.util.Scanner;

public class CricketEx {
public static void main(String[] args) throws Exception {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the team A name");
	String s=sc.next();
	System.out.println("Enter the team B name");
	String t=sc.next();
	System.out.println("Welcome to the ODI b/w " + s +" "+"vs"+" "+t);
	System.out.println("First innings by "+s);
	System.out.println("Is Raining yes/no");
	CricTest c=new CricTest();
	int k=c.teamA();
	int gh=c.teamB();
	System.out.println(k+"  "+gh);
	if(k>gh) {
		System.out.println("team A win"+k);
	}else if(k<gh) {
		System.out.println("team  B win"+gh);
	}else if(k==gh){
	System.out.println("match draw");
	}
}

 
	}


