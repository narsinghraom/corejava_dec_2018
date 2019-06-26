package com.vtalent.sukesh;

public class StringEx2 {

	public static void main(String[] args) {

		String Ss = "Vtalent info System info info System";
		String[] Ss1 = Ss.split("\\s");
		for (int i = 0; i < Ss1.length; i++) {
			int Cc = 0;
			int Cc1 = 0;
			for (int j = 0; j <= i; j++) {
				if (Ss1[i].equalsIgnoreCase(Ss1[j])) {
					Cc1++;
				}
			}
			if (Cc1 == 1) {
				for (int k = 0; k < Ss1.length; k++) {

					if (Ss1[i].equalsIgnoreCase(Ss1[k])) {
						Cc++;
					}
				}
				if (Cc != 1) {
					System.out.println(Ss1[i] + " " + Cc);

				}
			}
		}
	}
}
