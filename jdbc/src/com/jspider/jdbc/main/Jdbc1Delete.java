package src.com.jspider.jdbc.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc1Delete {
	private static Connection connection;
	private static Statement statement;
	private static int result;

	public static void main(String[] args) {
		try {
			// Step:- 1 Load the Driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				// Step:- 2 Open the connection
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weje2?user=root&password=123456");
				// step :-3
				statement = connection.createStatement();
				result = statement.executeUpdate("delete from student where id=1 ");
				// step :- 4
				System.out.println(result + " row(s) affected");

			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			// step :- 5
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
