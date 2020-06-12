package com.vtalent.tarun.basics;

public class EqlOrNo {
	public static void main(String[] args) {
		Integer i = 127;
		Integer j = 127;
		System.out.println(i== j);
		
		Integer k = 128;
		Integer l = 128;
		System.out.println(k == l); //false because IntegerCache size range is -128 to 127
		/*
		 * To fix this:
		 * we can change size via run as > run config > Arguements > Enter this in VM Arguements:
		 * >>>>>>   [     -XX:AutoBoxCacheMax=256    ] <<<<<< (Instead of 256 enter any desired int value;
		 */
	}

}
