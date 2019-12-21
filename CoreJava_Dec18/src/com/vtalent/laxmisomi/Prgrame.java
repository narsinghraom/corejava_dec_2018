package com.vtalent.laxmisomi;


public class Prgrame
   {
    public static void main(String[] args)
    {
        String[] s1 = {"ONE", "TWO", "THREE", "FOUR"};
 
        String[] s2 = {"THREE", "TWO", new String("ONE")};
 
        System.out.println(s1[0] == s2[2]);
 
        System.out.println(s1[1] == s2[1]);
 
        System.out.println(s1[2] == s2[0]);
    }
 }
