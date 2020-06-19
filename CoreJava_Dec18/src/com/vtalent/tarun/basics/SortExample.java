package com.vtalent.tarun.basics;

import java.util.Arrays;
import java.util.Collections;

public class SortExample {

	public static void main(String[] args)

	{

		String arr[] = { "Atk","Tarun", "Kumar" };
		Arrays.sort(arr);
		System.out.printf("Modified arr[] : \n%s\n\n", Arrays.toString(arr));
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.printf("Modified arr[] : \n%s\n\n", Arrays.toString(arr));

	}
}
