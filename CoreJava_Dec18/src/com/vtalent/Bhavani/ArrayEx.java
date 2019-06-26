package com.vtalent.Bhavani;

        public class ArrayEx {
		static int[] iarray = new int[4];
		static float[] farray;

		public static void m1(float[] farray) {
			for (int i = 0; i <= farray.length - 1; i++) {
				iarray[i] = (int) farray[i];

			}
		}

		public static void main(String[] args) {
			farray = new float[4];
			for (int i = 0; i <= 3; i++) {
				farray[i] = 1.5f + i;

			}
		
			ArrayEx.m1(farray);
			System.out.println(ArrayEx.iarray);
			System.out.println(farray);
			for (int k = 0; k <= 3; k++) {

				System.out.println("i value" + iarray[k]);
				System.out.println("f value" + farray[k]);
			}

		}

	}

