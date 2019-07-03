package com.vtalent.naresh;
import java.sql.*;

public class DBOperations {
	 	Connection con;
	 	Statement st;
	 	PreparedStatement pst;
		DBOperations(){
			con=MySqlConnector.getInstance();
					 }
		
	public    int insertData(Employee emp)  {
		 System.out.println("insertdata");	
		//String query1="insert into employdata values("+emp.getEmployId()+",'"+emp.getEmployname()+"',"+emp.getEmployPackage()+")";
		
		 String query="insert into employdata values(?,?,?,?)";
		int result=0;
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			//con=DriverManager.getConnection("jdbc:mysql://localhost:3306/EmployeeData","root","root");
			
			pst=con.prepareStatement(query);
				pst.setInt(1,emp.getEmployId());
			 pst.setString(2,emp.getEmployname());
			 pst.setDouble(3,emp.getEmployPackage());
			 pst.setDouble(4, emp.getEmploySalary());
			// String query1="update"
			 //	st=con.createStatement();
				//st.executeUpdate(query1);
			result=pst.executeUpdate();
			System.out.println("reached");
		//st=con.createStatement();
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
		return result;
		
	}
	
	
	
	
}
