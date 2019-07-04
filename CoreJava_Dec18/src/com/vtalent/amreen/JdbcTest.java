package com.vtalent.amreen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcTest {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			// gt connection to DB
			String user = "root";
			String pwd = "Aaira502";
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/mysql", "root", "Aaira502");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from tesing");
			while (rs.next()) {
				String name = rs.getString("NAME");
				System.out.println(name);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
