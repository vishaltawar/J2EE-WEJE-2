package com.jspider.servlets_1.classes;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Hobbies")
public class Hobbies extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Hobbies() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter printWriter=response.getWriter();
		String[] hobby=request.getParameterValues("hobby");
		printWriter.println("<h2> Your Selected Hobbies are :</h2>");
		for(String hobbies:hobby) {
			printWriter.println(hobbies+"<br>");
		}
	}

}
