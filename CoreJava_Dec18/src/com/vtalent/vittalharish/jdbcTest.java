package com.vtalent.vittalharish;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbcTest {

public static void main(String[] args) {
try {
Class.forName("com.mysql.jdbc.Driver");
// gt connection to DB
String user = "root";
String pwd = "17011994";
Connection con = DriverManager.getConnection(
"jdbc:mysql://localhost:3306/employeedatabase", "root", "17011994");
Statement stmt = con.createStatement();
ResultSet rs = stmt.executeQuery("select * from employee_table");
while (rs.next()) {
//String name = rs.getString("empName");
System.out.println(rs.getInt(1)+ " " +rs.getString(2)+ " "+ rs.getDouble(3)+" "+ rs.getDouble(4));
}

} catch (Exception e) {
e.printStackTrace();
}

}
}
