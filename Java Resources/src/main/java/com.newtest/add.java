package com.newtest;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class add extends HttpServlet{
public void service(HttpServletRequest req, HttpServletResponse res) throws IOException{
//	int a=(int)req.getAttribute("k"); 
//	
//	PrintWriter out= res.getWriter();
//	out.print("Message Coming from Second Servlet "+ a);
	
	int num=Integer.parseInt(req.getParameter("k"));
	int sq=num*num;
	PrintWriter out= res.getWriter();
	out.print("Square= "+ sq);
	
	
}
}
