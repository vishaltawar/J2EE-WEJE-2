package com.jspider.studentservlet.student;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentRegistration
 */
@WebServlet("/StudentRegistration")
public class StudentRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Connection connection;
	private static PreparedStatement statement;
	private static String query;
	private static int result;
	private static String driverPath = "com.mysql.cj.jdbc.Driver";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public StudentRegistration() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			Class.forName(driverPath);
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weje2", "root", "root");
			query = "insert into student_form values(?,?,?,?,?,?)";
			statement = connection.prepareStatement(query);
			statement.setString(1, request.getParameter("firstName"));
			statement.setString(2, request.getParameter("lastName"));
			statement.setString(3, request.getParameter("email"));
			statement.setString(4, request.getParameter("gender"));
			statement.setString(5, request.getParameter("mobile"));
			statement.setString(6, request.getParameter("qualification"));
			result = statement.executeUpdate();
			response.setContentType("text/html");
			PrintWriter printWriter = response.getWriter();
			if (result > 0) {
				printWriter.println(
						"<div style=\"background: linear-gradient(rgb(16, 94, 16), rgb(67, 243, 67)); margin:20px auto ; padding: 20px;\">"+"<h1 style=\"color: white\" >" + request.getParameter("firstName") + " 's Detail successfully save in Database.</h1>"+"</div>");
			}else {
				printWriter.println("<h1 style=\"color: red\" > Sorry something is wrong !!! <h1/> "); 
						
			}

		} catch (ClassNotFoundException e) {
			System.out.println("Driver Exception is occure here please check !!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("SQL Exception is occure here please check !!");
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
