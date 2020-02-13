package com.vtalent.mallikarjun.basics;

public class StringSwapping {
		public static void main(String[] args) {
			String s1="hello";
			String s2="world";
			
			int l1,l2;
			l1=s1.length();
			l2=s2.length();
			
			System.out.println(s1+" "+s2);
			
			s1=s1+s2;
			s2=s1.substring(0,l1);
			s1=s1.substring(l1);
			System.out.println(s1+" "+s2);
			}
		}

