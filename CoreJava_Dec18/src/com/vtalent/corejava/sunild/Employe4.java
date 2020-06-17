package com.vtalent.corejava.sunild;


import java.util.Scanner;

public class Employe4 {
	int id;
	int age;
	float salary;
	String name;

	public void addEmploye() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert Name");
		name = sc.nextLine();
		System.out.println("Insert id");
		id = sc.nextInt();
		System.out.println("Insert Age");
		age = sc.nextInt();
		System.out.println("Insert salary");
		salary = sc.nextFloat();

	}

	public static int getMenu() {
		int op;
		Scanner sc = new Scanner(System.in);
		op = sc.nextInt();
		return op;
	}

	public static void menu() {
		System.out.println("1: Insert a Employe");
		System.out.println("2: Search All");
		System.out.println("3: Search Employe");
		System.out.println("4: Update an Employe");
		System.out.println("5: Delete an Employe");
		System.out.println("6: Exit");
	}

	public void details() {
		System.out.println("Employe id is:" + id);
		System.out.println("Employe age is:" + age);
		System.out.println("Employe name is:" + name);
		System.out.println("Employe salary is:" + salary);
		System.out.println();
	}
	/*
	 * public static void SearchEmploye() { int res=0; Scanner sc = new
	 * Scanner(System.in); System.out.println("Enter Employe id to Search:"); res =
	 * sc.nextInt(); for(int i=0;i<input.length;i++) { if(res==input[i]) {
	 * System.out.println("Employe found at: " +input[i]);
	 * 
	 * }else { System.out.println("No data found"); } }
	 */

	public static void main(String[] args) {
		int option = 0;
		Employe4 obj = new Employe4();
		Employe4 emp[] = new Employe4[2];
		for (int i = 0; i < emp.length; i++) {
			emp[i] = new Employe4();

		}
		do {
			menu();
			option = getMenu();
			switch (option) {
			case 1:// inserting employee details
				System.out.println("Adding Employe");
				for (int i = 0; i < emp.length; i++)
					emp[i].addEmploye();
				break;
			case 2:// Search All
				String names;
				System.out.println("See All Employee Names:");
				names = obj.regionMatchs(obj.name);
				System.out.println(names);
				
				System.out.println("Searching All");
				for (int i = 0; i < emp.length; i++) {
					if (emp[i] == null) {
						System.out.println("No data Found");
					} else {
						emp[i].details();
					}
				}
				break;
			case 3:// Search employee
				System.out.println("Enter Employe id ");
				System.out.println();
				int res;
				Scanner sc = new Scanner(System.in);
				res = sc.nextInt();
				System.out.println("Searching Employe");
				System.out.println();
				for (int i = 0; i < emp.length; i++) {
					if (emp[i].id == (res)) {
						System.out.println("Employe found at:" + emp[i]);
						emp[i].details();

					}

				}
				break;
			case 4:// updating
				int out;
				int temp, x, res1;
				System.out.println("Updating an Employe");
				System.out.println("Enter Employe id:");
				Scanner in = new Scanner(System.in);
				out = in.nextInt();

				for (int i = 0; i < emp.length; i++) {
					if (emp[i].id == out || emp[i].age == out || emp[i].salary == out) {
						System.out.println("Select details to update");
						if (emp[i] == null) {
							System.out.println("No data");
						} else {
							System.out.println("Enter value :");
							x = in.nextInt();
							temp = i;
							if (emp[i].id == x) {
								emp[i].id = temp;
								System.out.println("The id is: " + emp[i]);
								emp[i].details();
							} else if (emp[i].age == out) {
								emp[i].age = temp;
								System.out.println("The age is: " + emp[i]);

							}

							else {
								emp[i].salary = temp;
								System.out.println("The salary is: " + emp[i]);
							}
							System.out.println();
						}

					}

				}
				break;
			case 5:// deleting employee
				int em;
				int currentlen = emp.length;
				Scanner inp = new Scanner(System.in);
				System.out.println("Enter employe id to delete:");
				em = inp.nextInt();
				for (int i = 0; i < emp.length; i++) {
					if (emp[i] != null && emp[i].id == em) {
						// emp[i]=null;

						emp[i] = emp[currentlen - 1];
						currentlen--;
						System.out.println("deleted:" + emp[i]);
						emp[i].details();
						System.out.println();
						break;
					}
					if (i == emp.length - 1) {
						System.out.println("There is No person");

					}

				}

				break;
			case 6:
				System.out.println("press any button to terminate");
				break;
			default:
				System.out.println("Enter valid input");
			}

		} while (option != 6);

	}

	private String regionMatchs(String name2) {
		// TODO Auto-generated method stub
		return null;
	}
}
