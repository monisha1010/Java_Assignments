package com.jsp6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteDao {
	public void delete(String id) 
	{
		
	String url="jdbc:mysql://localhost:3306/jsp";
	String username="root";
	String password="14011997";
	 try {
		 Class.forName("com.mysql.jdbc.Driver");
		 Connection con = DriverManager.getConnection(url, username, password);
		
		
		 String sql="delete from emp where (id=?)";
	     PreparedStatement ps = con.prepareStatement(sql);
	     ps.setString(1, id);
	     ps.executeUpdate();
	     
		 }catch (ClassNotFoundException | SQLException e) 
		 {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch(NullPointerException e) {
				e.printStackTrace();
			}
	}
}
