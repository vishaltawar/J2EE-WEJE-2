package src.com.jspider.jdbc.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc1Select {
	private static Connection connection;
	private static Statement statement;
	private static ResultSet resultSet;

	public static void main(String[] args) {
		try {
			// Step:- 1 Load the Driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				// Step:- 2 Open the connection
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weje2?user=root&password=123456");
				statement = connection.createStatement();
				resultSet = statement.executeQuery("select * from student");
				while (resultSet.next()) {
					System.out.println(
							resultSet.getString(1) + " | " + resultSet.getString(2) + " | " + resultSet.getString(3));

				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
			try {
				statement.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
			try {
				resultSet.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
	}
}
