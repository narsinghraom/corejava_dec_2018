package com.vtalent.naresh;
import java.sql.*;

class MySqlConnector  {
	private Connection con;
	
	private static MySqlConnector  mysql=new MySqlConnector ();
		private MySqlConnector () {
			try{  
				Class.forName("com.mysql.jdbc.Driver");  
				  con=DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/EmployeeData","root","root");  
				}
			catch(Exception e){ 
					//System.out.println(e);
				}  
				}  
	 
	
	  public static Connection getInstance() {
		  return mysql.con;
		  }
	   }
  
  
  


