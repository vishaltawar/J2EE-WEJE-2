package com.jspider.servlets_1.classes;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DateServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		resp.setHeader("Refresh","15");
		Date date=new Date();
		PrintWriter printWriter=resp.getWriter();
		printWriter.println("<h1>" + date + "</h1>");
	}
}
