package src.com.jspider.jdbc.main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Jdbc3Select {
	private static Connection connection;
	private static Statement statement;
	private static ResultSet resultSet;
	private static Properties properties = new Properties();
	private static FileReader fileReader;

	public static void main(String[] args) {
		try {
			// Step:- 1 Load the Driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				fileReader = new FileReader("D:\\Vishal Tawar\\WEJE-2\\jdbc\\resources\\db_info.properties");
				try {
					properties.load(fileReader);
				} catch (IOException e) {

					e.printStackTrace();
				}
			} catch (FileNotFoundException e1) {

				e1.printStackTrace();
			}
			try {
				// Step:- 2 Open the connection
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weje2", properties);
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
