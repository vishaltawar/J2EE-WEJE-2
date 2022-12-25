package src.com.jspider.jdbc.main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Jdbc3Delete {
	private static Connection connection;
	private static Statement statement;
	private static Properties properties = new Properties();
	private static FileReader fileReader;
	private static int result;

	public static void main(String[] args) {
		try {
			// 1st
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				fileReader = new FileReader("D:\\Vishal Tawar\\WEJE-2\\jdbc\\resources\\db_info.properties");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			try {
				properties.load(fileReader);
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				// 2nd
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weje2", properties);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				// 3rd
				statement = connection.createStatement();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {

				result = statement.executeUpdate("delete from student where id=5");
				// 4th
				System.out.println(result + " ros(s) deleted");
			} catch (SQLException e) {
				e.printStackTrace();
			}

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
			// 5th
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

}
