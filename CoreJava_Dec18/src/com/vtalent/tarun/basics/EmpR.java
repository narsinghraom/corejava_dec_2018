package com.vtalent.tarun.basics;

import java.util.Scanner;

public class EmpR {

	static Scanner input = new Scanner(System.in);
	static int emparry[];
	static int num, temp, k, i;

	public int insert(int k) {

		System.out.println("enter " + k + " value");
		emparry[k] = input.nextInt();
		k = k + 1;
		System.out.println("k value is " + k + " value");
		return k;

	}

	public void delete() {
		System.out.println("del");
	}

	public void search() {
		System.out.println("search");
	}

	public static void main(String[] args) {
		int a;
		int k = 0;
		boolean x = false;
		System.out.println("enter number of employees to create");
		num = input.nextInt();
		emparry = new int[num];
		EmpR emp = new EmpR();

		temp = num;
		do {
			System.out.println("enter 1  insert");
			System.out.println("enter 2  Delete");
			System.out.println("enter 3  search");
			System.out.println("enter 4 for exit");
			a = input.nextInt();
			switch (a) {
			case 1:
				if (emparry.length > k) {
					k = emp.insert(k);

				} else {
					System.out.println("aray is full");

				}
				x = true;
				break;
			case 2:
				emp.delete();
				x = true;
				break;
			case 3:
				emp.search();
				x = true;
				break;
			case 4:
				x = false;
				break;
			default:
				System.out.println("invalid");
				x = true;
			}

		} while (x == true);
		for (i = 0; i < num; i++) {
			System.out.println(emparry[i]);

		}
	}

}