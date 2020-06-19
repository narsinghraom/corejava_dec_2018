package com.vtalent.tarun.basics.employee;
import java.sql.*;
class DAOOperations extends Test {
	Connection con;
	Statement stmt;
	PreparedStatement pstmt;
	DAOOperations(){
		con = EmployeeConntn.getInstance();
		}
	public int insertDataWithStatement(Employee emp) {
		int result = 0;
		String q = "insert into employee values(" + emp.getEmployeeID() +",'" +emp.getEmployeeName() +"')";
		try {
			stmt = con.createStatement();
			result = stmt.executeUpdate(q);
			
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return result;
	}
	public int insertDataWithPrepared(Employee emp) {
		int result = 0;
		String q = "insert into employee values (?,?)";
		try {
			pstmt = con.prepareStatement(q);
			pstmt.setInt(1, emp.getEmployeeID());
			pstmt.setString(2, emp.getEmployeeName());
			result = pstmt.executeUpdate();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return result;
	}
	}


