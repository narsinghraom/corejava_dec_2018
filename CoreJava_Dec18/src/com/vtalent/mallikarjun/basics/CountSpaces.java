package com.vtalent.mallikarjun.basics;


	public class CountSpaces {
		public static void main(String[] args) {
			String s="This is Automation project Class";
			s=s.toLowerCase();
			char[] ch=s.toCharArray();
			int count=0;
					for(int i=0;i<s.length();i++) {
						if(ch[i]==' ') {
							count++;
						}
			}
					System.out.println("count space");
			System.out.println(count);
		}
	}
