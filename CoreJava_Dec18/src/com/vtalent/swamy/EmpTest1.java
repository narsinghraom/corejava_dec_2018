package com.vtalent.swamy;

import java.util.Scanner;

public class EmpTest1 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String s = "n";
			EmpExe1 ee = new EmpExe1();
			Scanner sc = new Scanner(System.in);
			do {
				System.out.println("1. insert Into Array");
				System.out.println("2.delete from my Array");
				System.out.println("3. Search an employee from my Array");
				System.out.println(" 4.Print All the employees from my Array");
				System.out.println("5.Exit");
				System.out.println("please choose your option");
				int i = sc.nextInt();
				if (i <= 5) {
					switch (i) {
					case 1:
						System.err.println(" insert Into Array " + ee.insert());
						break;
					case 2:

						System.out.println("delete" + ee.delete());
						break;
					case 3:
						System.out.println("search" + ee.searchEmployee());
						break;
					case 4:
						System.out.println("print all" + ee.disply());
						break;
					case 5:
						System.out.println("exit");
						System.exit(0);

						break;
					}
				} else
					System.out.println("please enter valid input option(between 1-5)");
				System.out.println("do you want to continue [y/n]");
				s = sc.next();
			} while (s.equals("y"));
			System.out.println("you enter the termination of program:::::: ");
		
		}

	}


