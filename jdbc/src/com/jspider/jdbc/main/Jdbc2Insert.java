package src.com.jspider.jdbc.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc2Insert {
	private static Connection connection;
	private static Statement statement;
	private static int result;

	public static void main(String[] args) {
		try {
			// Step:- 1 Load the Driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				// Step:- 2 Open the connection
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weje2", "root", "root");
				// step :-3
				statement = connection.createStatement();
				result = statement.executeUpdate("insert into student values(122,'Tejas','tejas@123') ");
				System.out.println(result + " row(s) affected");

			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {

			try {
				connection.close();
			} catch (SQLException e1) {

				e1.printStackTrace();
			}
			try {
				statement.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}

		}
	}

}
