package com.vtalent.srihari;



import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;

public class DBOperations {
	Connection con;
		PreparedStatement pst;
	int rest; 
	ResultSet result;
	
	DBOperations (){
		//con =MySqlConnection.getInstance();
		con=(Connection) MySqlConnection.getInstance();
	}

	/*public int insertDataStatement(StudentEmp stdemp1) {
		
		String query ="insert into stdemp values ("+ stdemp1.getSno()+",'" + stdemp1.getStdempname()+",'"+stdemp1.getStdempmobile()+",'"+stdemp1.getStdempsalary()+")";
			try {
			st =con.creaeteStatment();
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
	
	public List<StudentEmp> Search(){
		
		String qurey="select * from stdemp"; 
		
		StudentEmp std = null;
		List<StudentEmp> lstd = new ArrayList<>(); 
		
		try {
			pst =con.prepareStatement(qurey);
			result =pst.executeQuery();
			while (result.next()) {
				StudentEmp std1 = new StudentEmp();
				std1.setSno(result.getInt(1));
				std1.setStdempname(result.getString(2));
				std1.setStdempmobile(result.getDouble(3));
				std1.setStdempsalary(result.getDouble(4));
				lstd.add(std);
			}
		}
		catch(Exception e) {
			
		}
		return lstd;
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
