package com.sevval;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
//		int k=(int)req.getAttribute("k");
//		k=k*k;
//		
//		PrintWriter out=res.getWriter();
//		out.println("result:"+k);
	
		System.out.println("sq called");//syso ctrl+tab
		int k=Integer.parseInt(req.getParameter("k"));
		k=k*k;
		PrintWriter out=res.getWriter();
		out.println("result:"+k);
	}

}
