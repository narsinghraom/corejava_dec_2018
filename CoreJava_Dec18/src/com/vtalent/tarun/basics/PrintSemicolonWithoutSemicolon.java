package com.vtalent.tarun.basics;

import java.util.*;

public class PrintSemicolonWithoutSemicolon {

	public static void main(String[] args) {
		/*
		 * @SuppressWarnings("resource") Scanner s = new Scanner(System.in); 
		 * while(true) { 
		 * System.out.println("Enter a number:");
		 * int n = s.nextInt();
		 * char a = (char) n;
		 * if (System.out.append("Output for char code " + n + "= " + a +
		 * "\n") == null) { } }
		 */
		String line1 = "Humpty Dumpty sat on a wall.";
		String line2 = "Humpty Dumpty had a great fall.";
		String rhyme = line1 + System.getProperty("line.separator") + line2;
		System.out.println(rhyme);

		Random rd = new Random(); // creating Random object
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(); // storing random integers in an array
		}
		System.out.println(Arrays.toString(arr));// printing each array element
		int rnd = new Random().nextInt(arr.length);
		System.out.println(arr[rnd]);
		
		
	}

}