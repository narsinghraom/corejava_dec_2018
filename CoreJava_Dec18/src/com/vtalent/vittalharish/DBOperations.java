package com.vtalent.vittalharish;
import java.sql.*;

public class DBOperations {
  Connection connection;
  Statement statement;
  PreparedStatement pstatement;
  ResultSet rset;
  public DBOperations() {
	  connection = MySqlConnection.getInstance();
}
  public int InsertDataWithStatement(Employee employee){
	  String query = "insert into employee_table values("+employee.getEmployeeID()+",'"
              +employee.getEmployeeName()+"',"+employee.getEmployeeSalary()+","+employee.getEmpolyeeMobileNumber()+" )";
	  int result=0;
	  try{
		  statement = connection.createStatement();
		  result = statement.executeUpdate(query);
	  }
	  catch(Exception e){
		  System.out.println(e);
	  }
	  return result;
  }
}
