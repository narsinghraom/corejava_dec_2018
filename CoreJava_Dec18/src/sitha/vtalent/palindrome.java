package sitha.vtalent;

import java.util.*;

public class palindrome {

	public static void main(String[] args) {
		int r, temp = 0, n,a;
		Scanner in = new Scanner(System.in);
		System.out.println("enter a number");
		n = in.nextInt();
        a=n;
		while (n > 0) {
			r = n % 10;
			temp = (temp * 10) + r;
			n = n / 10;

		}
		if (a == temp)
			System.out.println(a +"palindrome");
		
		else
			System.out.println(a +"not a palindrome");
	}

}
