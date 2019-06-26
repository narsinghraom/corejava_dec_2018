package com.vtalent.sneha;

public class Yikes {
    public static void go(long z) {System.out.println("Long ");}
    public static void go(short n) {System.out.println("Short ");}
    public static void go(int n) {System.out.println("int ");}

    public static void main(String [] args) {
        short y = 6;
        long z = 7;
        go(y);
        go(z);
    }


}
