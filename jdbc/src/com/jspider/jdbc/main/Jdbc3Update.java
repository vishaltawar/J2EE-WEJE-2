package src.com.jspider.jdbc.main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Jdbc3Update {
	private static Connection connection;
	private static Statement statement;
	private static Properties properties = new Properties();
	private static int result;
	private static FileReader fileReader;

	public static void main(String[] args) {
		try {
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
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weje2", properties);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				statement = connection.createStatement();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				result = statement.executeUpdate("update student set email='aakash@123' where id=2");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			System.out.println(result + " ros(s) Updated");
		} catch (ClassNotFoundException e) {
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

}
