package com.vtalent.sri;

public class Stars {
public static void main(String[] args) {
	int row,numberOfStars;
	for(row=0;row<=10;row++){
		for(numberOfStars=0;numberOfStars<=row;numberOfStars++){
			System.out.print("*");
		}
		System.out.println();
	}
}
}
