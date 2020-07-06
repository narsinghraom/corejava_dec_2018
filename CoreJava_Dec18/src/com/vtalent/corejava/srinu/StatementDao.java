package com.vtalent.corejava.srinu;
import java.sql.Connection;
import java.sql.Statement;
import com.vtalent.corejava.srinu.*;
import com.vtalent.corejava.srinu.*;
import com.vtalent.corejava.srinu.*;
public class StatementDao implements Dao{
	private Connection connection;
	private Statement statement;
	public StatementDao()
	{
		connection=MySqlConnection.getInstanceOfMySql();
	}

	public int createEmployee(Employee employee) {
		int result=0;
	
		String query="insert into employee values("+employee.getEmployeeId()+",'"+employee.getEmployeeName()+"',"+employee.getEmployeeSalary()+"',"
	+employee.getEmployeeMobile()+"',"+employee.getEmployeeAddress()+")";
		try{
		statement=connection.createStatement();
		result=statement.executeUpdate(query);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return result;
	}
	

	public int updateEmployee(Employee employee) {
		int result=0;
				String query="update employee set employeename='"+employee.getEmployeeName()+"',employeeaddress='"+employee.getEmployeeAddress()+"' where employeeid='"+employee.getEmployeeId();
		try{
		statement=connection.createStatement();
		result=statement.executeUpdate(query);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return result;
	}

	public int deleteEmployee(int employeeId) {
		int result=0;
		String query="delete from employee  where employeeid="+employeeId;
try{
statement=connection.createStatement();
result=statement.executeUpdate(query);
}
catch(Exception e)
{
	e.printStackTrace();

		
	}
return result;
	}
}


