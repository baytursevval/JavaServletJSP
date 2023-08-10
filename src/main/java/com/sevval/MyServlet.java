package com.sevval;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		PrintWriter out=res.getWriter();
		out.print("hi ");
		
		ServletContext ctx=getServletContext();
		String str= ctx.getInitParameter("name");
		out.println(str);
		
		//multiple servers which share the same value;ServletContext
		//different value for different servers;ServletConfig
}
	
}
