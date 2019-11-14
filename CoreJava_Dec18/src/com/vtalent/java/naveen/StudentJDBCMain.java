package com.vtalent.java.naveen;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentJDBCMain {
	static Scanner sc = new Scanner(System.in);

	PreparedStatement pst;
	ResultSet rs;
	/*
	 * public StudentJDBCMain(){ con=SudentJDBCcon.getconnection(); }
	 */
	static StudentBeanJDBC sbj = null;

	public static void main(String[] args) throws SQLException {

		StudentJDBCMain sjd = new StudentJDBCMain();

		String s;
		do {
			System.out.println("1. insert Into DB");
			System.out.println("2.delete from my  DB");
			System.out.println("3. Search an employee from my  DB");
			System.out.println("4.Print All the employees from my  DB");
			System.out.println("5.update Student");
			System.out.println("6.Exit");
			System.out.println("please choose your option");
			int i = sc.nextInt();
			if (i <= 6) {
				switch (i) {
				case 1:// sjd.insert();
					sjd.insert2data();
					break;
				case 2:
					sjd.delete();
					break;
				case 3:
					;
					break;
				case 4:
					sjd.display();
					break;
				case 5:
					sbj = new StudentBeanJDBC();
					sbj.setId(sc.nextInt());
					System.out.println("please enter name");
					sbj.setName(sc.next());

					sjd.updatedata(sbj);
					break;
				}

			}
			System.out.println("Do you want to continue..");
			s = sc.next();
		} while (s.equalsIgnoreCase("y"));
		System.out.println("terminated::::...");
	}

	public void insert() {
		Connection con = SudentJDBCcon.getconnection();
		sbj = new StudentBeanJDBC();
		System.out.println("insert data");

		System.out.println("please enter sno ");
		sbj.setId(sc.nextInt());
		System.out.println("please enter name");
		sbj.setName(sc.next());
		System.out.println("please enter roll number");
		sbj.setRoll(sc.nextInt());
		Statement st;
		int i = 0;
		try {
			st = con.createStatement();
			String sql = "insert into student(id,name,roll)  values(" + sbj.getId() + ",'" + sbj.getName() + "',"
					+ sbj.getRoll() + ")";
			i = st.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (null != con) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		if (i > 0) {
			System.out.println("success");
		}

	}

	public void delete() {
		int i = 0;
		Connection con = SudentJDBCcon.getconnection();
		try {
			Statement st = con.createStatement();
			String sql = "select * from student";
			rs = st.executeQuery(sql);
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getInt(3));
			}
			System.out.println("enter delete sno");
			String str = "delete from student where id=" + sc.nextInt();
			i = st.executeUpdate(str);
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (i > 0) {
			System.out.println("deleted");
		}
	}

	public void insert2data() throws SQLException {
		StudentBeanJDBC sbj = new StudentBeanJDBC();
		Connection con = SudentJDBCcon.getconnection();
		System.out.println("please enter sno ");
		sbj.setId(sc.nextInt());
		System.out.println("please enter name");
		sbj.setName(sc.next());
		System.out.println("please enter roll number");
		sbj.setRoll(sc.nextInt());
		String sql = "insert into student values(?,?,?)";
		pst = con.prepareStatement(sql);
		pst.setInt(1, sbj.getId());
		pst.setString(2, sbj.getName());
		pst.setInt(3, sbj.getRoll());
		int i = pst.executeUpdate();
		if (i > 0) {
			rs = pst.executeQuery("select * from student");
			System.out.println("id \t name \t rollnum ");
			while (rs.next()) {
				sbj.setId(rs.getInt(1));
				sbj.setName(rs.getString(2));
				sbj.setRoll(rs.getInt(3));

				System.out.println(sbj.getId() + "\t" + sbj.getName() + "\t" + sbj.getRoll());
			}
		}
		try {

		} finally {
			con.close();
		}
	}

	public void updatedata(StudentBeanJDBC std) {
		String query = "update student  set name=? where id=?";
		Connection con = SudentJDBCcon.getconnection();
		try {
			pst = con.prepareStatement(query);
			pst.setString(1, std.getName());
			pst.setInt(2, std.getId());
			int i = pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void display() {
		String sql = "select * from student";
		Connection con = SudentJDBCcon.getconnection();
		try {
			Statement st = con.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}