package com.vtalent.sukesh;

public class StringEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S = "Vtalentt info System";
		S = S.toLowerCase();
		String[] S1 = S.split(" ");
		for (int i = 0; i < S1.length; i++) {
			String S2 = S1[i];
			// System.out.println(S2);
			char[] C = S2.toCharArray();
			for (int j = 0; j < C.length; j++) {
				int Count = 0;
				for (int k = 0; k < C.length; k++) {
					if (C[j] == C[k]) {
						Count++;
					}
				}
				if (Count == 1) {
					System.out.print(C[j]);
				}
			}
			System.out.println("");
		}
	}
}
