package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class GetValuesDao {
String activeData[][];
boolean value=true;
public void generateTable() {
	String url = "jdbc:mysql://localhost:3306/jsp";
	String username = "root";
	String password = "14011997";
	
	String sql = "select * from emp";
	
	
	String id,name,designation;
	int totalRows = 0;	
	
	try {
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection(url, username, password);
	Statement st = con.createStatement();
	ResultSet rs = st.executeQuery(sql);
	
	rs.last();
	totalRows = rs.getRow();
	rs.first();
	
	activeData = new String[totalRows][3];
	for(int i=0; i<totalRows; i++)
	{
		id=rs.getString(1);
		name=rs.getString(2);
		designation=rs.getString(3);
		
		activeData[i][0]=id;
	    activeData[i][1]=name;
		activeData[i][2]=designation;
		
		rs.next();
	}
	}
	catch (Exception e) {
		System.out.println(e);
	}
}
public boolean showTable() {
	if(value) {
		generateTable();
		value=false;
		return true;
	}
	else 
		return false;
}
public String[][] showActiveData() {
	
	return activeData;
}
}
