package com.jsp6;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.EmployeeDao;
import com.GetValuesDao;


@WebServlet("/Connection")
public class Connection extends HttpServlet {
	
    public Connection() {
        super();
        // TODO Auto-generated constructor stub
    }


    String dataList[][];
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		
		out.println("Hello World");
		HttpSession session=request.getSession();
		String id=(String) session.getAttribute("ID") ;
		String name=(String) session.getAttribute("NAME");
		String designation=(String) session.getAttribute("DESIGNATION");
		EmployeeDao obj=new EmployeeDao();
		obj.add(id, name, designation);
		
		GetValuesDao object=new GetValuesDao();
		
		boolean count = true;
		 if(count)
		 {
			object.showTable();
			dataList=object.showActiveData();
			 session.setAttribute("SaveList", dataList);
			 response.sendRedirect("ViewTrainingDetail");
		 }	 
		 else
		 {
			 response.sendRedirect("index.html");
		 }
	}

}
