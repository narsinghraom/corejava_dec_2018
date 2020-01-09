package com.vtalent.sathish;
import java. util. Scanner;

public class AreaR {
	public static void main(String[] args) {
		/*float length = 4.5f;
		float width = 6.5f;
		float r = length*width;
		double length = 4.5;
		double width = 6.5;
		double area = length*width;*/  
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the value of length");
		double length = scanner.nextDouble();
		System.out.println("Enter the value of width");
		double width = scanner.nextDouble();
		double area = length*width;
		System.out.println("valu of Rectangle "+area);
	}

}
