package com.newtest;
//FIRST SERVLET
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class message extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException  {
//		int n1= Integer.parseInt(req.getParameter("num1"));
//		int n2= Integer.parseInt(req.getParameter("num2")); 
		//creating response
//		int sum= n1+n2;
		// req.setAttribute("k",sum);
		//want to call another servlet from message servlet
		// RequestDispatcher rd= req.getRequestDispatcher("add");
		//rd.forward(req, res);	
        //PrintWriter out= res.getWriter();
		//out.print(n1+" +"+ n2+ " = "+sum);
		
		//res.sendRedirect("add?k="+sum);	
		//COOKIES
		String n1= req.getParameter("name");
		//to cehck if request already has cooking or not 
		//we use if else 
		PrintWriter out= res.getWriter(); //create printwriter object to just show output
		boolean uservisit=false;
		//array creation of cookie as multiple cookies are coming and then we'll see if our cookie is present in this or not
		Cookie[]  cookies= req.getCookies();
		if(cookies!=null) {
			for(int i=0;i<cookies.length;i++){
				Cookie c= cookies[i];
				//we have to get cookie name or cookie value
				String name=c.getName();
				String val= c.getValue();
				if(name.equals("k")&& val.equals("123")) {
					out.print("Hurrah! Welcome Back "+ n1);
					uservisit=true;
					break;
				}
			}
					
		}
		if(uservisit==false) {
			Cookie c1= new Cookie("k","123");
			res.addCookie(c1);
			out.print("Welcome for First Time "+ n1);
		}

		
		
	}
	

}
