package com.vtalent.sukesh;

public class StringEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Scanner sc = new Scanner(System.in); String S = sc.nextLine()
		 */;
		String S = "Vtalent info System info info System";
		String[] S1 = S.split("\\s");
			for (int i = 0; i < S1.length; i++) {
			int Count = 0;
			int Count1 = 0;
			for (int j = 0; j <= i; j++) {
				if (S1[i].equalsIgnoreCase(S1[j])) {
					Count1++;
				}
			}
			if (Count1 == 1) {
				for (int k = 0; k < S1.length; k++) {

					if (S1[i].equalsIgnoreCase(S1[k])) {
						Count++;
					}
				}
				if (Count != 1) {
					System.out.println(S1[i] + " " + Count);

				}
			}
		}
	}
}
