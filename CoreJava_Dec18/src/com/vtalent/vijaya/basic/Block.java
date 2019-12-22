package com.vtalent.vijaya.basic;

public class Block {
int i;
static float f1;
{
	f1=2.5f;
	System.out.println(f1);
}
{
	i=5;
	System.out.println(i);
}
public static void main(String[] args) {
	Block b1=new Block();
	System.out.println(b1.i);
	System.out.println(f1);
}
}
