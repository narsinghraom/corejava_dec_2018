package com.vtalent.amreen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.vtalent.bhavani.ClientArraylist;

//import com.vtalent.bhavani.ClientArraylist;

public class EmployeeOperationsArraylist {

	// static Employee[] array;
	List<Employee> empref = new ArrayList<>();
	ClientArraylist c = new ClientArraylist();
	Employee emp1 = new Employee();
	Scanner input = new Scanner(System.in);

	// method to insert employee data
	public void insetData(Employee emp) {
		if (empref != null) {
			empref.add(emp);
			DBOperations db = new DBOperations();
			db.insertDataWithPreparedStatement(emp);
		}
	}

	public void printData() {
		Iterator itr = empref.iterator();
		while (itr.hasNext()) {

			Employee emp = (Employee) itr.next();
			System.out.println(emp);

		}
		if (!itr.hasNext()) {
			System.out.println("no data");
		}

	}

	public void updateData() {

		if (empref != null) {

			for (int i = 0; i <= empref.size() - 1; i++) {

				emp1 = empref.get(i);

			}
			System.out.println("enter id to be updated");

			int uid = input.nextInt();

			if (uid == emp1.getId()) {
				System.out.println("enter salary to be updated");

				emp1.setSalary(input.nextDouble());

			}

		} else {
			System.out.println("no data found! enter details of employee");
			try {
				c.addData();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		DBOperations db = new DBOperations();
		db.updateDataWithPreparedStatement(emp1);

	}

	public void searchData() {
		if (empref != null) {
			System.out.println("enter id to search");
			int sid = input.nextInt();
			/*
			 * for (int i = 0; i <= empref.size() - 1; i++) { emp1 =
			 * empref.get(i); if (sid == emp1.getId()) {
			 * 
			 * System.out.println("Id is: " + emp1.getId() + "\n Salary is: " +
			 * emp1.getSalary());
			 */

			DBOperations db = new DBOperations();
			db.search(sid);
			System.out.println("Database search result");
			List<Employee> r = db.search(sid);
			System.out.println("id  " + "" + "name  " + "" + "   salary  ");
			for (Employee emp : r) {
				System.out.println(emp.getId() + "   " + emp.getEname() + "  "
						+ emp.getSalary());
			}
		}

		else {
			System.out.println("data not found");
		}

	}

	public void DeleteData() {

		if (empref != null) {
			Employee emp1;
			for (int i = 0; i <= empref.size() - 1; i++) {
				emp1 = empref.get(i);
				System.out.println(emp1.getId());
			}
			System.out.println("enter id to be deleted");
			int del = input.nextInt();
			if (empref != null) {
				for (int i = 0; i <= empref.size() - 1; i++) {

					emp1 = empref.get(i);
					if (del == emp1.getId()) {
						empref.remove(i);
						System.out.println("deleted succesfully");
						DBOperations db = new DBOperations();
						db.deleteDataWithPreparedStatement(del);

					}

				}

			}
		} else {
			System.out.println("no data found! " + " please insert data first");
			try {
				c.addData();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void validateLoan() {

		if (empref != null) {

			for (int i = 0; i <= empref.size() - 1; i++) {

				emp1 = empref.get(i);

			}

			System.out.println("enter id to find loan eligibility");

			int uid = input.nextInt();
			for (int i = 0; i <= empref.size() - 1; i++) {

				emp1 = empref.get(i);
				if (uid == emp1.getId()) {
					double sal = emp1.getSalary();
					try {
						if (sal <= 10000) {
							throw new LoanException();
						} else {
							System.out.println("loan granted");
						}
					} catch (LoanException e) {
						System.out.println(e);
					}
				}

			}

		}

	}

}
