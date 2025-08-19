package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/firstserver")
public class firstserver extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int n1= Integer.parseInt(req.getParameter("num1"));
		//creation of a session object
		HttpSession session= req.getSession();
		session.setAttribute("k", n1); //access that session from any servlet
		//we have to redirect the user that to go to second server
		res.sendRedirect("secondserver");
		
		
		
		
		
	}

}  
