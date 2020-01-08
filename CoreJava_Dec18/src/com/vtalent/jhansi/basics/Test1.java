package com.vtalent.jhansi.basics;

public class Test1 {

	public static void main(String[] args) {
		Single s1=new Single();
		s1.function(5);
		System.out.println(s1.i+s1.j);
		Secondt s2=new Secondt();
		s2.function(5);
		s2.function(5, 4);
        System.out.println(s2.i+s2.j);
        Thirdt t = new Thirdt();
        t.function(5);
        System.out.println(t.k);
        System.out.println(t.j);
        System.out.println(t.k+t.j);
        System.out.println(s1.i+s2.j+t.k);
        }
	}
