package com.vtalent.sukesh;

public class StringEx3 {

	public static void main(String[] args) {

		String Ss = "Vtalentt info System";
		Ss = Ss.toLowerCase();
		String[] Ss1 = Ss.split(" ");
		for (int i = 0; i < Ss1.length; i++) {
			String Ss2 = Ss1[i];
			char[] Cc = Ss2.toCharArray();
			for (int j = 0; j < Cc.length; j++) {
				int Cc1 = 0;
				for (int k = 0; k < Cc.length; k++) {
					if (Cc[j] == Cc[k]) {
						Cc1++;
					}
				}
				if (Cc1 == 1) {
					System.out.print(Cc[j]);
				}
			}
			System.out.println("");
		}
	}
}
