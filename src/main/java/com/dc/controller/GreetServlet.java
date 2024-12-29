package com.dc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(description = "test servlet", urlPatterns = "/greet")
public class GreetServlet extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
//		PrintWriter out = res.getWriter();
//		res.setContentType("text/html");//mime content type
//		out.println("<h1>Greet from Test Servlet</h1>");
		String myName = req.getParameter("name");
//		out.println("<h2>Hello!" +myName+"</h2>");
//		LocalTime currentDate = LocalTime.now();
//		out.println("<h4>It is now" +currentDate+"</h4>");
//		out.close();
		
		req.setAttribute("name", myName);
		RequestDispatcher rd = req.getRequestDispatcher("Greet.jsp");
		rd.forward(req, res);
		
	}
	
}

