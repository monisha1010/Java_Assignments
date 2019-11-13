package com.jsp6;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ViewTrainingDetail")
public class ViewTrainingDetail extends HttpServlet {

    public ViewTrainingDetail() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		String activeData[][] = null;
		out.println("List of employees");
		out.print("<br>");
		out.print("<br>");
		HttpSession session=request.getSession();
		if (session.getAttribute("SaveList") == null) {
			System.out.println("no data");
		} else
		{
		activeData = (String[][]) session.getAttribute("SaveList");
		}
		out.print("<table border='1' width='70%'");  
		 out.print("<tr><th>Id</th><th>Name</th><th>Designation</th><th>Delete</th></tr>");
		 for(int i=0; i<activeData.length; i++)
		    {
		    	out.println("<tr><td>"+activeData[i][0]+"</td><td>"+activeData[i][1]+"</td><td>"+activeData[i][2]+"</td><td><a href='Delete?id="+activeData[i][0]+"'>Delete</a></td></tr>");
	}
		 out.print("</table>"); 
}
}
