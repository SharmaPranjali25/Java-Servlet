package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/secondserver")
public class secondserver extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		//how we get value from session: for that it must have session object also
		HttpSession session= req.getSession();
		int num1 = (int)session.getAttribute("k");
		int sq= num1*num1;
		PrintWriter out= res.getWriter();
		out.print("Square of the number send by server1 is: "+ sq);
		
		
		
	}

}
