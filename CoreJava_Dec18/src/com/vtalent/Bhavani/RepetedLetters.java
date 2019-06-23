package com.vtalent.Bhavani;

public class RepetedLetters {
	 public static void repeatedLetters(){
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
	     
	     public static void main(String[] args) {
	    	 repeatedLetters();
		}
}
