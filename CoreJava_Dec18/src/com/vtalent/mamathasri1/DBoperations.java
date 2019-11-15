
package com.vtalent.mamathasri1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashSet;
import java.util.Scanner;

public class DBoperations {
	public int InsertData() {
		int r=0;
		try{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the UserName:::");
			String username=sc.nextLine();
			System.out.println("Enter the PassWord:::");
			String password=sc.nextLine();
			System.out.println("Enter the Email::::::");
			String email=sc.nextLine();
			System.out.println("Enter the Eid::::::::");
			int eid=sc.nextInt();
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Vtalent9\",\"root\",\"root");
			PreparedStatement pstmt=conn.prepareStatement("insert into employee(id,email,username,password,) values(?,?,?,?)");
			pstmt.setString(2, username);
			pstmt.setString(4, password);
			pstmt.setString(3, email);
			pstmt.setInt(1, eid);
			int i=pstmt.executeUpdate();
			System.out.println(i);
			if(i==1){
				System.out.println("success");
			}else{
				System.out.println("not success");
			}
		
		
		}catch(Exception e){
			System.out.println(e);
		}
	
		return r;
	}
	
	public int fetchData() {
	int r=0;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("");
			PreparedStatement pstmt=conn.prepareStatement("select * from employee");
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()){
				System.out.println("UserName:::"+rs.getString("username"));
				System.out.println("PassWord:::"+rs.getString("password"));
				System.out.println("Email::::::"+rs.getString("email"));
				System.out.println("Eid::::::::"+rs.getInt("id"));
				System.out.println(" ");
			}			
		}catch(Exception e){
			System.out.println(e);
		}return r;
	}
	public int updateData() {
		int r=0;
		try{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the UserName to Update::");
			String username=sc.nextLine();
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/vtalentDB\\\",\\\"root\\\",\\\"roo");
			PreparedStatement pstmt=conn.prepareStatement("select * from employee");
			ResultSet rs=pstmt.executeQuery();
			HashSet<String> hs=new HashSet<>();
			while(rs.next()){
				hs.add(rs.getString("username"));
				
			}
			if(hs.contains(username)){
				System.out.println("Record Found");
				System.out.println("Enter the Details to Update::");
				System.out.println("Enter the PassWord:::");
				String password=sc.nextLine();
				System.out.println("Enter the Email::::::");
				String email=sc.nextLine();
				System.out.println("Enter the Eid:::::::::");
				int eid=sc.nextInt();
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn1=DriverManager.getConnection("jdbc:mysql://localhost:3306/vtalentDB\\\",\\\"root\\\",\\\"root");
				PreparedStatement pstmt1=conn1.prepareStatement("update employee set password=?,email=?,eid=? where username=?");
				pstmt1.setString(1, password);
				pstmt1.setString(2, email);
				pstmt1.setInt(3, eid);
				pstmt1.setString(4, username);
				int i=pstmt1.executeUpdate();
				if(i==1){
					System.out.println("update success");
				}else{
					System.out.println("not success");
				}	
			}else{
				System.out.println("Record Not Found");
			}
		}catch(Exception e){
			System.out.println(e);
		}return r;
	}

	public int  delete() {
	int r=0;
		try{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the UserName to Delete::");
			String username=sc.nextLine();
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/vtalentDB\\\",\\\"root\\\",\\\"roo");
			PreparedStatement pstmt=conn.prepareStatement("select * from employee");
			ResultSet rs=pstmt.executeQuery();
			HashSet<String> hs=new HashSet<>();
			while(rs.next()){
				hs.add(rs.getString("username"));
				
			}
			if(hs.contains(username)){
				System.out.println("Record Found");
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn1=DriverManager.getConnection("jdbc:mysql://localhost:3306/vtalentDB\\\",\\\"root\\\",\\\"roo");
				PreparedStatement pstmt1=conn1.prepareStatement("delete from employee where username=?");
				pstmt1.setString(1, username);
				int i=pstmt1.executeUpdate();
				if(i==1){
					System.out.println("delete success");
				}else{
					System.out.println("not success");
				}
			}else{
				System.out.println("Record Not Found");
			}
		}catch(Exception e){
			System.out.println(e);
		}return r;
	}
   public static void main(String args[]) {
   DBoperations obj=new DBoperations();
   Scanner sc=new Scanner(System.in);
   for (;;){
		System.out.println("1.InsertData." + '\n' + "2.fetchData"
				+ '\n' + "3.updateData" + '\n' + "4.Delete" +'\n' +"5.Exit");
		int Employe = sc.nextInt();
		switch (Employe) {
		case 1: obj.InsertData();
		break;
		case 2: obj.fetchData();
		break;
		case 3: obj.updateData();
		break;
		case 4: obj.delete();
		break;
		case 5:
			System.exit(0);
		}	
}
}	
}
	