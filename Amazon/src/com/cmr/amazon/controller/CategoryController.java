package com.cmr.amazon.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cmr.amazon.dao.CategoryDAO;
import com.cmr.amazon.entity.Category;

@WebServlet("/CategoryController")
public class CategoryController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String catname=request.getParameter("catname");
		Category cat=new Category();
		cat.setCatname(catname);
		
		CategoryDAO catdao=new CategoryDAO();
		Boolean success=catdao.save(cat);
		RequestDispatcher rd=request.getRequestDispatcher("addCategory.html");
		if(success) {
			rd.include(request, response);
			out.println("<center><h3><font color='green'>Category Added Successfully</font></h3></center>");
		}
		else {
			rd.include(request, response);
			out.println("<center><h3><font color='red'> Sorry! Unable to Add  Category ..Try Again</font></h3></center>");
			
		}
	}

}
