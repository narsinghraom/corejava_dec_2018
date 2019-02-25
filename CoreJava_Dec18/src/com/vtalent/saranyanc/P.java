package com.vtalent.saranyanc;

public class P {
	int i, n=20, c = 0;

	public void function(int n) {

		for (i = 1; i <= n; i++) {
			if (n % i == 0)
				c++;

		}

		if (c == 2)

		{
			System.out.println("prime");
		}		
		else {
			System.out.println("not");
		}

	}

	public static void main(String[] args) {
		P p = new P();

		p.function(19);

	}
}
