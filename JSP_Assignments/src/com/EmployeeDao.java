package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeDao {
public void add(String id, String name, String designation)
{

	String url="jdbc:mysql://localhost:3306/jsp";
	String username="root";
	String password="14011997";
	
	 try {
		 Class.forName("com.mysql.jdbc.Driver");
		 Connection con = DriverManager.getConnection(url, username, password);
	         String sql="insert into emp values(?,?,?)";
	         PreparedStatement ps = con.prepareStatement(sql);
	         ps.setString(1,id);
	         ps.setString(2, name);
	         ps.setString(3, designation);
	         ps.executeUpdate(); // execute it on test database
	         System.out.println("successfuly inserted");
	         ps.close();
	         con.close();
	 }
	 catch (ClassNotFoundException | SQLException e) 
     {
     	// TODO Auto-generated catch block
     	e.printStackTrace();
     }
     catch(NullPointerException e) {
     	e.printStackTrace();
     }
}
}
