package com.vtalent.mallikarjun.basics;

import java.util.Arrays;

public class CountWords1 {
		public static void main(String[] args) {
			String s="This is Automation project Class";
			s=s.toLowerCase();
			String[] str=s.split(" ");
			int count=0;
			System.out.println(Arrays.toString(str));
			for(int i=0;i<str.length;i++) {
				count++;
			}
			System.out.println(count);
		}
		}
