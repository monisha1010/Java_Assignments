package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsp6.DeleteDao;


@WebServlet("/Delete")
public class Delete extends HttpServlet {
	
    public Delete() {
        super();
        // TODO Auto-generated constructor stub
    }

    String dataList[][];
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String tId=request.getParameter("id");
		DeleteDao obj=new DeleteDao();
		obj.delete(tId);
		GetValuesDao object=new GetValuesDao();
		HttpSession session=request.getSession();
		 session.removeAttribute("SaveList");
		 object.showTable();
		 dataList=object.showActiveData();
		    session.setAttribute("SaveList", dataList);
		    response.sendRedirect("ViewTrainingDetail");
	}
}
