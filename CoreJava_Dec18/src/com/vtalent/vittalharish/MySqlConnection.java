package com.vtalent.vittalharish;
import java.sql.*;

public class MySqlConnection {
private static MySqlConnection mysqlcon = new MySqlConnection();
private Connection con;

private MySqlConnection() {
try {
Class.forName("com.mysql.jdbc.Driver");
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedatabase", "root", "17011994");
} catch (Exception e) {
System.out.println(e);
}
}

public static Connection getInstance() {
return mysqlcon.con;

}
}
