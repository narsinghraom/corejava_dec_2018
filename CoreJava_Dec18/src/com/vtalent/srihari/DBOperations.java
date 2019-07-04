package com.vtalent.srihari;



import java.sql.PreparedStatement;

import com.mysql.jdbc.Connection;

import com.mysql.jdbc.Statement;

public class DBOperations {
	Connection con;
		PreparedStatement pst;
	int rest; 
	DBOperations (){
		//con =MySqlConnection.getInstance();
		con=(Connection) MySqlConnection.getInstance();
	}

	/*public int insertDataStatement(StudentEmp stdemp1) {
		
		String query ="insert into stdemp values ("+ stdemp1.getSno()+",'" + stdemp1.getStdempname()+",'"+stdemp1.getStdempmobile()+",'"+stdemp1.getStdempsalary()+")";
			try {
			st =con.createStatement();
			rest =st.executeUpdate(query); 
		} catch (Exception e) {
			System.out.println(e);
		}
		return rest;}*/
	public int insertDataStatement(StudentEmp stdemp1) {
		String query ="insert into stdemp values(?,?,?,?)";
		try {
			pst =con.prepareStatement(query);
			pst.setInt(1, stdemp1.getSno());
			pst.setString(2, stdemp1.getStdempname());
			pst.setDouble(3, stdemp1.getStdempmobile());
			pst.setDouble(4, stdemp1.getStdempsalary());
			rest =pst.executeUpdate();
			
		}
		catch(Exception e) {
			
		}
		return rest;
	
	}
}
